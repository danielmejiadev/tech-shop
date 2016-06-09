
package Logica;

import Modelo.VentaMinutos;
import Persistencia.VentaMinutosJpaController;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class LogicaVentaMinutos {
    
    VentaMinutosJpaController controladorVenta;
            
    public LogicaVentaMinutos()
    {
        controladorVenta = new VentaMinutosJpaController();
    }
    
    
    public void registrarVenta(VentaMinutos venta)          
    {
        controladorVenta.create(venta);
    }
 
    public List<VentaMinutos> consultarVentas(){
       return controladorVenta.findVentaMinutosEntities();
   }
   
   public List<VentaMinutos> consultarVentasGanadoras(int condicionPromo, String cedulaCliente, String fechaInicioPromo){
       return controladorVenta.ventasGanadoras(condicionPromo, cedulaCliente, fechaInicioPromo);
   }
   
   public List<VentaMinutos> consultaVentaConPromo(String cedulaCliente, String fechaInicioPromo, int codigoPromo){
       return controladorVenta.ventasPromo(cedulaCliente, fechaInicioPromo, codigoPromo);
   }
   
   public List<VentaMinutos> consultaVentasCliente(String cedulaCliente){
       return controladorVenta.findVentasCliente(cedulaCliente);
   }
}
