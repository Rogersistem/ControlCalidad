
package logica;

import conneccion.conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MLisProductos {
    //creando la instanci
    private conexion mysql = new conexion();
    private Connection cn = mysql.coneccion();
    private String sSql = "";
    public Integer TotalResgistros;
    
    public DefaultTableModel mostrar(String Buscar) {
        DefaultTableModel modelo;
        
        //vetor para cmacenar los tiluros
        String[] titulos = {"Codigo", "Nombre", "Marca", "Talla", "Stock", "Precio"};
        String[] registro = new String[6];
        TotalResgistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSql = "Select * from producto where nombre like '%" + Buscar + "%' order by id_producto";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);
            
            while (rs.next()) {
                registro[0] = rs.getString("id_producto");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("marca");
                registro[3] = rs.getString("talla");
                registro[4] = rs.getString("stock");
                registro[5] = rs.getString("precio");
                TotalResgistros = TotalResgistros+1;
                modelo.addRow(registro);
            } 
            return modelo;    
        } catch (Exception e) {
            
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
}
