/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Afiliado;
import Model.Prestador;
import java.time.LocalDate;

public class OrdenData {
    private int idOrden;
    private LocalDate fecha;
    private String formaPago;
    private Double importe;
    private Afiliado afiliado;
    private Prestador prestador;

    public OrdenData() {
    }

    public OrdenData(LocalDate fecha, String formaPago, Double importe, Afiliado afiliado, Prestador prestador) {
        this.fecha = fecha;
        this.formaPago = formaPago;
        this.importe = importe;
        this.afiliado = afiliado;
        this.prestador = prestador;
    }

    public OrdenData(int idOrden, LocalDate fecha, String formaPago, Double importe, Afiliado afiliado, Prestador prestador) {
        this.idOrden = idOrden;
        this.fecha = fecha;
        this.formaPago = formaPago;
        this.importe = importe;
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

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
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
        return "OrdenData{" + "idOrden=" + idOrden + ", fecha=" + fecha + ", formaPago=" + formaPago + ", importe=" + importe + ", afiliado=" + afiliado + ", prestador=" + prestador + '}';
    }
    
    
    
}
