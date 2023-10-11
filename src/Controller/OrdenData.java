package Controller;

import Model.Afiliado;
import Model.Orden;
import Model.Prestador;
import java.sql.Connection;
import java.time.LocalDate;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Date;

public class OrdenData {

    private Connection conn = null;

    public OrdenData() {
        conn = ConnectionDB.obtenerConexion();
    }

    public void guardarOrden(Orden orden) {
        String sql = "SELECT INTO orden (fecha, formaPago, importe, idAfiliado, IdPrestador) VALUES (?,?,?,?,?);";
        try (PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            Date fecha=Date.valueOf(orden.getFecha());
            ps.setDate(1, fecha);
            ps.setString(2, orden.getFormaPago());
            ps.setDouble(3, orden.getImporte());
            ps.setInt(4, orden.getAfiliado().getIdAfiliado());
            ps.setInt(5, orden.getPrestador().getIdPrestador());
            int exito = ps.executeUpdate();
            if (exito > 0) {
                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs.next()) {
                        int idOrden = rs.getInt(1);
                        orden.setIdOrden(idOrden);
                        JOptionPane.showMessageDialog(null, "Se ha creado la orden con el Id : " + idOrden + ".");
                    }
                }
            }
        }catch (SQLIntegrityConstraintViolationException integrity) {
            JOptionPane.showMessageDialog(null, "Registro duplicado: " + integrity.getMessage());
        }catch (SQLSyntaxErrorException syn) {
            JOptionPane.showMessageDialog(null, "Error de Sintaxis en sentencia SQL:\n " + syn.getMessage());           
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al acceder a orden.");  
        }        
    }
}   