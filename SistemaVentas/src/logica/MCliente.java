package logica;

import clases.Cliente;
import conneccion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MCliente {
    //creando la instanci

    private conexion mysql = new conexion();
    private Connection cn = mysql.coneccion();
    private String sSql = "";
    public Integer TotalResgistros;

    public DefaultTableModel mostrar(String Buscar) {
        DefaultTableModel modelo;

        //vetor para cmacenar los tiluros
        String[] titulos = {"Codigo", "Nombre", "Apellidos", "TipoCliente", "Direccion", "Email", "Telefono"};
        String[] registro = new String[7];
        TotalResgistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSql = "Select * from cliente where nombre like '%" + Buscar + "%' order by id_cliente";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);

            while (rs.next()) {
                registro[0] = rs.getString("id_cliente");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("apellido");
                registro[3] = rs.getString("tipocliente");
                registro[4] = rs.getString("direccion");
                registro[5] = rs.getString("email");
                registro[6] = rs.getString("telefono");
                TotalResgistros = TotalResgistros + 1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {

            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
       public  boolean  insertar(Cliente dts){
       sSql= "insert into cliente (nombre,apellido,tipocliente,direccion,email,telefono)values(?,?,?,?,?,?)";
       try {
           PreparedStatement pst= cn.prepareStatement(sSql);
           pst.setString(1, dts.getNombre());
           pst.setString(2, dts.getApellidos());
           pst.setString(3, dts.getTipocliente());
           pst.setString(4, dts.getDireccion());
           pst.setString(5, dts.getEmail());
           pst.setString(6, dts.getTelefono());
           
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
    public  boolean  editar(Cliente dts){
         sSql= "update  cliente set  nombre=?,apellido=?,tipocliente=?,direccion=?,email=?,telefono=? where id_cliente=?";
       try {
           PreparedStatement pst= cn.prepareStatement(sSql);
          pst.setString(1, dts.getNombre());
           pst.setString(2, dts.getApellidos());
           pst.setString(3, dts.getTipocliente());
           pst.setString(4, dts.getDireccion());
           pst.setString(5, dts.getEmail());
           pst.setString(6, dts.getTelefono());
           pst.setInt(7, dts.getCodigo());
           
           
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
    public  boolean  eliminar(Cliente dts){
      sSql= "delete from cliente where id_cliente=?";

       try {
           PreparedStatement pst= cn.prepareStatement(sSql);
           pst.setInt(1, dts.getCodigo());
           
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