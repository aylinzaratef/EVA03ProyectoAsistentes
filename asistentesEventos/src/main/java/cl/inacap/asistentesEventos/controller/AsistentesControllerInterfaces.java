package cl.inacap.asistentesEventos.controller;

import cl.inacap.asistentesEventos.model.Asistentes;
import java.util.List;


public interface AsistentesControllerInterfaces {
    public boolean registrarAsistente(Asistentes asistente);
    public List<Asistentes> listarAsistentes();
    public List<Asistentes> listarAsistentesFiltro(String estado);
}
