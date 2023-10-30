package Service;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;

public class Pdf {

    public static void generarPdf(JTable table, int index) {
        //Document es una clase de iTextPDF que representa al ducumento PDF a generar...
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("Reporte.pdf"));
            document.open();

            Image imagen = Image.getInstance("src/Images/informes.png");
            document.add(imagen);

            switch (index) {
                case 1:
                    generarEncabezadoLIstadoAfiliados(document);
                    break;
                case 2:
                    generarEncabezadoLIstadoPrestadores(document);
                    break;
                case 3:
                    generarEncabezadoListadoDeOrdenes(document);
                    break;
                case 4:
                    generarEncabezadoPrestadoresPorEspecialidad(document);
                    break;
            }

            PdfPTable pdfTable = new PdfPTable(table.getColumnCount());

            for (int i = 0; i < table.getColumnCount(); i++) {
                PdfPCell cell = new PdfPCell(new Phrase(table.getColumnName(i)));
                // Aplicar color de fondo a fila encabezado
                cell.setBackgroundColor(new BaseColor(200, 200, 200)); // Fondo gris claro
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                pdfTable.addCell(cell);
            }

            for (int row = 0; row < table.getRowCount(); row++) {
                for (int column = 0; column < table.getColumnCount(); column++) {
                    PdfPCell cell = new PdfPCell(new Phrase(table.getValueAt(row, column).toString()));
                    pdfTable.addCell(cell);
                }
            }

            document.add(pdfTable);
            document.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Generar encabezado fijo
    public static void generarEncabezadoFijo(Document document) throws DocumentException {
        //Se instancia un parrafo y se declara su fuente...
        Paragraph header = new Paragraph("Listado de Productos", new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.DEFAULTSIZE));
        //Se alinea el parrafo al centro
        header.setAlignment(Element.ALIGN_CENTER);
        //se agrega al documento la cabecera
        document.add(header);
        document.add(Chunk.NEWLINE);

        // se obtiene hora de generación
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");//formato de Fecha y hora...
        String generationTime = "Generado el " + dateFormat.format(new Date());//Guardo en String la fecha y hora...
        //genero otro parrafo con lahora y fecha...
        Paragraph generationTimePara = new Paragraph(generationTime, new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL));
        generationTimePara.setAlignment(Element.ALIGN_RIGHT);
        //agrego la fecha al documento...
        document.add(generationTimePara);
        //agrego salto de linea
        document.add(Chunk.NEWLINE);
    }

    public static void generarEncabezadoLIstadoAfiliados(Document document) throws DocumentException {
        Paragraph header = new Paragraph("Listado de Afiliados Activos", new Font(Font.FontFamily.COURIER, 18, Font.NORMAL));
        header.setAlignment(Element.ALIGN_CENTER);
        document.add(header);
        document.add(Chunk.NEWLINE);

        // se obtiene hora de generación
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");//formato de Fecha y hora...
        String generationTime = "Generado el " + dateFormat.format(new Date());//Guardo en String la fecha y hora...
        //genero otro parrafo con lahora y fecha...
        Paragraph generationTimePara = new Paragraph(generationTime, new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL));
        generationTimePara.setAlignment(Element.ALIGN_RIGHT);
        //agrego la fecha al documento...
        document.add(generationTimePara);
        //agrego salto de linea
        document.add(Chunk.NEWLINE);
    }

    public static void generarEncabezadoLIstadoPrestadores(Document document) throws DocumentException {
        Paragraph header = new Paragraph("Listado de Prestadores Activos", new Font(Font.FontFamily.COURIER, 18, Font.NORMAL));
        header.setAlignment(Element.ALIGN_CENTER);
        document.add(header);
        document.add(Chunk.NEWLINE);

        // se obtiene hora de generación
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");//formato de Fecha y hora...
        String generationTime = "Generado el " + dateFormat.format(new Date());//Guardo en String la fecha y hora...
        //genero otro parrafo con lahora y fecha...
        Paragraph generationTimePara = new Paragraph(generationTime, new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL));
        generationTimePara.setAlignment(Element.ALIGN_RIGHT);
        //agrego la fecha al documento...
        document.add(generationTimePara);
        //agrego salto de linea
        document.add(Chunk.NEWLINE);
    }

    public static void generarEncabezadoListadoDeOrdenes(Document document) throws DocumentException {
        Paragraph header = new Paragraph("Listado de Ordenes por Fecha", new Font(Font.FontFamily.COURIER, 18, Font.NORMAL));
        header.setAlignment(Element.ALIGN_CENTER);
        document.add(header);
        document.add(Chunk.NEWLINE);

        // se obtiene hora de generación
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");//formato de Fecha y hora...
        String generationTime = "Generado el " + dateFormat.format(new Date());//Guardo en String la fecha y hora...
        //genero otro parrafo con lahora y fecha...
        Paragraph generationTimePara = new Paragraph(generationTime, new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL));
        generationTimePara.setAlignment(Element.ALIGN_RIGHT);
        //agrego la fecha al documento...
        document.add(generationTimePara);
        //agrego salto de linea
        document.add(Chunk.NEWLINE);
    }

    public static void generarEncabezadoPrestadoresPorEspecialidad(Document document) throws DocumentException {
        Paragraph header = new Paragraph("Listado de Prestadores por Especialidad", new Font(Font.FontFamily.COURIER, 18, Font.NORMAL));
        header.setAlignment(Element.ALIGN_CENTER);
        document.add(header);
        document.add(Chunk.NEWLINE);

        // se obtiene hora de generación
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");//formato de Fecha y hora...
        String generationTime = "Generado el " + dateFormat.format(new Date());//Guardo en String la fecha y hora...
        //genero otro parrafo con lahora y fecha...
        Paragraph generationTimePara = new Paragraph(generationTime, new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL));
        generationTimePara.setAlignment(Element.ALIGN_RIGHT);
        //agrego la fecha al documento...
        document.add(generationTimePara);
        //agrego salto de linea
        document.add(Chunk.NEWLINE);
    }

}
