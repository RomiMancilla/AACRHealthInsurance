package Controller;

import Model.Afiliado;
import java.io.SyncFailedException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLSyntaxErrorException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a Afiliados: " + e.getMessage());
        }
    }

    public void eliminarAfiliado(int id) {
        String sql = "UPDATE afiliados SET estado=0 WHERE idAfiliado=?;";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            if (esActivo(id)) {
                ps.setInt(1, id);
                int exito = ps.executeUpdate();
                if (exito > 0) {
                    JOptionPane.showMessageDialog(null, "El afiliado se eliminó correctamente");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El afiliado ya se encuentra dado de baja.");
            }
        } catch (SQLSyntaxErrorException syn) {
            JOptionPane.showMessageDialog(null, "Error de Sintaxis en sentencia SQL:\n " + syn.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a Afiliados: " + e.getMessage());
        }
    }

    public void actualizarAfiliado(Afiliado afiliado) {
        String sql = "UPDATE afiliados SET nombreAfiliado=?, apellidoAfiliado=?,dni=?,domicilioAfiliado=?,telefonoAfiliado=? WHERE idAfiliado=?;";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, afiliado.getNombreAfiliado());
            ps.setString(2, afiliado.getApellidoAfiliado());
            ps.setString(3, afiliado.getDni());
            ps.setString(4, afiliado.getDomicilioAfiliado());
            ps.setString(5, afiliado.getTelefonoAfiliado());
            ps.setInt(6, afiliado.getIdAfiliado());

            int exito = ps.executeUpdate();

            if (exito > 0) {
                JOptionPane.showMessageDialog(null, "El afiliado fue actualizado.");
            }
        } catch (SQLSyntaxErrorException syn) {
            JOptionPane.showMessageDialog(null, "Error de Sintaxis en sentencia SQL:\n " + syn.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a Afiliados: " + e.getMessage());
        }
    }

    public List<Afiliado> listarAfiliados() {
        List<Afiliado> listaAfiliados = new ArrayList<>();
        String sql = "SELECT * FROM afiliados WHERE estado=1;";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int idAfiliado = rs.getInt("idAfiliado");
                    String nombre = rs.getString("nombreAfiliado");
                    String apellido = rs.getString("ApellidoAfiliado");
                    String dni = rs.getString("dni");
                    String domicilio = rs.getString("domicilioAfiliado");
                    String telefono = rs.getString("telefonoAfiliado");
                    boolean estado = rs.getBoolean("estado");
                    Afiliado afiliado = new Afiliado(idAfiliado, nombre, apellido, dni, domicilio, telefono, estado);
                    listaAfiliados.add(afiliado);
                }

            } catch (SQLSyntaxErrorException syn) {
                JOptionPane.showMessageDialog(null, "Error de Sintaxis en sentencia SQL:\n " + syn.getMessage());
            }
        } catch (SQLException ex) {
            Logger.getLogger(AfiliadoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaAfiliados;
    }

    private boolean esActivo(int idAfiliado) throws SQLException {
        String sql = "SELECT estado FROM afiliados WHERE idAfiliado=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, idAfiliado);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getBoolean("estado");
        } else {
            return false;
        }
    }

}
