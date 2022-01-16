
package ConexionSQL;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author Luigy Leonardo
 */
public class conexion {
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/finanzas";

    public conexion() {
        conn = null;

    }
public Connection getConnection(){
 
            try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, user, password);
            if (conn != null){
                System.out.println("conexion establecida..");
            }
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar" + e);
        }
    return conn;   
}

public void desconectar (){
    conn = null;
    if(conn == null){
        System.out.print("Conexion Terminada..");
        
    }
}


}