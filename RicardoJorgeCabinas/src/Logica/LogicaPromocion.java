package Logica;

import Modelo.Promocion;
import Persistencia.PromocionJpaController;
import java.util.List;


public class LogicaPromocion {
     private PromocionJpaController promocionDAO = new PromocionJpaController();
   
    /*
        Metodo para Registrar una nueva promocion
        Entrada: Objeto Promocion
        Salida: --
    */
    public void registrar(Promocion promocion) throws Exception{
        
        if(promocion==null){
            throw  new Exception("Promocion sin información");
        }
        if(promocion.getDescripcion().equals("")){
            throw new Exception("Descripción vacía");
        }
        
        promocionDAO.create(promocion);
    }
    
    public List<Promocion> consultarPromociones(){
        return promocionDAO.findPromocionEntities();
    }
    
    public List<Promocion> consultarPromocion(String descripcionPromo){
        return promocionDAO.findPromocionDescripcion(descripcionPromo);
    }
    
    /*
        Metodo para validar que una promocion esté correctamente diligenciada
        Entrada: Objeto Promocion
        Salida: True: si la promocion está apto para ser almacenada
                False: si la promocion NO está apta para ser almacenada
    */
    public boolean validarPromocion(Promocion promocion){
        boolean b;
        b = !(promocion.getBeneficio() < 0 || (promocion.getCondicion()<0 && promocion.getCondicion()<0)
                || promocion.getDescripcion().isEmpty());
        return b;
    }
    
    public Promocion consultarPromocion(long codigoPromocion){
        return promocionDAO.findPromocion(codigoPromocion);
    }
    
    public void modificarPromocion(Promocion promocion) throws Exception{
        promocionDAO.edit(promocion);
    }
    
    public List<Promocion> consultarPromocionesActivas(){
       return promocionDAO.findPromocionesActivas();
   }
}
