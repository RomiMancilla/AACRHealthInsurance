package Controller;

import Model.Afiliado;
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
import java.time.LocalDate;

public class OrdenData {

    private Connection conn = null;
    AfiliadoData afiData = new AfiliadoData();
    PrestadorData prestaData = new PrestadorData();

    public OrdenData() {
        conn = ConnectionDB.obtenerConexion();
    }

    public void guardarOrden(Orden orden) {
        String sql = "INSERT INTO ordenes (fecha, formaPago, importe, idAfiliado, IdPrestador) VALUES (?,?,?,?,?);";
        try (PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            Date fecha = Date.valueOf(orden.getFecha());
            ps.setDate(1, fecha);
            ps.setString(2, orden.getFormaDePago().toString());
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
        } catch (SQLIntegrityConstraintViolationException integrity) {
            JOptionPane.showMessageDialog(null, "No se permiten dos órdenes en la misma fecha para el Afiliado\n" + integrity.getMessage());
        } catch (SQLSyntaxErrorException syn) {
            JOptionPane.showMessageDialog(null, "Error de Sintaxis en sentencia SQL:\n " + syn.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a orden.");
        }
    }

    public void buscarOrden(int id) {
        Orden orden = null;
        String sql = "SELECT * FROM orden WHERE idOrden =? AND estado =?; ";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            Date fecha = Date.valueOf(orden.getFecha());
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int idOrden = rs.getInt("idOrden");
                    // LocalDate fecha = rs.getDate("fecha").toLocalDate();
                    String formaPago = rs.getString("formaPago");
                    Double importe = rs.getDouble("importe");
                    int idAfiliado = rs.getInt("idAfiliado");
                    Afiliado afiliado = afiData.obtenerAfiliadoPorId(id);
                    int idPrestador = rs.getInt("idPrestador");
                    orden.setAfiliado(afiliado);
                    Prestador prestador = prestaData.obtenerPrestadorPorId(idPrestador);
                    orden.setPrestador(prestador);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a orden.");
        }
    }

    public void eliminarOrden(int idOrden) {
        String sql = "UPDATE orde SET idOrden != null WHERE idOrden =?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idOrden);
            int exito = ps.executeUpdate();
            if (exito > 0) {
                JOptionPane.showMessageDialog(null, "La orden se elimino correctamente.");
            }
        } catch (SQLSyntaxErrorException syn) {
            JOptionPane.showMessageDialog(null, "Error de Sintaxis en sentencia SQL:\n " + syn.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a orden.");
        }
    }
    
    public void actualizarOrden(Orden orden){
        String sql = "UPDATE ordenSET";
    }
    
    
}
