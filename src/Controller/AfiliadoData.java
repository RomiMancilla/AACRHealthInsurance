package Controller;

import Model.Afiliado;
import java.io.SyncFailedException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLSyntaxErrorException;
import java.sql.SQLIntegrityConstraintViolationException;

public class AfiliadoData {

    private Connection conn = null;

    public AfiliadoData() {
        conn = ConnectionDB.obtenerConexion();
    }

    public void guardarAfiliado(Afiliado afiliado) {
        String sql = "INSERT INTO afiliados (nombreAfiliado,apellidoAfiliado,dni,domicilioAfiliado,telefonoAfiliado,estado) VALUES (?,?,?,?,?,?);";
        try (PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, afiliado.getNombreAfiliado());
            ps.setString(2, afiliado.getApellidoAfiliado());
            ps.setString(3, afiliado.getDni());
            ps.setString(4, afiliado.getDomicilioAfiliado());
            ps.setString(5, afiliado.getTelefonoAfiliado());
            ps.setBoolean(6, afiliado.isEstado());

            int exito = ps.executeUpdate();
            if (exito > 0) {
                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs.next()) {
                        int idAfiliado = rs.getInt(1);
                        afiliado.setIdAfiliado(idAfiliado);
                        JOptionPane.showMessageDialog(null, "Afiliado agregado con ID: " + idAfiliado + ".");
                    }
                }
            }
        } catch (SQLIntegrityConstraintViolationException integrity) {
            JOptionPane.showMessageDialog(null, "Registro duplicado: " + integrity.getMessage());
        } catch (SQLSyntaxErrorException syn) {
            JOptionPane.showMessageDialog(null, "Error de Sintaxis en sentencia SQL:\n " + syn.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a Afiliados: " + e.getMessage());
        }
    }
    


}
