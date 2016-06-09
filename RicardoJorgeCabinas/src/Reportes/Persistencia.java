/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Persistencia {
    public static Connection con;
    public static Statement areadb;
    
    
    public static boolean conectar()
    {
        //variable para el control de errores
        try
        {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ricardojorgecabinas", "root", "");
                areadb = con.createStatement();
                System.out.println("Conectado");
        }
        catch(ClassNotFoundException se)
        {
               System.out.println("No se ha podido encontrar el driver para MySQL.");
               return false;
        }
        catch (Exception se)
        {
            System.out.println("No se ha podido conectar a la base de datos ");
            return false;
        }

        return true;
    }

    public static boolean desconectar()
    {
        try
        {
            areadb.close();
            con.close();
            System.out.println("Desconectado");
            return true;
        } catch(SQLException ex )
            {
                //System.out.println("Conexion_Error");
                return false;
            }catch(NullPointerException u){
                System.out.println("No se ha conectado");
                return false;
            }
    }
}
