package Logica;

import Modelo.PlanMinutos;
import Persistencia.PlanMinutosJpaController;
import java.util.List;
/**
 *
 * @author Daniel
 */
public class LogicaPlanMinutos {
    PlanMinutosJpaController planMinutosDAO = new PlanMinutosJpaController();
    
    
    /* Método encargado de hacer el llamado a la BD y almacenarlo
       Entrada: Objeto tipo PlanMinutos
       Salida: vacía
    */
    public void registrarPlanMinutos(PlanMinutos elPlan) throws Exception{
        planMinutosDAO.create(elPlan);
    }
    /* Método encargado de devolver el objeto de consulta en la BD
       Entrada: ID del plan de minutos
       Salida: Objeto plan de minutos consultado o null si no existe con el ID
    */
    public PlanMinutos consultarPlanMinutosID(Long id){
        return planMinutosDAO.findPlanMinutos(id);
    }
    
    /* Método encargado de hacer el llamado a la BD y desplegar la lista de planes de minutos
       Entrada: nombre plan
       Salida: Lista de objetos de tipo PlanMinutos 
               Lista vacía si no se encuentra registros que coincidan con el parámetro
    */
    public List<PlanMinutos> consultarPlanMinutosNombre(String nombrePlan){
        return planMinutosDAO.findPlanMinutosName(nombrePlan);
    }
    
    /* Método encargado de hacer el llamado a la BD y desplegar la lista de planes de minutos en su totalidad
       Entrada: ninguna
       Salida: Lista de objetos de tipo PlanMinutos 
               Lista vacía si no se encuentra registros que coincidan con el parámetro
    */
    public List<PlanMinutos> consultarPlanMinutos(){
        return planMinutosDAO.findPlanMinutosEntities();
    }
    
    /* Método encargado de hacer el llamado a la BD y modificar los datos del plan de minutos
       Entrada: Objeto PlanMinutos
       Salida: vacía
    */
    public void modificarPlanMinutos(PlanMinutos elPlan) throws Exception{
        planMinutosDAO.edit(elPlan);
    }
    
}
