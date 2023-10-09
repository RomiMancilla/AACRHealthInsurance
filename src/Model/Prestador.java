
package Model;

public class Prestador {
    
    private int idPrestador;
    private String nombrePrestador, apellidoPrestador;
    private int matricula;
    private String domicilioPrestador, telefonoPrestador;
    private Especialidad especialidad;
    private Boolean estado;

    public Prestador() {
    }

    public Prestador(String nombrePrestador, String apellidoPrestador, int matricula, String domicilioPrestador, String telefonoPrestador, Especialidad especialidad, Boolean estado) {
        this.nombrePrestador = nombrePrestador;
        this.apellidoPrestador = apellidoPrestador;
        this.matricula = matricula;
        this.domicilioPrestador = domicilioPrestador;
        this.telefonoPrestador = telefonoPrestador;
        this.especialidad = especialidad;
        this.estado = estado;
    }

    public Prestador(int idPrestador, String nombrePrestador, String apellidoPrestador, int matricula, String domicilioPrestador, String telefonoPrestador, Especialidad especialidad, Boolean estado) {
        this.idPrestador = idPrestador;
        this.nombrePrestador = nombrePrestador;
        this.apellidoPrestador = apellidoPrestador;
        this.matricula = matricula;
        this.domicilioPrestador = domicilioPrestador;
        this.telefonoPrestador = telefonoPrestador;
        this.especialidad = especialidad;
        this.estado = estado;
    }

    public int getIdPrestador() {
        return idPrestador;
    }

    public void setIdPrestador(int idPrestador) {
        this.idPrestador = idPrestador;
    }

    public String getNombrePrestador() {
        return nombrePrestador;
    }

    public void setNombrePrestador(String nombrePrestador) {
        this.nombrePrestador = nombrePrestador;
    }

    public String getApellidoPrestador() {
        return apellidoPrestador;
    }

    public void setApellidoPrestador(String apellidoPrestador) {
        this.apellidoPrestador = apellidoPrestador;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getDomicilioPrestador() {
        return domicilioPrestador;
    }

    public void setDomicilioPrestador(String domicilioPrestador) {
        this.domicilioPrestador = domicilioPrestador;
    }

    public String getTelefonoPrestador() {
        return telefonoPrestador;
    }

    public void setTelefonoPrestador(String telefonoPrestador) {
        this.telefonoPrestador = telefonoPrestador;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Prestador{" + "idPrestador=" + idPrestador + ", nombrePrestador=" + nombrePrestador + ", apellidoPrestador=" + apellidoPrestador + ", matricula=" + matricula + ", domicilioPrestador=" + domicilioPrestador + ", telefonoPrestador=" + telefonoPrestador + ", especialidad=" + especialidad + ", estado=" + estado + '}';
    }

   
    }

    
    
     
    
    

