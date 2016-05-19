package Persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Modelo.AlquilerModem;
import Modelo.UsbModem;
import Persistencia.exceptions.IllegalOrphanException;
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
public class UsbModemJpaController implements Serializable {

    public UsbModemJpaController() 
    {
        this.emf = Persistence.createEntityManagerFactory("RicardoJorgeCabinasPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(UsbModem usbModem) {
        if (usbModem.getAlquilerModemList() == null) {
            usbModem.setAlquilerModemList(new ArrayList<AlquilerModem>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<AlquilerModem> attachedAlquilerModemList = new ArrayList<AlquilerModem>();
            for (AlquilerModem alquilerModemListAlquilerModemToAttach : usbModem.getAlquilerModemList()) {
                alquilerModemListAlquilerModemToAttach = em.getReference(alquilerModemListAlquilerModemToAttach.getClass(), alquilerModemListAlquilerModemToAttach.getCodigoalquiler());
                attachedAlquilerModemList.add(alquilerModemListAlquilerModemToAttach);
            }
            usbModem.setAlquilerModemList(attachedAlquilerModemList);
            em.persist(usbModem);
            for (AlquilerModem alquilerModemListAlquilerModem : usbModem.getAlquilerModemList()) {
                UsbModem oldCodigomodemOfAlquilerModemListAlquilerModem = alquilerModemListAlquilerModem.getCodigomodem();
                alquilerModemListAlquilerModem.setCodigomodem(usbModem);
                alquilerModemListAlquilerModem = em.merge(alquilerModemListAlquilerModem);
                if (oldCodigomodemOfAlquilerModemListAlquilerModem != null) {
                    oldCodigomodemOfAlquilerModemListAlquilerModem.getAlquilerModemList().remove(alquilerModemListAlquilerModem);
                    oldCodigomodemOfAlquilerModemListAlquilerModem = em.merge(oldCodigomodemOfAlquilerModemListAlquilerModem);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(UsbModem usbModem) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            UsbModem persistentUsbModem = em.find(UsbModem.class, usbModem.getCodigomodem());
            List<AlquilerModem> alquilerModemListOld = persistentUsbModem.getAlquilerModemList();
            List<AlquilerModem> alquilerModemListNew = usbModem.getAlquilerModemList();
            List<String> illegalOrphanMessages = null;
            for (AlquilerModem alquilerModemListOldAlquilerModem : alquilerModemListOld) {
                if (!alquilerModemListNew.contains(alquilerModemListOldAlquilerModem)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain AlquilerModem " + alquilerModemListOldAlquilerModem + " since its codigomodem field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            List<AlquilerModem> attachedAlquilerModemListNew = new ArrayList<AlquilerModem>();
            for (AlquilerModem alquilerModemListNewAlquilerModemToAttach : alquilerModemListNew) {
                alquilerModemListNewAlquilerModemToAttach = em.getReference(alquilerModemListNewAlquilerModemToAttach.getClass(), alquilerModemListNewAlquilerModemToAttach.getCodigoalquiler());
                attachedAlquilerModemListNew.add(alquilerModemListNewAlquilerModemToAttach);
            }
            alquilerModemListNew = attachedAlquilerModemListNew;
            usbModem.setAlquilerModemList(alquilerModemListNew);
            usbModem = em.merge(usbModem);
            for (AlquilerModem alquilerModemListNewAlquilerModem : alquilerModemListNew) {
                if (!alquilerModemListOld.contains(alquilerModemListNewAlquilerModem)) {
                    UsbModem oldCodigomodemOfAlquilerModemListNewAlquilerModem = alquilerModemListNewAlquilerModem.getCodigomodem();
                    alquilerModemListNewAlquilerModem.setCodigomodem(usbModem);
                    alquilerModemListNewAlquilerModem = em.merge(alquilerModemListNewAlquilerModem);
                    if (oldCodigomodemOfAlquilerModemListNewAlquilerModem != null && !oldCodigomodemOfAlquilerModemListNewAlquilerModem.equals(usbModem)) {
                        oldCodigomodemOfAlquilerModemListNewAlquilerModem.getAlquilerModemList().remove(alquilerModemListNewAlquilerModem);
                        oldCodigomodemOfAlquilerModemListNewAlquilerModem = em.merge(oldCodigomodemOfAlquilerModemListNewAlquilerModem);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = usbModem.getCodigomodem();
                if (findUsbModem(id) == null) {
                    throw new NonexistentEntityException("The usbModem with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws IllegalOrphanException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            UsbModem usbModem;
            try {
                usbModem = em.getReference(UsbModem.class, id);
                usbModem.getCodigomodem();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The usbModem with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<AlquilerModem> alquilerModemListOrphanCheck = usbModem.getAlquilerModemList();
            for (AlquilerModem alquilerModemListOrphanCheckAlquilerModem : alquilerModemListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This UsbModem (" + usbModem + ") cannot be destroyed since the AlquilerModem " + alquilerModemListOrphanCheckAlquilerModem + " in its alquilerModemList field has a non-nullable codigomodem field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(usbModem);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<UsbModem> findUsbModemEntities() {
        return findUsbModemEntities(true, -1, -1);
    }

    public List<UsbModem> findUsbModemEntities(int maxResults, int firstResult) {
        return findUsbModemEntities(false, maxResults, firstResult);
    }

    private List<UsbModem> findUsbModemEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(UsbModem.class));
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

    public UsbModem findUsbModem(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(UsbModem.class, id);
        } finally {
            em.close();
        }
    }
    
    /* Método que accede a la base de datos y realiza la búsqueda de modems usando el 
       nombre como parámetro de consulta
       Entrada: nombre de tipo String
       Salida: Lista de objetos de tipo UsbModem 
               Lista vacía si no se encuentra registros que coincidan con el parámetro
    */
    public List<UsbModem> findUsbModemNombre(String nom){
        EntityManager em = getEntityManager();
        try {
            Query modemsNombres = em.createNamedQuery("UsbModem.findByNombremodem");
            modemsNombres.setParameter("nombremodem", nom+"%");
            List<UsbModem> modems = modemsNombres.getResultList();
            return modems;
        }finally{
            em.close();
        }
    }
    
    public int getUsbModemCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<UsbModem> rt = cq.from(UsbModem.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
