package Persistencia;

import Modelo.AlquilerModem;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Modelo.Cliente;
import Modelo.UsbModem;
import Modelo.Usuario;
import Modelo.Promocion;
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
public class AlquilerModemJpaController implements Serializable {

    public AlquilerModemJpaController() 
    {
        this.emf = Persistence.createEntityManagerFactory("RicardoJorgeCabinasPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public void create(AlquilerModem alquilerModem) {
        if (alquilerModem.getPromocionList() == null) {
            alquilerModem.setPromocionList(new ArrayList<Promocion>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente cedulacliente = alquilerModem.getCedulacliente();
            if (cedulacliente != null) {
                cedulacliente = em.getReference(cedulacliente.getClass(), cedulacliente.getCedulacliente());
                alquilerModem.setCedulacliente(cedulacliente);
            }
            UsbModem codigomodem = alquilerModem.getCodigomodem();
            if (codigomodem != null) {
                codigomodem = em.getReference(codigomodem.getClass(), codigomodem.getCodigomodem());
                alquilerModem.setCodigomodem(codigomodem);
            }
            Usuario cedulausuario = alquilerModem.getCedulausuario();
            if (cedulausuario != null) {
                cedulausuario = em.getReference(cedulausuario.getClass(), cedulausuario.getCedulausuario());
                alquilerModem.setCedulausuario(cedulausuario);
            }
            List<Promocion> attachedPromocionList = new ArrayList<Promocion>();
            for (Promocion promocionListPromocionToAttach : alquilerModem.getPromocionList()) {
                promocionListPromocionToAttach = em.getReference(promocionListPromocionToAttach.getClass(), promocionListPromocionToAttach.getCodigopromocion());
                attachedPromocionList.add(promocionListPromocionToAttach);
            }
            alquilerModem.setPromocionList(attachedPromocionList);
            em.persist(alquilerModem);
            if (cedulacliente != null) {
                cedulacliente.getAlquilerModemList().add(alquilerModem);
                cedulacliente = em.merge(cedulacliente);
            }
            if (codigomodem != null) {
                codigomodem.getAlquilerModemList().add(alquilerModem);
                codigomodem = em.merge(codigomodem);
            }
            if (cedulausuario != null) {
                cedulausuario.getAlquilerModemList().add(alquilerModem);
                cedulausuario = em.merge(cedulausuario);
            }
            for (Promocion promocionListPromocion : alquilerModem.getPromocionList()) {
                promocionListPromocion.getAlquilerModemList().add(alquilerModem);
                promocionListPromocion = em.merge(promocionListPromocion);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(AlquilerModem alquilerModem) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            AlquilerModem persistentAlquilerModem = em.find(AlquilerModem.class, alquilerModem.getCodigoalquiler());
            Cliente cedulaclienteOld = persistentAlquilerModem.getCedulacliente();
            Cliente cedulaclienteNew = alquilerModem.getCedulacliente();
            UsbModem codigomodemOld = persistentAlquilerModem.getCodigomodem();
            UsbModem codigomodemNew = alquilerModem.getCodigomodem();
            Usuario cedulausuarioOld = persistentAlquilerModem.getCedulausuario();
            Usuario cedulausuarioNew = alquilerModem.getCedulausuario();
            List<Promocion> promocionListOld = persistentAlquilerModem.getPromocionList();
            List<Promocion> promocionListNew = alquilerModem.getPromocionList();
            if (cedulaclienteNew != null) {
                cedulaclienteNew = em.getReference(cedulaclienteNew.getClass(), cedulaclienteNew.getCedulacliente());
                alquilerModem.setCedulacliente(cedulaclienteNew);
            }
            if (codigomodemNew != null) {
                codigomodemNew = em.getReference(codigomodemNew.getClass(), codigomodemNew.getCodigomodem());
                alquilerModem.setCodigomodem(codigomodemNew);
            }
            if (cedulausuarioNew != null) {
                cedulausuarioNew = em.getReference(cedulausuarioNew.getClass(), cedulausuarioNew.getCedulausuario());
                alquilerModem.setCedulausuario(cedulausuarioNew);
            }
            List<Promocion> attachedPromocionListNew = new ArrayList<Promocion>();
            for (Promocion promocionListNewPromocionToAttach : promocionListNew) {
                promocionListNewPromocionToAttach = em.getReference(promocionListNewPromocionToAttach.getClass(), promocionListNewPromocionToAttach.getCodigopromocion());
                attachedPromocionListNew.add(promocionListNewPromocionToAttach);
            }
            promocionListNew = attachedPromocionListNew;
            alquilerModem.setPromocionList(promocionListNew);
            alquilerModem = em.merge(alquilerModem);
            if (cedulaclienteOld != null && !cedulaclienteOld.equals(cedulaclienteNew)) {
                cedulaclienteOld.getAlquilerModemList().remove(alquilerModem);
                cedulaclienteOld = em.merge(cedulaclienteOld);
            }
            if (cedulaclienteNew != null && !cedulaclienteNew.equals(cedulaclienteOld)) {
                cedulaclienteNew.getAlquilerModemList().add(alquilerModem);
                cedulaclienteNew = em.merge(cedulaclienteNew);
            }
            if (codigomodemOld != null && !codigomodemOld.equals(codigomodemNew)) {
                codigomodemOld.getAlquilerModemList().remove(alquilerModem);
                codigomodemOld = em.merge(codigomodemOld);
            }
            if (codigomodemNew != null && !codigomodemNew.equals(codigomodemOld)) {
                codigomodemNew.getAlquilerModemList().add(alquilerModem);
                codigomodemNew = em.merge(codigomodemNew);
            }
            if (cedulausuarioOld != null && !cedulausuarioOld.equals(cedulausuarioNew)) {
                cedulausuarioOld.getAlquilerModemList().remove(alquilerModem);
                cedulausuarioOld = em.merge(cedulausuarioOld);
            }
            if (cedulausuarioNew != null && !cedulausuarioNew.equals(cedulausuarioOld)) {
                cedulausuarioNew.getAlquilerModemList().add(alquilerModem);
                cedulausuarioNew = em.merge(cedulausuarioNew);
            }
            for (Promocion promocionListOldPromocion : promocionListOld) {
                if (!promocionListNew.contains(promocionListOldPromocion)) {
                    promocionListOldPromocion.getAlquilerModemList().remove(alquilerModem);
                    promocionListOldPromocion = em.merge(promocionListOldPromocion);
                }
            }
            for (Promocion promocionListNewPromocion : promocionListNew) {
                if (!promocionListOld.contains(promocionListNewPromocion)) {
                    promocionListNewPromocion.getAlquilerModemList().add(alquilerModem);
                    promocionListNewPromocion = em.merge(promocionListNewPromocion);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = alquilerModem.getCodigoalquiler();
                if (findAlquilerModem(id) == null) {
                    throw new NonexistentEntityException("The alquilerModem with id " + id + " no longer exists.");
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
            AlquilerModem alquilerModem;
            try {
                alquilerModem = em.getReference(AlquilerModem.class, id);
                alquilerModem.getCodigoalquiler();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The alquilerModem with id " + id + " no longer exists.", enfe);
            }
            Cliente cedulacliente = alquilerModem.getCedulacliente();
            if (cedulacliente != null) {
                cedulacliente.getAlquilerModemList().remove(alquilerModem);
                cedulacliente = em.merge(cedulacliente);
            }
            UsbModem codigomodem = alquilerModem.getCodigomodem();
            if (codigomodem != null) {
                codigomodem.getAlquilerModemList().remove(alquilerModem);
                codigomodem = em.merge(codigomodem);
            }
            Usuario cedulausuario = alquilerModem.getCedulausuario();
            if (cedulausuario != null) {
                cedulausuario.getAlquilerModemList().remove(alquilerModem);
                cedulausuario = em.merge(cedulausuario);
            }
            List<Promocion> promocionList = alquilerModem.getPromocionList();
            for (Promocion promocionListPromocion : promocionList) {
                promocionListPromocion.getAlquilerModemList().remove(alquilerModem);
                promocionListPromocion = em.merge(promocionListPromocion);
            }
            em.remove(alquilerModem);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<AlquilerModem> findAlquilerModemEntities() {
        return findAlquilerModemEntities(true, -1, -1);
    }

    public List<AlquilerModem> findAlquilerModemEntities(int maxResults, int firstResult) {
        return findAlquilerModemEntities(false, maxResults, firstResult);
    }

    private List<AlquilerModem> findAlquilerModemEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(AlquilerModem.class));
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

    public AlquilerModem findAlquilerModem(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(AlquilerModem.class, id);
        } finally {
            em.close();
        }
    }

    public int getAlquilerModemCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<AlquilerModem> rt = cq.from(AlquilerModem.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
