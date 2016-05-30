
package Logica;

import Modelo.VentaMinutos;
import Persistencia.VentaMinutosJpaController;

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
    
}
