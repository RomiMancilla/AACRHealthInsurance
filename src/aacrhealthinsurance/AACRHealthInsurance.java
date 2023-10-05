
package aacrhealthinsurance;

import Controller.AfiliadoData;
import Model.Afiliado;
import java.util.List;
import org.w3c.dom.ls.LSOutput;


public class AACRHealthInsurance {

    
    public static void main(String[] args) {
        AfiliadoData afidata=new AfiliadoData();
        
        //Prueba método Guardar
        /*Afiliado afiliado=new Afiliado("Juan", "Padilla", "25123123", "Av. Nueva 123", "11456789", true);
        afidata.guardarAfiliado(afiliado);
        
        //Prueba método Eliminar Afiliado
        afidata.eliminarAfiliado(19);
        
        //Prueba método actualizar
        Afiliado newAfiliado=new Afiliado(14, "Aron", "Smith", "123", "Avenida Siempre Viva", "011123456", true);
        afidata.actualizarAfiliado(newAfiliado);
        
        //Prueba método listar afilaidos activos
        List<Afiliado> listaAfi=afidata.listarAfiliados();
        for (Afiliado afiliado : listaAfi) {
            System.out.println(afiliado.getIdAfiliado());
            System.out.println(afiliado.getNombreAfiliado());
            System.out.println(afiliado.getApellidoAfiliado());
            System.out.println(afiliado.getDni());
            System.out.println(afiliado.getDomicilioAfiliado());
            System.out.println(afiliado.getTelefonoAfiliado());
            System.out.println("*****************************");
        }*/
        
        //Prueba Método obtener alumno por ID
        Afiliado afiliado=afidata.obtenerAfiliadoPorId(5);
        if (afiliado!=null) {
            System.out.println("Afiliado Encontrado:");
            System.out.println(afiliado.getApellidoAfiliado());
            System.out.println(afiliado.getNombreAfiliado());
            System.out.println(afiliado.getDni());
        }
        
    }
    
}
