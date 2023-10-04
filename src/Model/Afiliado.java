
package Model;


public class Afiliado {
    
    private int idAfiliado;
    private String nombreAfiliado;
    private String apellidoAfiliado;
    private String dni;
    private String domicilioAfiliado;
    private String telefonoAfiliado;
    private boolean estado;

    public Afiliado() {
    }

    public Afiliado(String nombreAfiliado, String apellidoAfiliado, String dni, String domicilioAfiliado, String telefonoAfiliado, boolean estado) {
        this.nombreAfiliado = nombreAfiliado;
        this.apellidoAfiliado = apellidoAfiliado;
        this.dni = dni;
        this.domicilioAfiliado = domicilioAfiliado;
        this.telefonoAfiliado = telefonoAfiliado;
        this.estado = estado;
    }

    public Afiliado(int idAfiliado, String nombreAfiliado, String apellidoAfiliado, String dni, String domicilioAfiliado, String telefonoAfiliado, boolean estado) {
        this.idAfiliado = idAfiliado;
        this.nombreAfiliado = nombreAfiliado;
        this.apellidoAfiliado = apellidoAfiliado;
        this.dni = dni;
        this.domicilioAfiliado = domicilioAfiliado;
        this.telefonoAfiliado = telefonoAfiliado;
        this.estado = estado;
    }

    public int getIdAfiliado() {
        return idAfiliado;
    }

    public void setIdAfiliado(int idAfiliado) {
        this.idAfiliado = idAfiliado;
    }

    public String getNombreAfiliado() {
        return nombreAfiliado;
    }

    public void setNombreAfiliado(String nombreAfiliado) {
        this.nombreAfiliado = nombreAfiliado;
    }

    public String getApellidoAfiliado() {
        return apellidoAfiliado;
    }

    public void setApellidoAfiliado(String apellidoAfiliado) {
        this.apellidoAfiliado = apellidoAfiliado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDomicilioAfiliado() {
        return domicilioAfiliado;
    }

    public void setDomicilioAfiliado(String domicilioAfiliado) {
        this.domicilioAfiliado = domicilioAfiliado;
    }

    public String getTelefonoAfiliado() {
        return telefonoAfiliado;
    }

    public void setTelefonoAfiliado(String telefonoAfiliado) {
        this.telefonoAfiliado = telefonoAfiliado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Afiliado{" + "idAfiliado=" + idAfiliado + ", nombreAfiliado=" + nombreAfiliado + ", apellidoAfiliado=" + apellidoAfiliado + ", dni=" + dni + ", domicilioAfiliado=" + domicilioAfiliado + ", telefonoAfiliado=" + telefonoAfiliado + ", estado=" + estado + '}';
    }

       
    
}
