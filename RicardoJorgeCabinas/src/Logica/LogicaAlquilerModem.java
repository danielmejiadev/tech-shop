package Logica;

import Modelo.AlquilerModem;
import Persistencia.AlquilerModemJpaController;

/**
 *
 * @author Daniel
 */
public class LogicaAlquilerModem {
    AlquilerModemJpaController alquilerModemDAO = new AlquilerModemJpaController();
    
    public void registrarAlquilerModem(AlquilerModem alquilerModem){
        alquilerModemDAO.create(alquilerModem);
    }
    
}
