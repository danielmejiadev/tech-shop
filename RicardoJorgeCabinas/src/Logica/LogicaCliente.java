
package Logica;
import Modelo.Cliente;
import Persistencia.ClienteJpaController;
import java.util.List;


public class LogicaCliente {
    private ClienteJpaController clienteDAO = new ClienteJpaController();
   
    /*
        Metodo para Registrar un nuevo cliente
        Entrada: Objeto Cliente
        Salida: --
    */
    public void registrar(Cliente cliente) throws Exception{
        
        if(cliente==null){
            throw  new Exception("Usuario sin información");
        }
        if(cliente.getNombrecliente().equals("")){
            throw new Exception("Nombre vacío");
        }
        
        clienteDAO.create(cliente);
    }
    
    public List<Cliente> consultarClientes(){
        return clienteDAO.findClienteEntities();
    }
    
     public List<Cliente> consultarClientes(String nombreCliente, String cedulaCliente){
        return clienteDAO.findClienteName(nombreCliente, cedulaCliente);
    }
    
    /*
        Metodo para validar que un cliente esté correctamente diligenciado
        Entrada: Objeto Cliente
        Salida: True: si el cliente está apto para ser almacenado
                False: si el cliente NO está apto para ser almacenado
    */
    public boolean validarCliente(Cliente cliente){
        boolean b;
        b = !(cliente.getNombrecliente().isEmpty() || (cliente.getCorreocliente().isEmpty() && cliente.getTelefonocliente().isEmpty())
                || cliente.getCedulacliente().isEmpty());
        return b;
    }
    
    public void modificarCliente(Cliente cliente) throws Exception{
        clienteDAO.edit(cliente);
    }
    
    public Cliente consultarCliente(String idCliente){
        return clienteDAO.findCliente(idCliente);
    }
}


