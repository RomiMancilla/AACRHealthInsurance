
package Controller;

import Model.Afiliado;
import java.sql.Connection;

public class AfiliadoData {
    
private Connection conn=null;

    public AfiliadoData() {
    conn=ConnectionDB.obtenerConexion();
    }
    
}
