package gui;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import conexion.Conexion;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ReportePDF {

    public ReportePDF() {
        //colocar en el constructor
        crearReportePDF();
    }
//variables globales
    //CREAMOS UNA TABLA TIPO PDF CON EL NUMERO DE COLUMNAS QUE NECESITAMOS
    PdfPTable tabla = new PdfPTable(4);

//CREAMOS UN DOCUMENTO DONDE SE AGREGARA EL LOGO, EL ENCABEZADO Y LA TABLA PDF
    Document reporte = new Document();
    Conexion conect = new Conexion("gimnasio");
    Connection con = null;
    Statement st = null;
//método para crear el reporte

    public void crearReportePDF() {

        try {
            //RUTA DE LA CARPETA DE USUARIO
              String ruta = System.getProperty("user.home");

            //AGREGO LA RUTA DEL DIRECTORIO PRINCIPAL MAS LA RUTA Y CARPETA DONDE QUIERO QUE ME 
            //APAREZCA EL PDF Y LE COLOCO EL NOMBRE QUE QUIERO QUE LLEVE EL DOCUMENTO, EN ESTE CASO TUVE QUE CREAR
            //UNA CARPETA EN EL ESCRITORIO QUE SE LLAMA REPORTES Y AHI MANDO A CREAR EL REPORTE_CLIENTES.PDF
            PdfWriter.getInstance(reporte, new FileOutputStream("C:\\reporteJava\\Reporte_Clientes.pdf"));

            //IMAGEN DEL ENCABEZADO (COLOCAMOS LA RUTA DE NUESTRA IMAGEN Y EL NOMBRE DE LA IMAGEN CON SU EXTENSION)
            com.itextpdf.text.Image logo = com.itextpdf.text.Image.getInstance("C:\\reporteJava\\muscle-shark.png");

            //MEDIDA DE LA IMAGEN DEL ENCABEZADO (LARGO Y ALTO)
            logo.scaleToFit(650, 400);

            //ALINEACION DEL ENCBEZADO
            logo.setAlignment(Chunk.ALIGN_CENTER);

            //DAMOS FORMATO AL TEXTO DEL ENCABEZADO
            Paragraph encabezado = new Paragraph();
            encabezado.setAlignment(Element.ALIGN_CENTER);//ALINEACION
            encabezado.setFont(FontFactory.getFont("Arial", 20, Font.BOLD, BaseColor.BLUE));//TIPO DE FUENTE, FORMATO Y COLOR
            encabezado.add("GYM FIT\n\n");//TEXTO QUE APARECERÁ
            encabezado.setFont(FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.DARK_GRAY));
            encabezado.add("REPORTE DE CLIENTES\n\n");

            //DAMOS FORMATO  LAS COLUMNAS
            Paragraph columna1 = new Paragraph("ID"); //TITULO DE COLUMNA
            columna1.getFont().setStyle(java.awt.Font.BOLD);//TIPO DE FUENTE Y FORMATO
            columna1.getFont().setSize(10);//TAMAÑO DE LA FUENTE
            columna1.getFont().setColor(new BaseColor(153, 0, 0));//COLOR DE LA FUENTE

            Paragraph columna2 = new Paragraph("nombre");
            columna2.getFont().setStyle(java.awt.Font.BOLD);
            columna2.getFont().setSize(10);
            columna2.getFont().setColor(new BaseColor(153, 0, 0));

            Paragraph columna3 = new Paragraph("peso");
            columna3.getFont().setStyle(java.awt.Font.BOLD);
            columna3.getFont().setSize(10);
            columna3.getFont().setColor(new BaseColor(153, 0, 0));

            Paragraph columna4 = new Paragraph("edad");
            columna4.getFont().setStyle(java.awt.Font.BOLD);
            columna4.getFont().setSize(10);
            columna4.getFont().setColor(new BaseColor(153, 0, 0));
            
            Paragraph columna5 = new Paragraph("genero");
            columna3.getFont().setStyle(java.awt.Font.BOLD);
            columna3.getFont().setSize(10);
            columna3.getFont().setColor(new BaseColor(153, 0, 0));

            Paragraph columna6 = new Paragraph("membresia");
            columna4.getFont().setStyle(java.awt.Font.BOLD);
            columna4.getFont().setSize(10);
            columna4.getFont().setColor(new BaseColor(153, 0, 0));

            //AGREGAMOS LAS CELDAS A LA TABLA
            tabla.addCell(columna1);
            tabla.addCell(columna2);
            tabla.addCell(columna3);
            tabla.addCell(columna4);
            tabla.addCell(columna5);
            tabla.addCell(columna6);

            //ABRIMOS EL DOCUMENTO
            reporte.open();
            //AGREGAMOS AL DOCUMENTO, EL LOGO (IMAGEN) Y ENCABEZADO
            //reporte.add(logo);
            reporte.add(encabezado);

            //LLAMAMOS AL METODO BUSCAR EN LA BASE DE DATOS LOS REGISTROS QUE TENEMOS
            BuscarEnBD();

            //ABRIMOS EL PDF UNA VEZ QUE HA SIDO CREADO
            abrirReporte();

        } catch (DocumentException | FileNotFoundException e) {
            System.out.print("ERROR " + e);
        } catch (IOException e) {
            System.out.print("ERROR " + e);
        }
    }
    String encontrado;

    //método para buscar los registros en la BD
    private void BuscarEnBD() {
        try {
            //INSTANCIAMOS LA CONEXION
            Conexion conect = new Conexion("gimnasio");

            //COLOCAMOS LA SENTENCIA SQL SEGUN LA NECESIDAD DEL REPORTE
            String senten = "SELECT * FROM clientes";

            //VARIABLE BANDERA QUE NOS INDICA SI ENCONTRO DATOS O NO
            encontrado = "NO";

            //ESTABLECEMOS LA CONEXION A LA BD
            con = conect.getConexion();

            //CREAMOS EL OBJETO PARA MODELAR LA SENTENCIA
            st = con.createStatement();

            //SE OBTIENEN TODAS LAS FILAS QUE SATISFACEN LAS CONDICIONES DE LA SENTENCIA SQL
            ResultSet rs = st.executeQuery(senten);

            //HACE EL RECORRIDO EN LA TABLA DE LA BD Y LOS VA AGREGANDO A LA TABLA DEL PDF
            if (rs.next()) {
                do {
                    tabla.addCell(rs.getString(1));//AQUI IRÁ EL NUMERO SEGUN LA POSICION DEL CAMPO EN SU TABLA DE LA BD
                    tabla.addCell(rs.getString(2));//EN ESTE CASO 1 ES CODIGO, 2 ES NOMBRE Y ASI SUCESIVAMENTE
                    tabla.addCell(rs.getString(3));
                    tabla.addCell(rs.getString(4));
                    tabla.addCell(rs.getString(5));
                    tabla.addCell(rs.getString(6));
                    
                } while (rs.next());
                reporte.add(tabla);//AGREGAMOS AL DOCUMENTO LA TABLA QUE YA ESTÁ LLENA CON LOS DATOS OBTENIDOS DE LA BD                                 
                encontrado = "SI";
                if (encontrado.equals("NO")) {
                    JOptionPane.showMessageDialog(null, "ID DE CLIENTE NO ENCONTRADO", "ATENCION!", JOptionPane.ERROR_MESSAGE);
                }
                reporte.close();//CERRAMOS EL DOCUMENTO
                JOptionPane.showMessageDialog(null, "REPORTE HA SIDO CREADO!", "ATENCION", 1);
                con.close();//CERRAMOS LA CONEXION
            }
        } catch (DocumentException | HeadlessException | SQLException x) {
            System.out.print("ERROR " + x);
        }
    }

    //método para abrir el PDF
    public void abrirReporte() {
        try {
            //RUTA DEL DIRECTORIO
            String ruta = System.getProperty("user.home");
            //AGREGAMOS LA RUTA DONDE DEBE IR A BUSCAR EL PDF PARA ABRIRLO
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "C:\\reporteJava\\Reporte_Clientes.pdf");
            System.out.println("REPORTE VISUALIZADO");
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) {
        new ReportePDF();
    }

}
