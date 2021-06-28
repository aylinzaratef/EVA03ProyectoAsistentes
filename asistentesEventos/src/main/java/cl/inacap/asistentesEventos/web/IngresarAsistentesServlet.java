package cl.inacap.asistentesEventos.web;

import cl.inacap.asistentesEventos.controller.AsistentesControllerInterfaces;
import cl.inacap.asistentesEventos.model.Asistentes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "IngresarAsistentesServlet", urlPatterns = {"/IngresarAsistentes"})
public class IngresarAsistentesServlet extends HttpServlet {
    
    @Inject
    AsistentesControllerInterfaces asistenteController;
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/agregarAsistente.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        List<String> errores = new ArrayList<>();

        String rut = request.getParameter("rut-txt").trim();
        if (rut.isEmpty()) {
                errores.add("Debe ingresar un RUT.");
        }
        String nombre = request.getParameter("nombre-txt").trim();
        if (nombre.isEmpty()) {
                errores.add("Debe ingresar un nombre.");
        }

        String apellido = request.getParameter("apellido-txt").trim();
        if (apellido.isEmpty()) {
                errores.add("Debe ingresar un apellido.");

        }
        
        int edad = 0;
        try {
            edad = Integer.parseInt(request.getParameter("edad-txt"));
        } catch (Exception e) {
            errores.add("Debe ingresar una edad");
        }

        String empresa = request.getParameter("empresa-txt").trim();
        if (empresa.isEmpty() || empresa.length() <= 6 ) {
                errores.add("Debe ingresar una empresa");
        }
        
        
        String region = request.getParameter("region-select");
        String estado = request.getParameter("estado-select");
        
        if (errores.isEmpty()) {
			
            Asistentes asistente = new Asistentes();
            asistente.setRut(rut);
            asistente.setNombre(nombre);
            asistente.setApellido(apellido);
            asistente.setEdad(edad);
            asistente.setEmpresa(empresa);
            asistente.setEstado(estado);
            asistente.setRegion(region);
            try {
                boolean resultado = asistenteController.registrarAsistente(asistente);
            } catch (Exception e) {
                errores.add("El RUT ingresado ya se encuentra registrado.");
            }

        } else {
            request.setAttribute("errores", errores);
        }
        
		if (!errores.isEmpty()) {

			doGet(request, response);
		} else {
			response.sendRedirect("MostrarAsistentes");
		}
        
        
            
        
    }

}
