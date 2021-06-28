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


@WebServlet(name = "MostrarAsistentesServlet", urlPatterns = {"/MostrarAsistentes"})
public class MostrarAsistentesServlet extends HttpServlet {

    @Inject
    AsistentesControllerInterfaces asistenteController;

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Asistentes> asistentes = new ArrayList<>();
        String estado = request.getParameter("estado-select");
        if(estado != null){
            asistentes = asistenteController.listarAsistentesFiltro(estado);
        }else{
            asistentes = asistenteController.listarAsistentes();
        }
        
        
        request.setAttribute("asistentes", asistentes);
        request.getRequestDispatcher("/mostrarAsistentes.jsp").forward(request, response);
    }
    

}
