
package Controller;

import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConnectionDB {
 
    private static Connection conexion=null;
    private static final String URL="jdbc:mariadb://localhost/masSalud";
    private static final String USER="root";
    private static final String PASS="";

    private ConnectionDB() {
    }
    
    public static Connection obtenerConexion(){
        if (conexion==null) {
            try {
                conexion=DriverManager.getConnection(URL, USER, PASS);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de Conexión: Conexión Rechazada\nVerifique Servicios de Acceso a Base de Datos. \n"+ex.getMessage());
            }
        }
        return conexion;
    }
    
    public static void cerrarConexion() {
        try {
            if (conexion != null) {
                conexion.close();
                conexion = null;
            }
        } catch (SQLException e) {
            System.out.println("Error al intentar cierre de conexión "+e.getMessage());

        }
    }
    
}
