package aacrhealthinsurance;

import Controller.AfiliadoData;
import Controller.EspecialidadData;
import Controller.PrestadorData;
import Model.Afiliado;
import Model.Especialidad;
import Model.Prestador;
import java.util.List;
import org.w3c.dom.ls.LSOutput;

public class AACRHealthInsurance {

    public static void main(String[] args) {
        AfiliadoData afidata = new AfiliadoData();
        PrestadorData prestaData = new PrestadorData();
        EspecialidadData espData = new EspecialidadData();

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
       prestaData.borrarPrestador(2);*/
        //Prueba metodo actualizar prestador
        Especialidad especialidad = espData.obtenerEspecialidadPorId(6);
        Prestador prestador = new Prestador(3, "John", "Cyrus", 100, "Av SUR", "2155", true, especialidad);
        prestaData.actualizarPrestador(prestador);
    }
}
