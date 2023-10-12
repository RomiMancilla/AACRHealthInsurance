package Controller;

import Model.Afiliado;
import Model.FormaDePagoEnum;
import Model.Orden;
import Model.Prestador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrdenData {

    private Connection conn = null;
    AfiliadoData afiData = new AfiliadoData();
    PrestadorData prestaData = new PrestadorData();

    public OrdenData() {
        conn = ConnectionDB.obtenerConexion();
    }

    public void guardarOrden(Orden orden) {
        String sql = "INSERT INTO ordenes (fecha, formaPago, importe, estado, idAfiliado, IdPrestador) VALUES (?,?,?,?,?,?);";
        try (PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            Date fecha = Date.valueOf(orden.getFecha());
            ps.setDate(1, fecha);
            ps.setString(2, orden.getFormaDePago().toString());
            ps.setDouble(3, orden.getImporte());
            ps.setBoolean(4, orden.isEstado());
            ps.setInt(5, orden.getAfiliado().getIdAfiliado());
            ps.setInt(6, orden.getPrestador().getIdPrestador());
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
        } catch (SQLIntegrityConstraintViolationException integrity) {
            JOptionPane.showMessageDialog(null, "No se permiten dos órdenes en la misma fecha para el Afiliado\n" + integrity.getMessage());
        } catch (SQLSyntaxErrorException syn) {
            JOptionPane.showMessageDialog(null, "Error de Sintaxis en sentencia SQL:\n " + syn.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a orden.");
        }
    }

    public Orden buscarOrdenPorID(int idOrden) {
        Orden orden = null;
        String sql = "SELECT * FROM ordenes WHERE idOrden =? AND estado =1;";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idOrden);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    orden = new Orden();
                    orden.setIdOrden(rs.getInt("idOrden"));
                    orden.setFecha(rs.getDate("fecha").toLocalDate());
                    orden.setFormaDePago(FormaDePagoEnum.valueOf(rs.getString("formaPago")));
                    orden.setImporte(rs.getDouble("importe"));
                    orden.setEstado(rs.getBoolean("estado"));
                    orden.setAfiliado(afiData.obtenerAfiliadoPorId(rs.getInt("idAfiliado")));
                    orden.setPrestador(prestaData.obtenerPrestadorPorId(rs.getInt("idPrestador")));
                } else {
                    JOptionPane.showMessageDialog(null, "Id no encontrado.");
                }
            }
        } catch (SQLSyntaxErrorException syn) {
            JOptionPane.showMessageDialog(null, "Error de Sintaxis en sentencia SQL:\n " + syn.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a orden.");
        }
        return orden;
    }

    public void eliminarOrden(int idOrden) {
        try {
            if (!existeOrden(idOrden)) {//Si no existe el ID se termina la ejecución del método
                JOptionPane.showMessageDialog(null, "No existe orden con ese ID.");
                return;
            }
            if (esActivo(idOrden)) {//Si no está ativo se pasa al "ELSE (100)"
                String sql = "UPDATE ordenes SET estado = 0 WHERE idOrden =?";
                try (PreparedStatement ps = conn.prepareStatement(sql)) {
                    ps.setInt(1, idOrden);
                    int exito = ps.executeUpdate();
                    if (exito > 0) {
                        JOptionPane.showMessageDialog(null, "La orden se eliminó correctamente.");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "La orden ya se encuentra dada de baja.");
            }
        } catch (SQLSyntaxErrorException syn) {
            JOptionPane.showMessageDialog(null, "Error de Sintaxis en sentencia SQL:\n " + syn.getMessage());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a ordenes." + ex.getMessage());
        }
    }

    public void actualizarOrden(Orden orden) {
        String sql = "UPDATE ordenSET";
    }

    private boolean esActivo(int idOrden) throws SQLException {
        String sql = "SELECT estado FROM ordenes WHERE idOrden = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, idOrden);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getBoolean("estado");
        } else {
            return false;
        }
    }

    private boolean existeOrden(int idOrden) throws SQLException {
        String sql = "SELECT idOrden FROM ordenes WHERE idOrden = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, idOrden);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return true;
        }
        return false;
    }
}
