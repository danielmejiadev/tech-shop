package Logica;

import Modelo.Usuario;
import Persistencia.UsuarioJpaController;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class LogicaUsuario {
    
    UsuarioJpaController usuarioDAO = new UsuarioJpaController();
    
    public LogicaUsuario()
    {
        
    }
    
    /* Funcion que verifica si un usuario existe esta registrado en la base de datos
       Entradas String ceulaUsuario, String contraseña -> datos del solicitante
       Salidas int 1-> si el usuario no esta registrado
                   2-> si el usuario esta registrado pero no concuerda la contraseña
                   3-> si el usuario es verificado correctamente, pero no se encuentra activo en el sistema
                   4-> si el usuario es verificado correctamente y es de tipo administrador
                   5-> si el usuario es verificado correctamente y es de tipo vendedor
    */
    public int validarUsuario(String cedulaUsuario, String contraseña)
    {
        int salida;
        Usuario usuario=consultarUsuarioCedula(cedulaUsuario);
        if(usuario==null)
        {
           salida=1;
        }
        else
        {
           if(!usuario.getContrasena().equals(contraseña))
           {
               salida=2;
           }
           else
           {
               if(usuario.getEstadousuario()==false)
               {
                   salida=3;
               }
               else
               {
                   if(usuario.getTipousuario().equals("administrador"))     
                   {
                      salida=4; 
                   }
                   else
                   {
                       salida=5;
                   }
               }
           }
        }
        return salida;
    }
    
   
    public void registrarUsuario(Usuario usuario) throws Exception 
    {
        usuarioDAO.create(usuario);   
    }
    
    public void modificarUsuario(Usuario usuario) throws Exception
    {
        usuarioDAO.edit(usuario);
    }
    
    /* Funcion que consulta un usario en la base de datos, teniendo en cuenta la cedula
       Entrada String cedulaUsuarip-> solicitante
       Salida Usuario-> si el usuario esta en la base de datos
              null-> si el usuario no esta dentro de la base de datos
    
    */
    public Usuario consultarUsuarioCedula(String cedulaUsuario)
    {
      return usuarioDAO.findUsuario(cedulaUsuario);
    }
    
    public List<Usuario> consultarUsuarioNombre(String nombreUsuario)
    {
        return usuarioDAO.findUsuarioName(nombreUsuario);
    }
    
    public List<Usuario> consultarUsuarios()
    {
        return usuarioDAO.findUsuarioEntities();
    }
    
   
    
}
