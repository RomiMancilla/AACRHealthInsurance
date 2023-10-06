package Model;

public class Especialidad {

    private int idEspecialidad;
    private String nombreEspecialidad;
    private boolean estado;

    public Especialidad() {
    }

    public Especialidad(String nombreEspecialidad, boolean estado) {
        this.nombreEspecialidad = nombreEspecialidad;
        this.estado = estado;
    }

    public Especialidad(int idEspecialidad, String nombreEspecialidad, boolean estado) {
        this.idEspecialidad = idEspecialidad;
        this.nombreEspecialidad = nombreEspecialidad;
        this.estado = estado;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Especialidad{" + "idEspecialidad=" + idEspecialidad + ", nombreEspecialidad=" + nombreEspecialidad + ", estado=" + estado + '}';
    }
}
