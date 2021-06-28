package cl.inacap.asistentesEventos.dao;

import cl.inacap.asistentesEventos.model.Asistentes;
import java.util.List;


public interface AsistentesDAOInterface {
    public boolean insertAsistente(Asistentes asistente);
    public List<Asistentes> getAllAsistentes();
    public List<Asistentes> getAllAsistentesFiltro(String estado);
}
