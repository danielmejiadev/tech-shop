package Persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Modelo.VentaMinutos;
import java.util.ArrayList;
import java.util.List;
import Modelo.AlquilerModem;
import Modelo.Promocion;
import Persistencia.exceptions.NonexistentEntityException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import static javax.persistence.Persistence.createEntityManagerFactory;


public class PromocionJpaController implements Serializable {

    public PromocionJpaController() 
    {
        this.emf = createEntityManagerFactory("RicardoJorgeCabinasPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    /*
        Metodo para realizar una búsqueda de promociones en su respectiva tabla de base de datos
        Entrada: String con parámetros de búsqueda
        Salida: List<Promocion> lista de promociones que coincidan con el parámetro ingresado
    */
    public List<Promocion> findPromocionDescripcion(String descripcion){
        String consulta = "SELECT * FROM promocion WHERE descripcion LIKE '%"+descripcion+"%'";
        EntityManager em = getEntityManager(); 
        Query query = em.createNativeQuery(consulta,Promocion.class);
        return query.getResultList();
    }

    public void create(Promocion promocion) {
        if (promocion.getVentaMinutosList() == null) {
            promocion.setVentaMinutosList(new ArrayList<VentaMinutos>());
        }
        if (promocion.getAlquilerModemList() == null) {
            promocion.setAlquilerModemList(new ArrayList<AlquilerModem>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<VentaMinutos> attachedVentaMinutosList = new ArrayList<VentaMinutos>();
            for (VentaMinutos ventaMinutosListVentaMinutosToAttach : promocion.getVentaMinutosList()) {
                ventaMinutosListVentaMinutosToAttach = em.getReference(ventaMinutosListVentaMinutosToAttach.getClass(), ventaMinutosListVentaMinutosToAttach.getCodigoventa());
                attachedVentaMinutosList.add(ventaMinutosListVentaMinutosToAttach);
            }
            promocion.setVentaMinutosList(attachedVentaMinutosList);
            List<AlquilerModem> attachedAlquilerModemList = new ArrayList<AlquilerModem>();
            for (AlquilerModem alquilerModemListAlquilerModemToAttach : promocion.getAlquilerModemList()) {
                alquilerModemListAlquilerModemToAttach = em.getReference(alquilerModemListAlquilerModemToAttach.getClass(), alquilerModemListAlquilerModemToAttach.getCodigoalquiler());
                attachedAlquilerModemList.add(alquilerModemListAlquilerModemToAttach);
            }
            promocion.setAlquilerModemList(attachedAlquilerModemList);
            em.persist(promocion);
            for (VentaMinutos ventaMinutosListVentaMinutos : promocion.getVentaMinutosList()) {
                ventaMinutosListVentaMinutos.getPromocionList().add(promocion);
                ventaMinutosListVentaMinutos = em.merge(ventaMinutosListVentaMinutos);
            }
            for (AlquilerModem alquilerModemListAlquilerModem : promocion.getAlquilerModemList()) {
                alquilerModemListAlquilerModem.getPromocionList().add(promocion);
                alquilerModemListAlquilerModem = em.merge(alquilerModemListAlquilerModem);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Promocion promocion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Promocion persistentPromocion = em.find(Promocion.class, promocion.getCodigopromocion());
            List<VentaMinutos> ventaMinutosListOld = persistentPromocion.getVentaMinutosList();
            List<VentaMinutos> ventaMinutosListNew = promocion.getVentaMinutosList();
            List<AlquilerModem> alquilerModemListOld = persistentPromocion.getAlquilerModemList();
            List<AlquilerModem> alquilerModemListNew = promocion.getAlquilerModemList();
            List<VentaMinutos> attachedVentaMinutosListNew = new ArrayList<VentaMinutos>();
            for (VentaMinutos ventaMinutosListNewVentaMinutosToAttach : ventaMinutosListNew) {
                ventaMinutosListNewVentaMinutosToAttach = em.getReference(ventaMinutosListNewVentaMinutosToAttach.getClass(), ventaMinutosListNewVentaMinutosToAttach.getCodigoventa());
                attachedVentaMinutosListNew.add(ventaMinutosListNewVentaMinutosToAttach);
            }
            ventaMinutosListNew = attachedVentaMinutosListNew;
            promocion.setVentaMinutosList(ventaMinutosListNew);
            List<AlquilerModem> attachedAlquilerModemListNew = new ArrayList<AlquilerModem>();
            for (AlquilerModem alquilerModemListNewAlquilerModemToAttach : alquilerModemListNew) {
                alquilerModemListNewAlquilerModemToAttach = em.getReference(alquilerModemListNewAlquilerModemToAttach.getClass(), alquilerModemListNewAlquilerModemToAttach.getCodigoalquiler());
                attachedAlquilerModemListNew.add(alquilerModemListNewAlquilerModemToAttach);
            }
            alquilerModemListNew = attachedAlquilerModemListNew;
            promocion.setAlquilerModemList(alquilerModemListNew);
            promocion = em.merge(promocion);
            for (VentaMinutos ventaMinutosListOldVentaMinutos : ventaMinutosListOld) {
                if (!ventaMinutosListNew.contains(ventaMinutosListOldVentaMinutos)) {
                    ventaMinutosListOldVentaMinutos.getPromocionList().remove(promocion);
                    ventaMinutosListOldVentaMinutos = em.merge(ventaMinutosListOldVentaMinutos);
                }
            }
            for (VentaMinutos ventaMinutosListNewVentaMinutos : ventaMinutosListNew) {
                if (!ventaMinutosListOld.contains(ventaMinutosListNewVentaMinutos)) {
                    ventaMinutosListNewVentaMinutos.getPromocionList().add(promocion);
                    ventaMinutosListNewVentaMinutos = em.merge(ventaMinutosListNewVentaMinutos);
                }
            }
            for (AlquilerModem alquilerModemListOldAlquilerModem : alquilerModemListOld) {
                if (!alquilerModemListNew.contains(alquilerModemListOldAlquilerModem)) {
                    alquilerModemListOldAlquilerModem.getPromocionList().remove(promocion);
                    alquilerModemListOldAlquilerModem = em.merge(alquilerModemListOldAlquilerModem);
                }
            }
            for (AlquilerModem alquilerModemListNewAlquilerModem : alquilerModemListNew) {
                if (!alquilerModemListOld.contains(alquilerModemListNewAlquilerModem)) {
                    alquilerModemListNewAlquilerModem.getPromocionList().add(promocion);
                    alquilerModemListNewAlquilerModem = em.merge(alquilerModemListNewAlquilerModem);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = promocion.getCodigopromocion();
                if (findPromocion(id) == null) {
                    throw new NonexistentEntityException("The promocion with id " + id + " no longer exists.");
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
            Promocion promocion;
            try {
                promocion = em.getReference(Promocion.class, id);
                promocion.getCodigopromocion();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The promocion with id " + id + " no longer exists.", enfe);
            }
            List<VentaMinutos> ventaMinutosList = promocion.getVentaMinutosList();
            for (VentaMinutos ventaMinutosListVentaMinutos : ventaMinutosList) {
                ventaMinutosListVentaMinutos.getPromocionList().remove(promocion);
                ventaMinutosListVentaMinutos = em.merge(ventaMinutosListVentaMinutos);
            }
            List<AlquilerModem> alquilerModemList = promocion.getAlquilerModemList();
            for (AlquilerModem alquilerModemListAlquilerModem : alquilerModemList) {
                alquilerModemListAlquilerModem.getPromocionList().remove(promocion);
                alquilerModemListAlquilerModem = em.merge(alquilerModemListAlquilerModem);
            }
            em.remove(promocion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Promocion> findPromocionEntities() {
        return findPromocionEntities(true, -1, -1);
    }

    public List<Promocion> findPromocionEntities(int maxResults, int firstResult) {
        return findPromocionEntities(false, maxResults, firstResult);
    }

    private List<Promocion> findPromocionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Promocion.class));
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

    public Promocion findPromocion(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Promocion.class, id);
        } finally {
            em.close();
        }
    }

    public int getPromocionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Promocion> rt = cq.from(Promocion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    //Trae las promociones activas del tipo del parámetro: tipoPromo
    public List<Promocion> findPromocionesActivas(String tipoPromo){
       String consulta = "SELECT * FROM promocion WHERE estadopromocion = 1 and tipopromocion = '"+tipoPromo+"'";
       EntityManager em = getEntityManager(); 
       Query query = em.createNativeQuery(consulta,Promocion.class);
       return query.getResultList();
   }
    
    //Trae todas las promociones activas
   public List<Promocion> findPromocionesActivas(){
       String consulta = "SELECT * FROM promocion WHERE estadopromocion = 1";
       EntityManager em = getEntityManager(); 
       Query query = em.createNativeQuery(consulta,Promocion.class);
       return query.getResultList();
   }
}
