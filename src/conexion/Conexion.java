package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jorge
 */
public class Conexion {

    public static Connection conectar() {
    try {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/systemadeventaenjava?useSSL=false", "root", "");
        return cn;
    } catch (SQLException e) {
        System.out.println("Error en la conexion local: " + e);
    }
    return null;
}
}
