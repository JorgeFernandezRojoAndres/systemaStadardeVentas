package controlador;

import java.sql.SQLException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import conexion.Conexion;
import java.awt.Font;
import java.io.IOException;
import javax.swing.JOptionPane;


/**
 *
 * @author Jorge
 */
public class Reportes {

    //metodo para crear reporte de los clientes registrados en el sistema
    public void ReporteClientes() throws FileNotFoundException, IOException {

        Document documento = new Document();

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reportes_Clientes.pdf"));
            Image header = Image.getInstance("src/img/header1.jpg");
            header.scaleToFit(650, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);

            //  Formato de texto
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Reporte creado por \nJorge Fernandez ©\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("Reporte de Cliente\n\n");

            documento.open();
            //agregamos los datos
            documento.add(header);
            documento.add(parrafo);

            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("Codigo");
            tabla.addCell("Nombre");
            tabla.addCell("Dni");
            tabla.addCell("Telefono");
            tabla.addCell("Direccion");

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "SELECT idCliente, CONCAT(nombre, ' ', apellido) AS nombres, dni, telefono, direccion FROM tb_clientes");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                    } while (rs.next());
                    documento.add(tabla);
                }

            } catch (SQLException e) {
                System.out.println("Error 4 e :" + e);
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte Creado");

        } catch (DocumentException e) {
            System.out.println("Error 1 en : " + e);            
        } catch (FileNotFoundException ex) {
            System.out.println("Error 2 en : " + ex);
        } catch (IOException ex) {
            System.out.println("Error 3 en : " + ex);
        }
    
        
    }


    //metodo para crear reporte de los Productos registrados en el sistema
    public void ReporteProductos() throws FileNotFoundException, IOException {

        Document documento = new Document();

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reportes_Productos.pdf"));
            Image header = Image.getInstance("src/img/header1.jpg");
            header.scaleToFit(650, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);

            //  Formato de texto
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Reporte creado por \nJorge Fernandez ©\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("Reporte de Productos\n\n");

            documento.open();
            //agregamos los datos
            documento.add(header);
            documento.add(parrafo);
            
            float[] columnsWidths ={3, 5, 4, 5, 7, 5, 6};

            PdfPTable tabla = new PdfPTable(columnsWidths);
            tabla.addCell("Codigo");
            tabla.addCell("Nombre");
            tabla.addCell("Cant.");
            tabla.addCell("Precio");
            tabla.addCell("Descripcion");
            tabla.addCell("Por. Iva");
            tabla.addCell("Categoria");

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        " select p.idProducto, p.nombre, p.cantidad, p.precio, p.descripcion,"
                                + " p.porcentajeIva, c.descripcion as categoria, p.estado "
                                + "from tb_producto as p, tb_categoria as c where p.idCategoria = c.idCategoria;");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));
                        tabla.addCell(rs.getString(7));
                    } while (rs.next());
                    documento.add(tabla);
                }

            } catch (SQLException e) {
                System.out.println("Error 4 e :" + e);
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte Creado");

        } catch (DocumentException e) {
            System.out.println("Error 1 en : " + e);            
        } catch (FileNotFoundException ex) {
            System.out.println("Error 2 en : " + ex);
        } catch (IOException ex) {
            System.out.println("Error 3 en : " + ex);
        }
    
        
    }
    
    //metodo para crear reporte de las categorias registradas en el sistema
    public void ReporteCategorias() throws FileNotFoundException, IOException {

        Document documento = new Document();

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reportes_Categorias.pdf"));
            Image header = Image.getInstance("src/img/header1.jpg");
            header.scaleToFit(650, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);

            //  Formato de texto
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Reporte creado por \nJorge Fernandez ©\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("Reporte de CAtegorias \n\n");

            documento.open();
            //agregamos los datos
            documento.add(header);
            documento.add(parrafo);

            PdfPTable tabla = new PdfPTable(3);
            tabla.addCell("Codigo");
            tabla.addCell("Descripcion");
            tabla.addCell("Estado");
            

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select * from tb_categoria");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        
                    } while (rs.next());
                    documento.add(tabla);
                }

            } catch (SQLException e) {
                System.out.println("Error 4 e :" + e);
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte Creado");

        } catch (DocumentException e) {
            System.out.println("Error 1 en : " + e);            
        } catch (FileNotFoundException ex) {
            System.out.println("Error 2 en : " + ex);
        } catch (IOException ex) {
            System.out.println("Error 3 en : " + ex);
        }
    
        
    }

        //metodo para crear reporte de las ventas registrados en el sistema
    public void ReporteVentas() throws FileNotFoundException, IOException {

        Document documento = new Document();

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reportes_Ventas.pdf"));
            Image header = Image.getInstance("src/img/header1.jpg");
            header.scaleToFit(650, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);

            //  Formato de texto
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Reporte creado por \nJorge Fernandez ©\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("Reporte de Ventas\n\n");

            documento.open();
            //agregamos los datos
            documento.add(header);
            documento.add(parrafo);
            
            float[] columnsWidths ={3, 9, 4, 5, 3};

            PdfPTable tabla = new PdfPTable(columnsWidths);
            tabla.addCell("Codigo");
            tabla.addCell("Cliente");
            tabla.addCell("Tot.Pagar");
            tabla.addCell("Fecha Venta");
            tabla.addCell("Estado");
            

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "SELECT cv.idCabeceraVenta as id,CONCAT(c.nombre, ' ', c.apellido)"
                                + " as cliente,cv.valorPagar as total,cv.fechaVenta as fecha,"
                                + "cv.estado FROM tb_cabecera_venta as cv JOIN tb_clientes as c "
                                + "ON cv.idCliente = c.idCliente LIMIT 0, 1000; ");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        
                    } while (rs.next());
                    documento.add(tabla);
                }

            } catch (SQLException e) {
                System.out.println("Error 4 e :" + e);
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte Creado");

        } catch (DocumentException e) {
            System.out.println("Error 1 en : " + e);            
        } catch (FileNotFoundException ex) {
            System.out.println("Error 2 en : " + ex);
        } catch (IOException ex) {
            System.out.println("Error 3 en : " + ex);
        }
    
        
    }


}
