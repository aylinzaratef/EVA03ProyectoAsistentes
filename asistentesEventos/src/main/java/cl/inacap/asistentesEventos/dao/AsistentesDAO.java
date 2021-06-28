package cl.inacap.asistentesEventos.dao;

import cl.inacap.asistentesEventos.model.Asistentes;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

public class AsistentesDAO implements AsistentesDAOInterface{
    
    @PersistenceContext(unitName = "ASISTENTES_PU")
    private EntityManager em;

    @Transactional(Transactional.TxType.REQUIRED)
    public boolean insertAsistente(Asistentes asistente) {
        try {
            em.persist(asistente);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }

    @Override
    public List<Asistentes> getAllAsistentes() {
        return em.createNamedQuery("Asistentes.findAll").getResultList();
    }

    @Override
    public List<Asistentes> getAllAsistentesFiltro(String filtro) {
        Query query = em.createQuery("select a from Asistentes a where a.estado = :filtro ");
        query.setParameter("filtro", filtro);
        return query.getResultList();
    }
    
}
