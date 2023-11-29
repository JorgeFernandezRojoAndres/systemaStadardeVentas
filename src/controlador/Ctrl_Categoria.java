package controlador;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import modelo.Categoria;

/**
 *
 * @author Jorge
 */
public class Ctrl_Categoria {

    
    //metodo para registrar categoria 
    public boolean guardar(Categoria objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into tb_categoria values(?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getDescripcion());
            consulta.setInt(3, objeto.getEstado());
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
                
            }
            
            cn.close();
            

        } catch (SQLException e) {
            System.out.println("Error al guardar categoria:" + e);

        }
          
         return respuesta;
    }
//metodo para saber si existe la categoria 
    public boolean existeCategoria(String categoria) {
        boolean respuesta = false;
        String sql = "select descripcion from tb_categoria where descripcion ='"+categoria+"';";
        Statement st;       
        
        
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next ()) {
                respuesta = true ;
                
            }
                       

        } catch (SQLException e) {
            System.out.println("Error al consultar categoria:" + e);

        }
          
         return respuesta;
    }
    
    //metodo para Actualizar categoria 
    public boolean actualizar(Categoria objeto, int idCategoria) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement(
                    "update tb_categoria set descripcion = ? where idCategoria='" + idCategoria + "'");
            consulta.setString(1, objeto.getDescripcion());
            
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
                
            }
            
            cn.close();
            

        } catch (SQLException e) {
            System.out.println("Error al Actualizar categoria:" + e);

        }
          
         return respuesta;
    }
    //metodo para Eliminar categoria 
    public boolean eliminar(  int idCategoria) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement(
                    "delete from tb_categoria where idCategoria='" + idCategoria + "'");
            consulta.executeUpdate();
            
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
                
            }
            
            cn.close();
            

        } catch (SQLException e) {
            System.out.println("Error al Eliminar categoria:" + e);

        }
          
         return respuesta;
    }
    

}
