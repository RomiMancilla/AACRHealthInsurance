package Controller;

import Model.Especialidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EspecialidadData {

    private Connection conn = null;

    public EspecialidadData() {
        conn = ConnectionDB.obtenerConexion();
    }

    public void agregarEspecialidad(Especialidad especialidad) {
        String sql = "INSERT INTO especialidades (nombreEspecialidad, estado) VALUES (?,?);";
        try (PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, especialidad.getNombreEspecialidad());
            ps.setBoolean(2, especialidad.isEstado());
            int exito = ps.executeUpdate();
            if (exito > 0) {
                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs.next()) {
                        int idEspecialidad = rs.getInt(1);
                        especialidad.setIdEspecialidad(idEspecialidad);
                        JOptionPane.showMessageDialog(null, "Especialidad agregada correctamente con ID: " + idEspecialidad);
                    }
                }
            }
        } catch (SQLIntegrityConstraintViolationException integrity) {
            JOptionPane.showMessageDialog(null, "Registro duplicado: " + integrity.getMessage());
        } catch (SQLSyntaxErrorException syn) {
            JOptionPane.showMessageDialog(null, "Error de Sintaxis en sentencia SQL:\n " + syn.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a Especialidad: " + e.getMessage());
        }
    }

    public void eliminarEspecialidad(int idEspecialidad) {
        try {
            if (existe(idEspecialidad)) {//verifico si existe
                if (esActivo(idEspecialidad)) {//verifico si está activa
                    String sql = "UPDATE especialidades SET estado=0 WHERE idEspecialidad=?;";
                    try (PreparedStatement ps = conn.prepareStatement(sql)) {
                        ps.setInt(1, idEspecialidad);
                        int exito = ps.executeUpdate();
                        if (exito > 0) {
                            JOptionPane.showMessageDialog(null, "Especialidad eliminada.");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La especialidad ya se encuentra dada de baja");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe especialidad con ese ID.");
            }
        } catch (SQLSyntaxErrorException syn) {
            JOptionPane.showMessageDialog(null, "Error de Sintaxis en sentencia SQL:\n " + syn.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a Especialidad: " + ex.getMessage());
        }
    }

    public void actualizarEspecialidad(Especialidad especialidad) {
        try {
            String sql = "UPDATE especialidades SET nombreEspecialidad=? WHERE idEspecialidad=?;";
            if (!existe(especialidad.getIdEspecialidad())) {
                JOptionPane.showMessageDialog(null, "No existe Especialidad con ese ID.");
                return;
            }
            if (nombreEsIgual(especialidad.getIdEspecialidad(), especialidad.getNombreEspecialidad())) {
                JOptionPane.showMessageDialog(null, "El nombre de la especialidad ya existe en la base de datos.");
                return;
            }
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, especialidad.getNombreEspecialidad());
                ps.setInt(2, especialidad.getIdEspecialidad());
                int exito = ps.executeUpdate();
                if (exito > 0) {
                    JOptionPane.showMessageDialog(null, "Especialidad actualizada.");
                }
            } catch (SQLSyntaxErrorException syn) {
                JOptionPane.showMessageDialog(null, "Error de Sintaxis en sentencia SQL:\n " + syn.getMessage());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a Especialidades");
        }
    }

    public List<Especialidad> listarEspecialidades() {
        List<Especialidad> listaEspecialidades = new ArrayList<>();
        String sql = "SELECT idEspecialidad, nombreEspecialidad, estado FROM especialidades WHERE estado=1;";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int idEspecialidad = rs.getInt("idEspecialidad");
                    String nombreEspecialidad = rs.getString("nombreEspecialidad");
                    boolean estado = rs.getBoolean("estado");
                    Especialidad especialidad = new Especialidad(idEspecialidad, nombreEspecialidad, estado);
                    listaEspecialidades.add(especialidad);
                }
            }
        } catch (SQLSyntaxErrorException syn) {
            JOptionPane.showMessageDialog(null, "Error de Sintaxis en sentencia SQL:\n " + syn.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a Especialidades");
        }
        return listaEspecialidades;
    }

    public Especialidad obtenerEspecialidadPorId(int idEspecialidad) {
        String sql = "SELECT idEspecialidad, nombreEspecialidad, estado FROM especialidades WHERE idEspecialidad=? AND estado=1;";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idEspecialidad);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int idEsp = rs.getInt("idEspecialidad");
                    String nombreEspecialidad = rs.getString("nombreEspecialidad");
                    boolean estado = rs.getBoolean("estado");
                    return new Especialidad(idEsp, nombreEspecialidad, estado);
                }
            }
        } catch (SQLSyntaxErrorException syn) {
            JOptionPane.showMessageDialog(null, "Error de Sintaxis en sentencia SQL:\n " + syn.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a Especialidades "+e.getMessage());
        }
        return null;
    }

    public List<Especialidad> obtenerEspecialidadPorNombre(String nombre) {
        List<Especialidad> listadoEspecialidades = new ArrayList<>();
        String sql = "SELECT * FROM especialidades Where nombreEspecialidad LIKE ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1,  nombre + "%");
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("idEspecialidad");
                    String nombreEspecialidad = rs.getString("nombreEspecialidad");
                    boolean estado = rs.getBoolean("estado");
                    Especialidad especialidad = new Especialidad(id, nombreEspecialidad, estado);
                    listadoEspecialidades.add(especialidad);
                }
            }
        } catch (SQLSyntaxErrorException syn) {
            JOptionPane.showMessageDialog(null, "Error de Sintaxis en sentencia SQL:\n " + syn.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a Especialidades");
        }
        return listadoEspecialidades;
    }

    //******************************************************************************************************************
    //Extra: método para validar existencia de especialidad
    private boolean existe(int idEspecialidad) throws SQLException {
        String sql = "SELECT idEspecialidad FROM especialidades WHERE idEspecialidad=?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, idEspecialidad);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return true;
        }
        return false;
    }

//Extra: Método AdHoc para verificar si la especialidad está activa o no.
    private boolean esActivo(int idEspecialidad) throws SQLException {
        String sql = "SELECT * FROM especialidades WHERE idEspecialidad=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, idEspecialidad);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getBoolean("estado");
        } else {
            return false;
        }
    }

    //método AdHoc para verificar si el nombre de Especialidad no es el mismo
    private boolean nombreEsIgual(int idEspecialidad, String nombreEspecialidad) throws SQLException {
        String sql = "SELECT nombreEspecialidad FROM especialidades WHERE idEspecialidad = ?;";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idEspecialidad);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String nombreExistente = rs.getString("nombreEspecialidad");
                return nombreExistente.equals(nombreEspecialidad);
            }
        }
        return false;
    }
}
