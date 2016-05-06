package Persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Modelo.PlanMinutos;
import Modelo.Recarga;
import Modelo.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Daniel
 */
public class RecargaJpaController implements Serializable {

    public RecargaJpaController()
    {
        this.emf = Persistence.createEntityManagerFactory("RicardoJorgeCabinasPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Recarga recarga) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            PlanMinutos codigoplan = recarga.getCodigoplan();
            if (codigoplan != null) {
                codigoplan = em.getReference(codigoplan.getClass(), codigoplan.getCodigoplan());
                recarga.setCodigoplan(codigoplan);
            }
            Usuario cedulausuario = recarga.getCedulausuario();
            if (cedulausuario != null) {
                cedulausuario = em.getReference(cedulausuario.getClass(), cedulausuario.getCedulausuario());
                recarga.setCedulausuario(cedulausuario);
            }
            em.persist(recarga);
            if (codigoplan != null) {
                codigoplan.getRecargaList().add(recarga);
                codigoplan = em.merge(codigoplan);
            }
            if (cedulausuario != null) {
                cedulausuario.getRecargaList().add(recarga);
                cedulausuario = em.merge(cedulausuario);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Recarga recarga) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Recarga persistentRecarga = em.find(Recarga.class, recarga.getCodigorecarga());
            PlanMinutos codigoplanOld = persistentRecarga.getCodigoplan();
            PlanMinutos codigoplanNew = recarga.getCodigoplan();
            Usuario cedulausuarioOld = persistentRecarga.getCedulausuario();
            Usuario cedulausuarioNew = recarga.getCedulausuario();
            if (codigoplanNew != null) {
                codigoplanNew = em.getReference(codigoplanNew.getClass(), codigoplanNew.getCodigoplan());
                recarga.setCodigoplan(codigoplanNew);
            }
            if (cedulausuarioNew != null) {
                cedulausuarioNew = em.getReference(cedulausuarioNew.getClass(), cedulausuarioNew.getCedulausuario());
                recarga.setCedulausuario(cedulausuarioNew);
            }
            recarga = em.merge(recarga);
            if (codigoplanOld != null && !codigoplanOld.equals(codigoplanNew)) {
                codigoplanOld.getRecargaList().remove(recarga);
                codigoplanOld = em.merge(codigoplanOld);
            }
            if (codigoplanNew != null && !codigoplanNew.equals(codigoplanOld)) {
                codigoplanNew.getRecargaList().add(recarga);
                codigoplanNew = em.merge(codigoplanNew);
            }
            if (cedulausuarioOld != null && !cedulausuarioOld.equals(cedulausuarioNew)) {
                cedulausuarioOld.getRecargaList().remove(recarga);
                cedulausuarioOld = em.merge(cedulausuarioOld);
            }
            if (cedulausuarioNew != null && !cedulausuarioNew.equals(cedulausuarioOld)) {
                cedulausuarioNew.getRecargaList().add(recarga);
                cedulausuarioNew = em.merge(cedulausuarioNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = recarga.getCodigorecarga();
                if (findRecarga(id) == null) {
                    throw new NonexistentEntityException("The recarga with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Recarga recarga;
            try {
                recarga = em.getReference(Recarga.class, id);
                recarga.getCodigorecarga();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The recarga with id " + id + " no longer exists.", enfe);
            }
            PlanMinutos codigoplan = recarga.getCodigoplan();
            if (codigoplan != null) {
                codigoplan.getRecargaList().remove(recarga);
                codigoplan = em.merge(codigoplan);
            }
            Usuario cedulausuario = recarga.getCedulausuario();
            if (cedulausuario != null) {
                cedulausuario.getRecargaList().remove(recarga);
                cedulausuario = em.merge(cedulausuario);
            }
            em.remove(recarga);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Recarga> findRecargaEntities() {
        return findRecargaEntities(true, -1, -1);
    }

    public List<Recarga> findRecargaEntities(int maxResults, int firstResult) {
        return findRecargaEntities(false, maxResults, firstResult);
    }

    private List<Recarga> findRecargaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Recarga.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Recarga findRecarga(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Recarga.class, id);
        } finally {
            em.close();
        }
    }

    public int getRecargaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Recarga> rt = cq.from(Recarga.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
