
package Controller;

import Model.Prestador;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLSyntaxErrorException;

public class PrestadorData {

    private Connection conn = null;

    public PrestadorData() {
        conn = ConnectionDB.obtenerConexion();
    }

    public void guardarPrestador(Prestador prestador) {
        String sql = "INSERT INTO prestadores(nombrePrestador, apellidoPrestador, matricula, domicilioPrestador, telefonoPrestador, estado, idEspecialidad) VALUES (?,?,?,?,?,?,?)";
        try (PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, prestador.getNombrePrestador());
            ps.setString(2, prestador.getApellidoPrestador());
            ps.setInt(3, prestador.getMatricula());
            ps.setString(4, prestador.getDomicilioPrestador());
            ps.setString(5, prestador.getTelefonoPrestador());
            ps.setBoolean(6, true);
            ps.setInt(7, prestador.getEspecialidad().getIdEspecialidad());
            int exito = ps.executeUpdate();
            if (exito > 0) {
                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs.next()) {
                        int idPrestador = rs.getInt(1);
                        prestador.setIdPrestador(idPrestador);
                        JOptionPane.showMessageDialog(null, "Prestador agregado con Id: " + idPrestador);
                    }
                }
            }
        } catch (SQLSyntaxErrorException syn) {
            JOptionPane.showMessageDialog(null, "Error de Sintaxis en sentencia SQL:\n " + syn.getMessage());
        } catch (SQLIntegrityConstraintViolationException integrity) {
            JOptionPane.showMessageDialog(null, "Registro duplicado: " + integrity.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en acceso a Prestadores" + e.getMessage());
        }

    }

}
