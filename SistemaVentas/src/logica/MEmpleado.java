
package logica;

import clases.Empleado;
import conneccion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MEmpleado {
      //creando la instanci

    private conexion mysql = new conexion();
    private Connection cn = mysql.coneccion();
    private String sSql = "";
    public Integer TotalResgistros;

    public DefaultTableModel mostrar(String Buscar){
         DefaultTableModel modelo;

        //vetor para cmacenar los tiluros
        String[] titulos = {"Codigo", "Nombre", "Apellidos", "Direccion", "Cargo", "Email", "Telefono"};
        String[] registro = new String[7];
        TotalResgistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSql = "Select * from empleado where nombre like '%" + Buscar + "%' order by id_empleado";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);

            while (rs.next()) {
                registro[0] = rs.getString("id_empleado");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("apellido");
                registro[3] = rs.getString("direccion");
                registro[4] = rs.getString("cargo");
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
     public  boolean  insertar(Empleado dts){
       sSql= "insert into empleado (nombre,apellido,direccion,cargo,email,telefono)values(?,?,?,?,?,?)";
       try {
           PreparedStatement pst= cn.prepareStatement(sSql);
           pst.setString(1, dts.getNombre());
           pst.setString(2, dts.getApellidos());
           pst.setString(4, dts.getDireccion());
           pst.setString(3, dts.getCargo()); 
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
    public  boolean  editar(Empleado dts){
         sSql= "update  empleado set  nombre=?,apellido=?,direccion=?,cargo=?,email=?,telefono=? where id_empleado=?";
       try {
           PreparedStatement pst= cn.prepareStatement(sSql);
          pst.setString(1, dts.getNombre());
           pst.setString(2, dts.getApellidos());
           pst.setString(4, dts.getDireccion());
           pst.setString(3, dts.getCargo());
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
    public  boolean  eliminar(Empleado dts){
      sSql= "delete from empleado where id_empleado=?";

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
