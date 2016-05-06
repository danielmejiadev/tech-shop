package Persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Modelo.Cliente;
import Modelo.PlanMinutos;
import Modelo.Usuario;
import Modelo.Promocion;
import Modelo.VentaMinutos;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Daniel
 */
public class VentaMinutosJpaController implements Serializable {

    public VentaMinutosJpaController() 
    {
        this.emf = Persistence.createEntityManagerFactory("RicardoJorgeCabinasPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(VentaMinutos ventaMinutos) {
        if (ventaMinutos.getPromocionList() == null) {
            ventaMinutos.setPromocionList(new ArrayList<Promocion>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente cedulacliente = ventaMinutos.getCedulacliente();
            if (cedulacliente != null) {
                cedulacliente = em.getReference(cedulacliente.getClass(), cedulacliente.getCedulacliente());
                ventaMinutos.setCedulacliente(cedulacliente);
            }
            PlanMinutos codigoplan = ventaMinutos.getCodigoplan();
            if (codigoplan != null) {
                codigoplan = em.getReference(codigoplan.getClass(), codigoplan.getCodigoplan());
                ventaMinutos.setCodigoplan(codigoplan);
            }
            Usuario cedulausuario = ventaMinutos.getCedulausuario();
            if (cedulausuario != null) {
                cedulausuario = em.getReference(cedulausuario.getClass(), cedulausuario.getCedulausuario());
                ventaMinutos.setCedulausuario(cedulausuario);
            }
            List<Promocion> attachedPromocionList = new ArrayList<Promocion>();
            for (Promocion promocionListPromocionToAttach : ventaMinutos.getPromocionList()) {
                promocionListPromocionToAttach = em.getReference(promocionListPromocionToAttach.getClass(), promocionListPromocionToAttach.getCodigopromocion());
                attachedPromocionList.add(promocionListPromocionToAttach);
            }
            ventaMinutos.setPromocionList(attachedPromocionList);
            em.persist(ventaMinutos);
            if (cedulacliente != null) {
                cedulacliente.getVentaMinutosList().add(ventaMinutos);
                cedulacliente = em.merge(cedulacliente);
            }
            if (codigoplan != null) {
                codigoplan.getVentaMinutosList().add(ventaMinutos);
                codigoplan = em.merge(codigoplan);
            }
            if (cedulausuario != null) {
                cedulausuario.getVentaMinutosList().add(ventaMinutos);
                cedulausuario = em.merge(cedulausuario);
            }
            for (Promocion promocionListPromocion : ventaMinutos.getPromocionList()) {
                promocionListPromocion.getVentaMinutosList().add(ventaMinutos);
                promocionListPromocion = em.merge(promocionListPromocion);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(VentaMinutos ventaMinutos) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            VentaMinutos persistentVentaMinutos = em.find(VentaMinutos.class, ventaMinutos.getCodigoventa());
            Cliente cedulaclienteOld = persistentVentaMinutos.getCedulacliente();
            Cliente cedulaclienteNew = ventaMinutos.getCedulacliente();
            PlanMinutos codigoplanOld = persistentVentaMinutos.getCodigoplan();
            PlanMinutos codigoplanNew = ventaMinutos.getCodigoplan();
            Usuario cedulausuarioOld = persistentVentaMinutos.getCedulausuario();
            Usuario cedulausuarioNew = ventaMinutos.getCedulausuario();
            List<Promocion> promocionListOld = persistentVentaMinutos.getPromocionList();
            List<Promocion> promocionListNew = ventaMinutos.getPromocionList();
            if (cedulaclienteNew != null) {
                cedulaclienteNew = em.getReference(cedulaclienteNew.getClass(), cedulaclienteNew.getCedulacliente());
                ventaMinutos.setCedulacliente(cedulaclienteNew);
            }
            if (codigoplanNew != null) {
                codigoplanNew = em.getReference(codigoplanNew.getClass(), codigoplanNew.getCodigoplan());
                ventaMinutos.setCodigoplan(codigoplanNew);
            }
            if (cedulausuarioNew != null) {
                cedulausuarioNew = em.getReference(cedulausuarioNew.getClass(), cedulausuarioNew.getCedulausuario());
                ventaMinutos.setCedulausuario(cedulausuarioNew);
            }
            List<Promocion> attachedPromocionListNew = new ArrayList<Promocion>();
            for (Promocion promocionListNewPromocionToAttach : promocionListNew) {
                promocionListNewPromocionToAttach = em.getReference(promocionListNewPromocionToAttach.getClass(), promocionListNewPromocionToAttach.getCodigopromocion());
                attachedPromocionListNew.add(promocionListNewPromocionToAttach);
            }
            promocionListNew = attachedPromocionListNew;
            ventaMinutos.setPromocionList(promocionListNew);
            ventaMinutos = em.merge(ventaMinutos);
            if (cedulaclienteOld != null && !cedulaclienteOld.equals(cedulaclienteNew)) {
                cedulaclienteOld.getVentaMinutosList().remove(ventaMinutos);
                cedulaclienteOld = em.merge(cedulaclienteOld);
            }
            if (cedulaclienteNew != null && !cedulaclienteNew.equals(cedulaclienteOld)) {
                cedulaclienteNew.getVentaMinutosList().add(ventaMinutos);
                cedulaclienteNew = em.merge(cedulaclienteNew);
            }
            if (codigoplanOld != null && !codigoplanOld.equals(codigoplanNew)) {
                codigoplanOld.getVentaMinutosList().remove(ventaMinutos);
                codigoplanOld = em.merge(codigoplanOld);
            }
            if (codigoplanNew != null && !codigoplanNew.equals(codigoplanOld)) {
                codigoplanNew.getVentaMinutosList().add(ventaMinutos);
                codigoplanNew = em.merge(codigoplanNew);
            }
            if (cedulausuarioOld != null && !cedulausuarioOld.equals(cedulausuarioNew)) {
                cedulausuarioOld.getVentaMinutosList().remove(ventaMinutos);
                cedulausuarioOld = em.merge(cedulausuarioOld);
            }
            if (cedulausuarioNew != null && !cedulausuarioNew.equals(cedulausuarioOld)) {
                cedulausuarioNew.getVentaMinutosList().add(ventaMinutos);
                cedulausuarioNew = em.merge(cedulausuarioNew);
            }
            for (Promocion promocionListOldPromocion : promocionListOld) {
                if (!promocionListNew.contains(promocionListOldPromocion)) {
                    promocionListOldPromocion.getVentaMinutosList().remove(ventaMinutos);
                    promocionListOldPromocion = em.merge(promocionListOldPromocion);
                }
            }
            for (Promocion promocionListNewPromocion : promocionListNew) {
                if (!promocionListOld.contains(promocionListNewPromocion)) {
                    promocionListNewPromocion.getVentaMinutosList().add(ventaMinutos);
                    promocionListNewPromocion = em.merge(promocionListNewPromocion);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = ventaMinutos.getCodigoventa();
                if (findVentaMinutos(id) == null) {
                    throw new NonexistentEntityException("The ventaMinutos with id " + id + " no longer exists.");
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
            VentaMinutos ventaMinutos;
            try {
                ventaMinutos = em.getReference(VentaMinutos.class, id);
                ventaMinutos.getCodigoventa();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The ventaMinutos with id " + id + " no longer exists.", enfe);
            }
            Cliente cedulacliente = ventaMinutos.getCedulacliente();
            if (cedulacliente != null) {
                cedulacliente.getVentaMinutosList().remove(ventaMinutos);
                cedulacliente = em.merge(cedulacliente);
            }
            PlanMinutos codigoplan = ventaMinutos.getCodigoplan();
            if (codigoplan != null) {
                codigoplan.getVentaMinutosList().remove(ventaMinutos);
                codigoplan = em.merge(codigoplan);
            }
            Usuario cedulausuario = ventaMinutos.getCedulausuario();
            if (cedulausuario != null) {
                cedulausuario.getVentaMinutosList().remove(ventaMinutos);
                cedulausuario = em.merge(cedulausuario);
            }
            List<Promocion> promocionList = ventaMinutos.getPromocionList();
            for (Promocion promocionListPromocion : promocionList) {
                promocionListPromocion.getVentaMinutosList().remove(ventaMinutos);
                promocionListPromocion = em.merge(promocionListPromocion);
            }
            em.remove(ventaMinutos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<VentaMinutos> findVentaMinutosEntities() {
        return findVentaMinutosEntities(true, -1, -1);
    }

    public List<VentaMinutos> findVentaMinutosEntities(int maxResults, int firstResult) {
        return findVentaMinutosEntities(false, maxResults, firstResult);
    }

    private List<VentaMinutos> findVentaMinutosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(VentaMinutos.class));
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

    public VentaMinutos findVentaMinutos(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(VentaMinutos.class, id);
        } finally {
            em.close();
        }
    }

    public int getVentaMinutosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<VentaMinutos> rt = cq.from(VentaMinutos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
