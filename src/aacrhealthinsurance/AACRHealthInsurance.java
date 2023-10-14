package aacrhealthinsurance;

import Controller.AfiliadoData;
import Controller.EspecialidadData;
import Controller.OrdenData;
import Controller.PrestadorData;
import Model.Afiliado;
import Model.Especialidad;
import Model.FormaDePagoEnum;
import Model.Orden;
import Model.Prestador;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.ls.LSOutput;

public class AACRHealthInsurance {

    public static void main(String[] args) {
        AfiliadoData afiData = new AfiliadoData();
        PrestadorData prestaData = new PrestadorData();
        EspecialidadData espData = new EspecialidadData();
        OrdenData ordenData = new OrdenData();
        //Prueba métodos de AfiliadoData
        //Prueba método Guardar
        /*Afiliado afiliado=new Afiliado("Juan", "Padilla", "25123123", "Av. Nueva 123", "11456789", true);
        afidata.guardarAfiliado(afiliado);
        
        //Prueba método Eliminar Afiliado
        afidata.eliminarAfiliado(19);
        
        //Prueba método actualizar
        Afiliado newAfiliado=new Afiliado(14, "Aron", "Smith", "123", "Avenida Siempre Viva", "011123456", true);
        afidata.actualizarAfiliado(newAfiliado);
        
        //Prueba método listar afiliados activos
        List<Afiliado> listaAfi=afidata.listarAfiliados();
        for (Afiliado afiliado : listaAfi) {
            System.out.println(afiliado.getIdAfiliado());
            System.out.println(afiliado.getNombreAfiliado());
            System.out.println(afiliado.getApellidoAfiliado());
            System.out.println(afiliado.getDni());
            System.out.println(afiliado.getDomicilioAfiliado());
            System.out.println(afiliado.getTelefonoAfiliado());
            System.out.println("*****************************");
        }
        //Prueba Método obtener alumno por ID
        Afiliado afiliado=new Afiliado();
        afiliado=afidata.obtenerAfiliadoPorId(10);
        if (afiliado!=null) {
            System.out.println(afiliado.getIdAfiliado());
            System.out.println(afiliado.getApellidoAfiliado());
            System.out.println(afiliado.getNombreAfiliado());
            System.out.println(afiliado.getDni());
            System.out.println(afiliado.getDomicilioAfiliado());
            System.out.println(afiliado.getTelefonoAfiliado());
        }else System.out.println("No se encontró el afiliado.");
    }
        //-------------------------------------------------------
        //Prueba de métodos de Especialidades
        Especialidad especialidad1=new Especialidad("Rayos X", true);
        espData.agregarEspecialidad(especialidad1);
        
        //Prueba método Eliminar Especialidades
        espData.eliminarEspecialidad(22);
        
        //Prueba método actualizar Especialidad
        espData.actualizarEspecialidad(new Especialidad(18, "Cardiopatia1", true));
        
        //Prueba método listar Especialidades
        List<Especialidad> listaEspecialidades=espData.listarEspecialidades();
        if (listaEspecialidades!=null) {
            System.out.println("LISTADO DE ESPECIALIDADES:");
            for (Especialidad especialidad : listaEspecialidades) {
                System.out.println(especialidad.getIdEspecialidad());
                System.out.println(especialidad.getNombreEspecialidad());
                System.out.println("******************************");
            }
        }
        
        //Prueba método buscar especialidad por ID
        Especialidad especialidad=espData.obtenerEspecialidadPorId(5);
        System.out.println("Especialidad encontrada:");
        System.out.println(especialidad.getIdEspecialidad());
        System.out.println(especialidad.isEstado());
        
        //**************************************************
        //Pruebas de métodos de Prestador Data
        Especialidad especialidad=espData.obtenerEspecialidadPorId(8);
        Prestador prestador=new Prestador("John", "Wicht", 1000, "Continental Hotel", "123123", especialidad, true);
        prestaData.guardarPrestador(prestador);
         
        //Prueba de método buscar prestador por ID
        Prestador presta = prestaData.obtenerPrestadorPorId(5);
        if (presta!=null) {
            System.out.println("Datos del Prestador");
            System.out.println(presta.getIdPrestador());
            System.out.println(presta.getApellidoPrestador());
            System.out.println(presta.getNombrePrestador());
            System.out.println(presta.getDomicilioPrestador());
            System.out.println(presta.getTelefonoPrestador());
            System.out.println(presta.getEspecialidad().getNombreEspecialidad());
            System.out.println(presta.getMatricula());
            System.out.println(presta.getEstado());
            
        }else System.out.println("No hay Prestador con ese ID");
       //Prueba metodo eliminar prestador
       prestaData.borrarPrestador(2);
        //Prueba metodo actualizar prestador
        Especialidad especialidad = espData.obtenerEspecialidadPorId(5);
        Prestador prestador = new Prestador(3, "John", "Cyrus", 100, "Av SUR", "2155", true, especialidad);
        prestaData.actualizarPrestador(prestador);
        //Prueba Metodo Listar Prestadores
        List<Prestador> lista = prestaData.listarPrestadores();
        if(lista!= null){
            for (Prestador prestador : lista) {
                System.out.println(prestador.getIdPrestador());
                System.out.println(prestador.getNombrePrestador());
                System.out.println(prestador.getApellidoPrestador());
                System.out.println(prestador.getMatricula());
                System.out.println(prestador.getTelefonoPrestador());
                System.out.println(prestador.getDomicilioPrestador());
                System.out.println(prestador.isEstado());
                if(prestador.getEspecialidad()!=null){
                System.out.println(prestador.getEspecialidad().getIdEspecialidad());
                System.out.println(prestador.getEspecialidad().getNombreEspecialidad());
                }
                System.out.println("----------------------------------------------------");
            }
             
        }
        //**********************************************************************************
        //Prueba de métodos de Órdenes
        //Prueba Metodo guardarOrden
        Afiliado afiliado = afiData.obtenerAfiliadoPorId(1);
        Prestador prestador = prestaData.obtenerPrestadorPorId(2);
        Orden orden = new Orden(LocalDate.of(2023, Month.MARCH, 15),FormaDePagoEnum.EFECTIVO,500.0,true,afiliado,prestador);
        ordenData.guardarOrden(orden);
        //Prueba Metodo buscarOrdenPorId
        Orden orden = ordenData.buscarOrdenPorID(100);
        if (orden != null) {
            System.out.println(orden.getIdOrden());
            System.out.println(orden.getFecha());
            System.out.println(orden.getFormaDePago());
            System.out.println(orden.getImporte());
            System.out.println(orden.isEstado());
            System.out.println(orden.getAfiliado());
            System.out.println(orden.getPrestador());
        }
        //Prueba método Eliminar Orden
        ordenData.eliminarOrden(1);

        //Prueba método actualizar orden
        Afiliado afiliado=afiData.obtenerAfiliadoPorId(14);
        Prestador prestador=prestaData.obtenerPrestadorPorId(7);
        Orden orden = new Orden(1,LocalDate.of(2023, 11, 1), FormaDePagoEnum.MERCADOPAGO, 4500.0, true, afiliado, prestador);
        ordenData.actualizarOrden(orden);
        
        //Prueba de método Listar Ordenes
        List<Orden> lista = ordenData.listaDeOrdenes();
        for (Orden orden : lista) {
            System.out.println(orden.getIdOrden());
            System.out.println(orden.getFecha());
            System.out.println(orden.getFormaDePago().name());
            System.out.println(orden.getImporte());
            System.out.println(orden.getAfiliado().getIdAfiliado());
            System.out.println(orden.getPrestador().getIdPrestador());
            System.out.println("*************************");
        }*/
    }
}
