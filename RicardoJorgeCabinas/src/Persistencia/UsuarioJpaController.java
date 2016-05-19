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
import Modelo.Recarga;
import Modelo.Usuario;
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
public class UsuarioJpaController implements Serializable {

    public UsuarioJpaController() 
    {
        this.emf = Persistence.createEntityManagerFactory("RicardoJorgeCabinasPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Usuario usuario) throws PreexistingEntityException, Exception {
        if (usuario.getVentaMinutosList() == null) {
            usuario.setVentaMinutosList(new ArrayList<VentaMinutos>());
        }
        if (usuario.getAlquilerModemList() == null) {
            usuario.setAlquilerModemList(new ArrayList<AlquilerModem>());
        }
        if (usuario.getRecargaList() == null) {
            usuario.setRecargaList(new ArrayList<Recarga>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<VentaMinutos> attachedVentaMinutosList = new ArrayList<VentaMinutos>();
            for (VentaMinutos ventaMinutosListVentaMinutosToAttach : usuario.getVentaMinutosList()) {
                ventaMinutosListVentaMinutosToAttach = em.getReference(ventaMinutosListVentaMinutosToAttach.getClass(), ventaMinutosListVentaMinutosToAttach.getCodigoventa());
                attachedVentaMinutosList.add(ventaMinutosListVentaMinutosToAttach);
            }
            usuario.setVentaMinutosList(attachedVentaMinutosList);
            List<AlquilerModem> attachedAlquilerModemList = new ArrayList<AlquilerModem>();
            for (AlquilerModem alquilerModemListAlquilerModemToAttach : usuario.getAlquilerModemList()) {
                alquilerModemListAlquilerModemToAttach = em.getReference(alquilerModemListAlquilerModemToAttach.getClass(), alquilerModemListAlquilerModemToAttach.getCodigoalquiler());
                attachedAlquilerModemList.add(alquilerModemListAlquilerModemToAttach);
            }
            usuario.setAlquilerModemList(attachedAlquilerModemList);
            List<Recarga> attachedRecargaList = new ArrayList<Recarga>();
            for (Recarga recargaListRecargaToAttach : usuario.getRecargaList()) {
                recargaListRecargaToAttach = em.getReference(recargaListRecargaToAttach.getClass(), recargaListRecargaToAttach.getCodigorecarga());
                attachedRecargaList.add(recargaListRecargaToAttach);
            }
            usuario.setRecargaList(attachedRecargaList);
            em.persist(usuario);
            for (VentaMinutos ventaMinutosListVentaMinutos : usuario.getVentaMinutosList()) {
                Usuario oldCedulausuarioOfVentaMinutosListVentaMinutos = ventaMinutosListVentaMinutos.getCedulausuario();
                ventaMinutosListVentaMinutos.setCedulausuario(usuario);
                ventaMinutosListVentaMinutos = em.merge(ventaMinutosListVentaMinutos);
                if (oldCedulausuarioOfVentaMinutosListVentaMinutos != null) {
                    oldCedulausuarioOfVentaMinutosListVentaMinutos.getVentaMinutosList().remove(ventaMinutosListVentaMinutos);
                    oldCedulausuarioOfVentaMinutosListVentaMinutos = em.merge(oldCedulausuarioOfVentaMinutosListVentaMinutos);
                }
            }
            for (AlquilerModem alquilerModemListAlquilerModem : usuario.getAlquilerModemList()) {
                Usuario oldCedulausuarioOfAlquilerModemListAlquilerModem = alquilerModemListAlquilerModem.getCedulausuario();
                alquilerModemListAlquilerModem.setCedulausuario(usuario);
                alquilerModemListAlquilerModem = em.merge(alquilerModemListAlquilerModem);
                if (oldCedulausuarioOfAlquilerModemListAlquilerModem != null) {
                    oldCedulausuarioOfAlquilerModemListAlquilerModem.getAlquilerModemList().remove(alquilerModemListAlquilerModem);
                    oldCedulausuarioOfAlquilerModemListAlquilerModem = em.merge(oldCedulausuarioOfAlquilerModemListAlquilerModem);
                }
            }
            for (Recarga recargaListRecarga : usuario.getRecargaList()) {
                Usuario oldCedulausuarioOfRecargaListRecarga = recargaListRecarga.getCedulausuario();
                recargaListRecarga.setCedulausuario(usuario);
                recargaListRecarga = em.merge(recargaListRecarga);
                if (oldCedulausuarioOfRecargaListRecarga != null) {
                    oldCedulausuarioOfRecargaListRecarga.getRecargaList().remove(recargaListRecarga);
                    oldCedulausuarioOfRecargaListRecarga = em.merge(oldCedulausuarioOfRecargaListRecarga);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findUsuario(usuario.getCedulausuario()) != null) {
                throw new PreexistingEntityException("Usuario " + usuario + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Usuario usuario) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Usuario persistentUsuario = em.find(Usuario.class, usuario.getCedulausuario());
            List<VentaMinutos> ventaMinutosListOld = persistentUsuario.getVentaMinutosList();
            List<VentaMinutos> ventaMinutosListNew = usuario.getVentaMinutosList();
            List<AlquilerModem> alquilerModemListOld = persistentUsuario.getAlquilerModemList();
            List<AlquilerModem> alquilerModemListNew = usuario.getAlquilerModemList();
            List<Recarga> recargaListOld = persistentUsuario.getRecargaList();
            List<Recarga> recargaListNew = usuario.getRecargaList();
            List<String> illegalOrphanMessages = null;
            for (VentaMinutos ventaMinutosListOldVentaMinutos : ventaMinutosListOld) {
                if (!ventaMinutosListNew.contains(ventaMinutosListOldVentaMinutos)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain VentaMinutos " + ventaMinutosListOldVentaMinutos + " since its cedulausuario field is not nullable.");
                }
            }
            for (AlquilerModem alquilerModemListOldAlquilerModem : alquilerModemListOld) {
                if (!alquilerModemListNew.contains(alquilerModemListOldAlquilerModem)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain AlquilerModem " + alquilerModemListOldAlquilerModem + " since its cedulausuario field is not nullable.");
                }
            }
            for (Recarga recargaListOldRecarga : recargaListOld) {
                if (!recargaListNew.contains(recargaListOldRecarga)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Recarga " + recargaListOldRecarga + " since its cedulausuario field is not nullable.");
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
            usuario.setVentaMinutosList(ventaMinutosListNew);
            List<AlquilerModem> attachedAlquilerModemListNew = new ArrayList<AlquilerModem>();
            for (AlquilerModem alquilerModemListNewAlquilerModemToAttach : alquilerModemListNew) {
                alquilerModemListNewAlquilerModemToAttach = em.getReference(alquilerModemListNewAlquilerModemToAttach.getClass(), alquilerModemListNewAlquilerModemToAttach.getCodigoalquiler());
                attachedAlquilerModemListNew.add(alquilerModemListNewAlquilerModemToAttach);
            }
            alquilerModemListNew = attachedAlquilerModemListNew;
            usuario.setAlquilerModemList(alquilerModemListNew);
            List<Recarga> attachedRecargaListNew = new ArrayList<Recarga>();
            for (Recarga recargaListNewRecargaToAttach : recargaListNew) {
                recargaListNewRecargaToAttach = em.getReference(recargaListNewRecargaToAttach.getClass(), recargaListNewRecargaToAttach.getCodigorecarga());
                attachedRecargaListNew.add(recargaListNewRecargaToAttach);
            }
            recargaListNew = attachedRecargaListNew;
            usuario.setRecargaList(recargaListNew);
            usuario = em.merge(usuario);
            for (VentaMinutos ventaMinutosListNewVentaMinutos : ventaMinutosListNew) {
                if (!ventaMinutosListOld.contains(ventaMinutosListNewVentaMinutos)) {
                    Usuario oldCedulausuarioOfVentaMinutosListNewVentaMinutos = ventaMinutosListNewVentaMinutos.getCedulausuario();
                    ventaMinutosListNewVentaMinutos.setCedulausuario(usuario);
                    ventaMinutosListNewVentaMinutos = em.merge(ventaMinutosListNewVentaMinutos);
                    if (oldCedulausuarioOfVentaMinutosListNewVentaMinutos != null && !oldCedulausuarioOfVentaMinutosListNewVentaMinutos.equals(usuario)) {
                        oldCedulausuarioOfVentaMinutosListNewVentaMinutos.getVentaMinutosList().remove(ventaMinutosListNewVentaMinutos);
                        oldCedulausuarioOfVentaMinutosListNewVentaMinutos = em.merge(oldCedulausuarioOfVentaMinutosListNewVentaMinutos);
                    }
                }
            }
            for (AlquilerModem alquilerModemListNewAlquilerModem : alquilerModemListNew) {
                if (!alquilerModemListOld.contains(alquilerModemListNewAlquilerModem)) {
                    Usuario oldCedulausuarioOfAlquilerModemListNewAlquilerModem = alquilerModemListNewAlquilerModem.getCedulausuario();
                    alquilerModemListNewAlquilerModem.setCedulausuario(usuario);
                    alquilerModemListNewAlquilerModem = em.merge(alquilerModemListNewAlquilerModem);
                    if (oldCedulausuarioOfAlquilerModemListNewAlquilerModem != null && !oldCedulausuarioOfAlquilerModemListNewAlquilerModem.equals(usuario)) {
                        oldCedulausuarioOfAlquilerModemListNewAlquilerModem.getAlquilerModemList().remove(alquilerModemListNewAlquilerModem);
                        oldCedulausuarioOfAlquilerModemListNewAlquilerModem = em.merge(oldCedulausuarioOfAlquilerModemListNewAlquilerModem);
                    }
                }
            }
            for (Recarga recargaListNewRecarga : recargaListNew) {
                if (!recargaListOld.contains(recargaListNewRecarga)) {
                    Usuario oldCedulausuarioOfRecargaListNewRecarga = recargaListNewRecarga.getCedulausuario();
                    recargaListNewRecarga.setCedulausuario(usuario);
                    recargaListNewRecarga = em.merge(recargaListNewRecarga);
                    if (oldCedulausuarioOfRecargaListNewRecarga != null && !oldCedulausuarioOfRecargaListNewRecarga.equals(usuario)) {
                        oldCedulausuarioOfRecargaListNewRecarga.getRecargaList().remove(recargaListNewRecarga);
                        oldCedulausuarioOfRecargaListNewRecarga = em.merge(oldCedulausuarioOfRecargaListNewRecarga);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = usuario.getCedulausuario();
                if (findUsuario(id) == null) {
                    throw new NonexistentEntityException("The usuario with id " + id + " no longer exists.");
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
            Usuario usuario;
            try {
                usuario = em.getReference(Usuario.class, id);
                usuario.getCedulausuario();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The usuario with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<VentaMinutos> ventaMinutosListOrphanCheck = usuario.getVentaMinutosList();
            for (VentaMinutos ventaMinutosListOrphanCheckVentaMinutos : ventaMinutosListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Usuario (" + usuario + ") cannot be destroyed since the VentaMinutos " + ventaMinutosListOrphanCheckVentaMinutos + " in its ventaMinutosList field has a non-nullable cedulausuario field.");
            }
            List<AlquilerModem> alquilerModemListOrphanCheck = usuario.getAlquilerModemList();
            for (AlquilerModem alquilerModemListOrphanCheckAlquilerModem : alquilerModemListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Usuario (" + usuario + ") cannot be destroyed since the AlquilerModem " + alquilerModemListOrphanCheckAlquilerModem + " in its alquilerModemList field has a non-nullable cedulausuario field.");
            }
            List<Recarga> recargaListOrphanCheck = usuario.getRecargaList();
            for (Recarga recargaListOrphanCheckRecarga : recargaListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Usuario (" + usuario + ") cannot be destroyed since the Recarga " + recargaListOrphanCheckRecarga + " in its recargaList field has a non-nullable cedulausuario field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(usuario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Usuario> findUsuarioEntities() {
        return findUsuarioEntities(true, -1, -1);
    }

    public List<Usuario> findUsuarioEntities(int maxResults, int firstResult) {
        return findUsuarioEntities(false, maxResults, firstResult);
    }

    private List<Usuario> findUsuarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Usuario.class));
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

    public Usuario findUsuario(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Usuario.class, id);
        } finally {
            em.close();
        }
    }
    
    public List<Usuario> findUsuarioName(String nombreUsuario)
    {
        String consulta = "SELECT * FROM usuario WHERE nombreusuario LIKE '%"+nombreUsuario+"%'";
        EntityManager em = getEntityManager(); 
        Query query = em.createNativeQuery(consulta,Usuario.class);
        return query.getResultList();
    }

    public int getUsuarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Usuario> rt = cq.from(Usuario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
