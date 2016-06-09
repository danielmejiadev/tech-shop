package Logica;

import Modelo.AlquilerModem;
import Modelo.Cliente;
import Persistencia.AlquilerModemJpaController;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class LogicaAlquilerModem {
    AlquilerModemJpaController alquilerModemDAO = new AlquilerModemJpaController();
    
    public void registrarAlquilerModem(AlquilerModem alquilerModem){
        alquilerModemDAO.create(alquilerModem);
    }
 
    public List<AlquilerModem> consultarAlquilerModem(){
        return alquilerModemDAO.findAlquilerModemEntities();
    }
    
    public AlquilerModem consultaAlquilerModemCod(Long cod){
        return alquilerModemDAO.findAlquilerModem(cod);
    }
    
    public AlquilerModem consultaAlquilerModemCliente(Cliente ced){
        return alquilerModemDAO.findAlquilerModemCliente(ced);
    }
    public void modificarAlquilerModem(AlquilerModem alquilerM) throws Exception{
        alquilerModemDAO.edit(alquilerM);
    }
}
