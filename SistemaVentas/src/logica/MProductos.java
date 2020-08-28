package logica;

import clases.Producto;
import conneccion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MProductos {

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
   public  boolean  insertar(Producto dts){
       sSql= "insert into producto (nombre,marca,talla,stock,precio)values(?,?,?,?,?)";
       try {
           PreparedStatement pst= cn.prepareStatement(sSql);
           pst.setString(1, dts.getNombre());
           pst.setString(2, dts.getMarca());
           pst.setString(3, dts.getTalla());
           pst.setInt(4, dts.getStock());
           pst.setFloat(5, dts.getPrecio());
           
           int n = pst.executeUpdate();
           
           if(n!=0){
               return true;
           }else{
               return false;
           }
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           JOptionPane.showMessageDialog(null, "No se Registro","Error",JOptionPane.ERROR_MESSAGE);
           return false;
       }
   }
   //prepararndo para Actulizar
    public  boolean  editar(Producto dts){
         sSql= "update  producto set nombre=?,marca=?,talla=?,stock=?,precio=? where id_producto=?";
       try {
           PreparedStatement pst= cn.prepareStatement(sSql);
           pst.setString(1, dts.getNombre());
           pst.setString(2, dts.getMarca());
           pst.setString(3, dts.getTalla());
           pst.setInt(4, dts.getStock());
           pst.setFloat(5, dts.getPrecio());
           pst.setInt(6, dts.getCodigoProducto());
           
           int n = pst.executeUpdate();
           
           if(n!=0){
               return true;
           }else{
               return false;
           }
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
            JOptionPane.showMessageDialog(null, "No se puede actualizar","Error",JOptionPane.ERROR_MESSAGE);
           return false;
       }
   }
    //eliminar
    public  boolean  eliminar(Producto dts){
      sSql= "delete from producto where id_producto=?";

       try {
           PreparedStatement pst= cn.prepareStatement(sSql);
           pst.setInt(1, dts.getCodigoProducto());
           
           int n = pst.executeUpdate();
           
           if(n!=0){
               return true;
           }else{
               return false;
           }
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
}
