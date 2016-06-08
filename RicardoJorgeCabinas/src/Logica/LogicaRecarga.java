package Logica;

import Modelo.Recarga;
import Persistencia.RecargaJpaController;

/**
 *
 * @author Daniel
 */
public class LogicaRecarga {
    RecargaJpaController recargaDAO = new RecargaJpaController();
    
    
    /* Método encargado de hacer el llamado a la BD y almacenarlo
       Entrada: Objeto tipo Recarga
       Salida: vacía
    */
    public void registrarRecarga(Recarga r) throws Exception{
        recargaDAO.create(r);
    }
}
