
package conneccion;
import com.sun.xml.internal.ws.server.UnsupportedMediaException;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexion {
   
    public Connection coneccion() {
        Connection cn = null;
        Statement st;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/ventas_shoes","root","");
            System.out.println("Se hizo la connecion exitosa");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }return cn;
    }
   
        Statement createStatement() {
        throw new UnsupportedMediaException("No Soportado");
    }
    
        /*Connection link = null;
        try {
            Class.forName("org.git.mm.mysql.Driver");
            //Class.forName("com.mysql.jdbc.Driver");
            link = DriverManager.getConnection(this.url, this.users, this.password);

        } catch (ClassNotFoundException | SQLException e) {
         JOptionPane.showConfirmDialog(null, e);
         
        }
        return link;
    }*/
}
