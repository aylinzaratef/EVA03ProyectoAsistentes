package cl.inacap.asistentesEventos.controller;

import cl.inacap.asistentesEventos.dao.AsistentesDAOInterface;
import cl.inacap.asistentesEventos.model.Asistentes;
import java.util.List;
import javax.inject.Inject;


public class AsistentesController implements AsistentesControllerInterfaces{
    
    @Inject
    private AsistentesDAOInterface asistentesDAO;

    @Override
    public boolean registrarAsistente(Asistentes asistente) {
        return asistentesDAO.insertAsistente(asistente);
    }

    @Override
    public List<Asistentes> listarAsistentes() {
        return asistentesDAO.getAllAsistentes();
    }

    @Override
    public List<Asistentes> listarAsistentesFiltro(String estado) {
        return asistentesDAO.getAllAsistentesFiltro(estado);
    }
    
}
