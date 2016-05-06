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
import Modelo.Cliente;
import Persistencia.exceptions.IllegalOrphanException;
import Persistencia.exceptions.NonexistentEntityException;
import Persistencia.exceptions.PreexistingEntityException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Daniel
 */
public class ClienteJpaController implements Serializable {

    public ClienteJpaController() 
    {
        this.emf = Persistence.createEntityManagerFactory("RicardoJorgeCabinasPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cliente cliente) throws PreexistingEntityException, Exception {
        if (cliente.getVentaMinutosList() == null) {
            cliente.setVentaMinutosList(new ArrayList<VentaMinutos>());
        }
        if (cliente.getAlquilerModemList() == null) {
            cliente.setAlquilerModemList(new ArrayList<AlquilerModem>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<VentaMinutos> attachedVentaMinutosList = new ArrayList<VentaMinutos>();
            for (VentaMinutos ventaMinutosListVentaMinutosToAttach : cliente.getVentaMinutosList()) {
                ventaMinutosListVentaMinutosToAttach = em.getReference(ventaMinutosListVentaMinutosToAttach.getClass(), ventaMinutosListVentaMinutosToAttach.getCodigoventa());
                attachedVentaMinutosList.add(ventaMinutosListVentaMinutosToAttach);
            }
            cliente.setVentaMinutosList(attachedVentaMinutosList);
            List<AlquilerModem> attachedAlquilerModemList = new ArrayList<AlquilerModem>();
            for (AlquilerModem alquilerModemListAlquilerModemToAttach : cliente.getAlquilerModemList()) {
                alquilerModemListAlquilerModemToAttach = em.getReference(alquilerModemListAlquilerModemToAttach.getClass(), alquilerModemListAlquilerModemToAttach.getCodigoalquiler());
                attachedAlquilerModemList.add(alquilerModemListAlquilerModemToAttach);
            }
            cliente.setAlquilerModemList(attachedAlquilerModemList);
            em.persist(cliente);
            for (VentaMinutos ventaMinutosListVentaMinutos : cliente.getVentaMinutosList()) {
                Cliente oldCedulaclienteOfVentaMinutosListVentaMinutos = ventaMinutosListVentaMinutos.getCedulacliente();
                ventaMinutosListVentaMinutos.setCedulacliente(cliente);
                ventaMinutosListVentaMinutos = em.merge(ventaMinutosListVentaMinutos);
                if (oldCedulaclienteOfVentaMinutosListVentaMinutos != null) {
                    oldCedulaclienteOfVentaMinutosListVentaMinutos.getVentaMinutosList().remove(ventaMinutosListVentaMinutos);
                    oldCedulaclienteOfVentaMinutosListVentaMinutos = em.merge(oldCedulaclienteOfVentaMinutosListVentaMinutos);
                }
            }
            for (AlquilerModem alquilerModemListAlquilerModem : cliente.getAlquilerModemList()) {
                Cliente oldCedulaclienteOfAlquilerModemListAlquilerModem = alquilerModemListAlquilerModem.getCedulacliente();
                alquilerModemListAlquilerModem.setCedulacliente(cliente);
                alquilerModemListAlquilerModem = em.merge(alquilerModemListAlquilerModem);
                if (oldCedulaclienteOfAlquilerModemListAlquilerModem != null) {
                    oldCedulaclienteOfAlquilerModemListAlquilerModem.getAlquilerModemList().remove(alquilerModemListAlquilerModem);
                    oldCedulaclienteOfAlquilerModemListAlquilerModem = em.merge(oldCedulaclienteOfAlquilerModemListAlquilerModem);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findCliente(cliente.getCedulacliente()) != null) {
                throw new PreexistingEntityException("Cliente " + cliente + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cliente cliente) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente persistentCliente = em.find(Cliente.class, cliente.getCedulacliente());
            List<VentaMinutos> ventaMinutosListOld = persistentCliente.getVentaMinutosList();
            List<VentaMinutos> ventaMinutosListNew = cliente.getVentaMinutosList();
            List<AlquilerModem> alquilerModemListOld = persistentCliente.getAlquilerModemList();
            List<AlquilerModem> alquilerModemListNew = cliente.getAlquilerModemList();
            List<String> illegalOrphanMessages = null;
            for (VentaMinutos ventaMinutosListOldVentaMinutos : ventaMinutosListOld) {
                if (!ventaMinutosListNew.contains(ventaMinutosListOldVentaMinutos)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain VentaMinutos " + ventaMinutosListOldVentaMinutos + " since its cedulacliente field is not nullable.");
                }
            }
            for (AlquilerModem alquilerModemListOldAlquilerModem : alquilerModemListOld) {
                if (!alquilerModemListNew.contains(alquilerModemListOldAlquilerModem)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain AlquilerModem " + alquilerModemListOldAlquilerModem + " since its cedulacliente field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            List<VentaMinutos> attachedVentaMinutosListNew = new ArrayList<VentaMinutos>();
            for (VentaMinutos ventaMinutosListNewVentaMinutosToAttach : ventaMinutosListNew) {
                ventaMinutosListNewVentaMinutosToAttach = em.getReference(ventaMinutosListNewVentaMinutosToAttach.getClass(), ventaMinutosListNewVentaMinutosToAttach.getCodigoventa());
                attachedVentaMinutosListNew.add(ventaMinutosListNewVentaMinutosToAttach);
            }
            ventaMinutosListNew = attachedVentaMinutosListNew;
            cliente.setVentaMinutosList(ventaMinutosListNew);
            List<AlquilerModem> attachedAlquilerModemListNew = new ArrayList<AlquilerModem>();
            for (AlquilerModem alquilerModemListNewAlquilerModemToAttach : alquilerModemListNew) {
                alquilerModemListNewAlquilerModemToAttach = em.getReference(alquilerModemListNewAlquilerModemToAttach.getClass(), alquilerModemListNewAlquilerModemToAttach.getCodigoalquiler());
                attachedAlquilerModemListNew.add(alquilerModemListNewAlquilerModemToAttach);
            }
            alquilerModemListNew = attachedAlquilerModemListNew;
            cliente.setAlquilerModemList(alquilerModemListNew);
            cliente = em.merge(cliente);
            for (VentaMinutos ventaMinutosListNewVentaMinutos : ventaMinutosListNew) {
                if (!ventaMinutosListOld.contains(ventaMinutosListNewVentaMinutos)) {
                    Cliente oldCedulaclienteOfVentaMinutosListNewVentaMinutos = ventaMinutosListNewVentaMinutos.getCedulacliente();
                    ventaMinutosListNewVentaMinutos.setCedulacliente(cliente);
                    ventaMinutosListNewVentaMinutos = em.merge(ventaMinutosListNewVentaMinutos);
                    if (oldCedulaclienteOfVentaMinutosListNewVentaMinutos != null && !oldCedulaclienteOfVentaMinutosListNewVentaMinutos.equals(cliente)) {
                        oldCedulaclienteOfVentaMinutosListNewVentaMinutos.getVentaMinutosList().remove(ventaMinutosListNewVentaMinutos);
                        oldCedulaclienteOfVentaMinutosListNewVentaMinutos = em.merge(oldCedulaclienteOfVentaMinutosListNewVentaMinutos);
                    }
                }
            }
            for (AlquilerModem alquilerModemListNewAlquilerModem : alquilerModemListNew) {
                if (!alquilerModemListOld.contains(alquilerModemListNewAlquilerModem)) {
                    Cliente oldCedulaclienteOfAlquilerModemListNewAlquilerModem = alquilerModemListNewAlquilerModem.getCedulacliente();
                    alquilerModemListNewAlquilerModem.setCedulacliente(cliente);
                    alquilerModemListNewAlquilerModem = em.merge(alquilerModemListNewAlquilerModem);
                    if (oldCedulaclienteOfAlquilerModemListNewAlquilerModem != null && !oldCedulaclienteOfAlquilerModemListNewAlquilerModem.equals(cliente)) {
                        oldCedulaclienteOfAlquilerModemListNewAlquilerModem.getAlquilerModemList().remove(alquilerModemListNewAlquilerModem);
                        oldCedulaclienteOfAlquilerModemListNewAlquilerModem = em.merge(oldCedulaclienteOfAlquilerModemListNewAlquilerModem);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = cliente.getCedulacliente();
                if (findCliente(id) == null) {
                    throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws IllegalOrphanException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente cliente;
            try {
                cliente = em.getReference(Cliente.class, id);
                cliente.getCedulacliente();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<VentaMinutos> ventaMinutosListOrphanCheck = cliente.getVentaMinutosList();
            for (VentaMinutos ventaMinutosListOrphanCheckVentaMinutos : ventaMinutosListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Cliente (" + cliente + ") cannot be destroyed since the VentaMinutos " + ventaMinutosListOrphanCheckVentaMinutos + " in its ventaMinutosList field has a non-nullable cedulacliente field.");
            }
            List<AlquilerModem> alquilerModemListOrphanCheck = cliente.getAlquilerModemList();
            for (AlquilerModem alquilerModemListOrphanCheckAlquilerModem : alquilerModemListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Cliente (" + cliente + ") cannot be destroyed since the AlquilerModem " + alquilerModemListOrphanCheckAlquilerModem + " in its alquilerModemList field has a non-nullable cedulacliente field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(cliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cliente> findClienteEntities() {
        return findClienteEntities(true, -1, -1);
    }

    public List<Cliente> findClienteEntities(int maxResults, int firstResult) {
        return findClienteEntities(false, maxResults, firstResult);
    }

    private List<Cliente> findClienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cliente.class));
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

    public Cliente findCliente(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cliente.class, id);
        } finally {
            em.close();
        }
    }

    public int getClienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cliente> rt = cq.from(Cliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
