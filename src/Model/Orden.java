package Model;

import java.time.LocalDate;

public class Orden {

    private int idOrden;
    private LocalDate fecha;
    private FormaDePagoEnum formaDePago;
    private Double importe;
    private boolean estado;
    private Afiliado afiliado;
    private Prestador prestador;

    public Orden() {
    }

    public Orden(LocalDate fecha, FormaDePagoEnum formaDePago, Double importe, boolean estado, Afiliado afiliado, Prestador prestador) {
        this.fecha = fecha;
        this.formaDePago = formaDePago;
        this.importe = importe;
        this.estado = estado;
        this.afiliado = afiliado;
        this.prestador = prestador;
    }

    public Orden(int idOrden, LocalDate fecha, FormaDePagoEnum formaDePago, Double importe, boolean estado, Afiliado afiliado, Prestador prestador) {
        this.idOrden = idOrden;
        this.fecha = fecha;
        this.formaDePago = formaDePago;
        this.importe = importe;
        this.estado = estado;
        this.afiliado = afiliado;
        this.prestador = prestador;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public FormaDePagoEnum getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(FormaDePagoEnum formaDePago) {
        this.formaDePago = formaDePago;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Afiliado getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(Afiliado afiliado) {
        this.afiliado = afiliado;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

    @Override
    public String toString() {
        return "Orden{" + "idOrden=" + idOrden + ", fecha=" + fecha + ", formaDePago=" + formaDePago + ", importe=" + importe + ", estado=" + estado + ", afiliado=" + afiliado + ", prestador=" + prestador + '}';
    }
}
