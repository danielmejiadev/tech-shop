package Logica;

import Modelo.UsbModem;
import Persistencia.UsbModemJpaController;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LogicaUsbModem {
    
    UsbModemJpaController modemDAO = new UsbModemJpaController();
    
    /* Método para registrar un modem en la base de datos
       Entrada: un objeto de la clase UsbModem
       Salida: ---
    */
    public void registrarModem(UsbModem um) {
        modemDAO.create(um);
    }
    
    /* Método para modificar un modem de la base de datos
       Entrada: un objeto de la clase UsbModem
       Salida: ---
    */
    public void modificarModem(UsbModem um){
        try {
            modemDAO.edit(um);
        } catch (Exception ex) {
            Logger.getLogger(LogicaUsbModem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /* Método para consultar todos los modems registrados en la base de datos
       Entrada: ---
       Salida: Lista de objetos de la clase UsbModem.
               Lista vacía si no hay registros
    */
    public List<UsbModem> consultarModems(){
        return modemDAO.findUsbModemEntities();
    }
    
    /* Método para consultar un modem de la base de datos por medio de su código
       Entrada: código tipo Long
       Salida: objeto de tipo UsbModem
               null si no existe el modem 
    */
    public UsbModem consultarModemCodigo(long cod) throws Exception{
        if(modemDAO.findUsbModem(cod)==null){
            throw new Exception("El modem no existe");
        }
        return modemDAO.findUsbModem(cod);
    }
    
    /* Método para consultar modem de la base de datos por medio del nombre
       Entrada: nombre de tipo String
       Salida: Lista de objetos de tipo UsbModem
               Lista vacía si no se encuentran coincidencias
    */
    public List<UsbModem> consultarModemsNombre(String n) throws Exception{
        if(modemDAO.findUsbModemNombre(n).isEmpty()){
            throw new Exception("El modem no existe");
        }
        return modemDAO.findUsbModemNombre(n);
    }

    
}
