/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Modelo.PlanMinutos;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import Modelo.VentaMinutos;
import java.util.ArrayList;
import java.util.List;
import Modelo.Recarga;
import Persistencia.exceptions.IllegalOrphanException;
import Persistencia.exceptions.NonexistentEntityException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Daniel
 */
public class PlanMinutosJpaController implements Serializable {

    private EntityManagerFactory emf = null;
    
    public PlanMinutosJpaController() 
    {
        this.emf = Persistence.createEntityManagerFactory("RicardoJorgeCabinasPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(PlanMinutos planMinutos) {
        if (planMinutos.getVentaMinutosList() == null) {
            planMinutos.setVentaMinutosList(new ArrayList<VentaMinutos>());
        }
        if (planMinutos.getRecargaList() == null) {
            planMinutos.setRecargaList(new ArrayList<Recarga>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<VentaMinutos> attachedVentaMinutosList = new ArrayList<VentaMinutos>();
            for (VentaMinutos ventaMinutosListVentaMinutosToAttach : planMinutos.getVentaMinutosList()) {
                ventaMinutosListVentaMinutosToAttach = em.getReference(ventaMinutosListVentaMinutosToAttach.getClass(), ventaMinutosListVentaMinutosToAttach.getCodigoventa());
                attachedVentaMinutosList.add(ventaMinutosListVentaMinutosToAttach);
            }
            planMinutos.setVentaMinutosList(attachedVentaMinutosList);
            List<Recarga> attachedRecargaList = new ArrayList<Recarga>();
            for (Recarga recargaListRecargaToAttach : planMinutos.getRecargaList()) {
                recargaListRecargaToAttach = em.getReference(recargaListRecargaToAttach.getClass(), recargaListRecargaToAttach.getCodigorecarga());
                attachedRecargaList.add(recargaListRecargaToAttach);
            }
            planMinutos.setRecargaList(attachedRecargaList);
            em.persist(planMinutos);
            for (VentaMinutos ventaMinutosListVentaMinutos : planMinutos.getVentaMinutosList()) {
                PlanMinutos oldCodigoplanOfVentaMinutosListVentaMinutos = ventaMinutosListVentaMinutos.getCodigoplan();
                ventaMinutosListVentaMinutos.setCodigoplan(planMinutos);
                ventaMinutosListVentaMinutos = em.merge(ventaMinutosListVentaMinutos);
                if (oldCodigoplanOfVentaMinutosListVentaMinutos != null) {
                    oldCodigoplanOfVentaMinutosListVentaMinutos.getVentaMinutosList().remove(ventaMinutosListVentaMinutos);
                    oldCodigoplanOfVentaMinutosListVentaMinutos = em.merge(oldCodigoplanOfVentaMinutosListVentaMinutos);
                }
            }
            for (Recarga recargaListRecarga : planMinutos.getRecargaList()) {
                PlanMinutos oldCodigoplanOfRecargaListRecarga = recargaListRecarga.getCodigoplan();
                recargaListRecarga.setCodigoplan(planMinutos);
                recargaListRecarga = em.merge(recargaListRecarga);
                if (oldCodigoplanOfRecargaListRecarga != null) {
                    oldCodigoplanOfRecargaListRecarga.getRecargaList().remove(recargaListRecarga);
                    oldCodigoplanOfRecargaListRecarga = em.merge(oldCodigoplanOfRecargaListRecarga);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(PlanMinutos planMinutos) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            PlanMinutos persistentPlanMinutos = em.find(PlanMinutos.class, planMinutos.getCodigoplan());
            List<VentaMinutos> ventaMinutosListOld = persistentPlanMinutos.getVentaMinutosList();
            List<VentaMinutos> ventaMinutosListNew = planMinutos.getVentaMinutosList();
            List<Recarga> recargaListOld = persistentPlanMinutos.getRecargaList();
            List<Recarga> recargaListNew = planMinutos.getRecargaList();
//            List<String> illegalOrphanMessages = null;
//            for (VentaMinutos ventaMinutosListOldVentaMinutos : ventaMinutosListOld) {
//                if (!ventaMinutosListNew.contains(ventaMinutosListOldVentaMinutos)) {
//                    if (illegalOrphanMessages == null) {
//                        illegalOrphanMessages = new ArrayList<String>();
//                    }
//                    illegalOrphanMessages.add("You must retain VentaMinutos " + ventaMinutosListOldVentaMinutos + " since its codigoplan field is not nullable.");
//                }
//            }
//            for (Recarga recargaListOldRecarga : recargaListOld) {
//                if (!recargaListNew.contains(recargaListOldRecarga)) {
//                    if (illegalOrphanMessages == null) {
//                        illegalOrphanMessages = new ArrayList<String>();
//                    }
//                    illegalOrphanMessages.add("You must retain Recarga " + recargaListOldRecarga + " since its codigoplan field is not nullable.");
//                }
//            }
//            if (illegalOrphanMessages != null) {
//                throw new IllegalOrphanException(illegalOrphanMessages);
////            }
            List<VentaMinutos> attachedVentaMinutosListNew = new ArrayList<VentaMinutos>();
            for (VentaMinutos ventaMinutosListNewVentaMinutosToAttach : ventaMinutosListNew) {
                ventaMinutosListNewVentaMinutosToAttach = em.getReference(ventaMinutosListNewVentaMinutosToAttach.getClass(), ventaMinutosListNewVentaMinutosToAttach.getCodigoventa());
                attachedVentaMinutosListNew.add(ventaMinutosListNewVentaMinutosToAttach);
            }
            ventaMinutosListNew = attachedVentaMinutosListNew;
            planMinutos.setVentaMinutosList(ventaMinutosListNew);
            List<Recarga> attachedRecargaListNew = new ArrayList<Recarga>();
            for (Recarga recargaListNewRecargaToAttach : recargaListNew) {
                recargaListNewRecargaToAttach = em.getReference(recargaListNewRecargaToAttach.getClass(), recargaListNewRecargaToAttach.getCodigorecarga());
                attachedRecargaListNew.add(recargaListNewRecargaToAttach);
            }
            recargaListNew = attachedRecargaListNew;
            planMinutos.setRecargaList(recargaListNew);
            planMinutos = em.merge(planMinutos);
            for (VentaMinutos ventaMinutosListNewVentaMinutos : ventaMinutosListNew) {
                if (!ventaMinutosListOld.contains(ventaMinutosListNewVentaMinutos)) {
                    PlanMinutos oldCodigoplanOfVentaMinutosListNewVentaMinutos = ventaMinutosListNewVentaMinutos.getCodigoplan();
                    ventaMinutosListNewVentaMinutos.setCodigoplan(planMinutos);
                    ventaMinutosListNewVentaMinutos = em.merge(ventaMinutosListNewVentaMinutos);
                    if (oldCodigoplanOfVentaMinutosListNewVentaMinutos != null && !oldCodigoplanOfVentaMinutosListNewVentaMinutos.equals(planMinutos)) {
                        oldCodigoplanOfVentaMinutosListNewVentaMinutos.getVentaMinutosList().remove(ventaMinutosListNewVentaMinutos);
                        oldCodigoplanOfVentaMinutosListNewVentaMinutos = em.merge(oldCodigoplanOfVentaMinutosListNewVentaMinutos);
                    }
                }
            }
            for (Recarga recargaListNewRecarga : recargaListNew) {
                if (!recargaListOld.contains(recargaListNewRecarga)) {
                    PlanMinutos oldCodigoplanOfRecargaListNewRecarga = recargaListNewRecarga.getCodigoplan();
                    recargaListNewRecarga.setCodigoplan(planMinutos);
                    recargaListNewRecarga = em.merge(recargaListNewRecarga);
                    if (oldCodigoplanOfRecargaListNewRecarga != null && !oldCodigoplanOfRecargaListNewRecarga.equals(planMinutos)) {
                        oldCodigoplanOfRecargaListNewRecarga.getRecargaList().remove(recargaListNewRecarga);
                        oldCodigoplanOfRecargaListNewRecarga = em.merge(oldCodigoplanOfRecargaListNewRecarga);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = planMinutos.getCodigoplan();
                if (findPlanMinutos(id) == null) {
                    throw new NonexistentEntityException("The planMinutos with id " + id + " no longer exists.");
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
            PlanMinutos planMinutos;
            try {
                planMinutos = em.getReference(PlanMinutos.class, id);
                planMinutos.getCodigoplan();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The planMinutos with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<VentaMinutos> ventaMinutosListOrphanCheck = planMinutos.getVentaMinutosList();
            for (VentaMinutos ventaMinutosListOrphanCheckVentaMinutos : ventaMinutosListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This PlanMinutos (" + planMinutos + ") cannot be destroyed since the VentaMinutos " + ventaMinutosListOrphanCheckVentaMinutos + " in its ventaMinutosList field has a non-nullable codigoplan field.");
            }
            List<Recarga> recargaListOrphanCheck = planMinutos.getRecargaList();
            for (Recarga recargaListOrphanCheckRecarga : recargaListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This PlanMinutos (" + planMinutos + ") cannot be destroyed since the Recarga " + recargaListOrphanCheckRecarga + " in its recargaList field has a non-nullable codigoplan field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(planMinutos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<PlanMinutos> findPlanMinutosEntities() {
        return findPlanMinutosEntities(true, -1, -1);
    }

    public List<PlanMinutos> findPlanMinutosEntities(int maxResults, int firstResult) {
        return findPlanMinutosEntities(false, maxResults, firstResult);
    }

    private List<PlanMinutos> findPlanMinutosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(PlanMinutos.class));
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

    public PlanMinutos findPlanMinutos(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(PlanMinutos.class, id);
        } finally {
            em.close();
        }
    }

    /* Método que accede a la base de datos y realiza la búsqueda de planes de minutos usando el 
       nombre como parámetro de consulta
       Entrada: nombre de tipo String
       Salida: Lista de objetos de tipo planesMinutos 
               Lista vacía si no se encuentra registros que coincidan con el parámetro
    */
    public List<PlanMinutos> findPlanMinutosName(String nombrePlan)
    {
        String consulta = "SELECT * FROM planminutos WHERE nombreplan LIKE '%"+nombrePlan+"%'";
        EntityManager em = getEntityManager(); 
        Query query = em.createNativeQuery(consulta,PlanMinutos.class);
        return query.getResultList();
    }
    
}
