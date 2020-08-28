package Principal;

import clases.Empleado;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.*;

public class MDIMenuPrincipal extends javax.swing.JFrame {

    public MDIMenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);

    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        treMenu = new javax.swing.JTree();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALZADO  S P O  R T  SHOES");
        setBackground(new java.awt.Color(214, 217, 223));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        desktopPane.setBackground(new java.awt.Color(170, 184, 193));

        jScrollPane1.setBackground(new java.awt.Color(17, 65, 88));

        treMenu.setBackground(new java.awt.Color(201, 215, 191));
        treMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 3));
        treMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        treMenu.setForeground(new java.awt.Color(51, 51, 255));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Gestion Ventas");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Reportes");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Generar Venta");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Generar Factura");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Generar ReportClientes");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Mantenimiento");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Almacen");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Producto");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Empleado");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cliente");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Listados");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Lista Pedidos");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Lista Clientes");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Lista Productos");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Lista Empleados");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treMenu.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treMenu.setShowsRootHandles(true);
        treMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treMenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(treMenu);

        desktopPane.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 250, 640);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/sports.png"))); // NOI18N
        desktopPane.add(jLabel1);
        jLabel1.setBounds(370, 80, 280, 260);

        jLabel2.setFont(new java.awt.Font("Zilla Slab", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("¡ Bienvenido al Sistema !");
        desktopPane.add(jLabel2);
        jLabel2.setBounds(420, 20, 460, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/zapatos.png"))); // NOI18N
        desktopPane.add(jLabel3);
        jLabel3.setBounds(280, 100, 490, 220);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Calzados  Shoes ");
        desktopPane.add(jLabel4);
        jLabel4.setBounds(470, 80, 250, 29);

        getContentPane().add(desktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void treMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treMenuMouseClicked
        // OPCIONES DEL MENU
        String var;
        try {
            if (evt.getClickCount() == 1) {
                var = treMenu.getLastSelectedPathComponent().toString();
                if (var.equals("Almacen")) {
                    IUAlmacen IuAL = new IUAlmacen();
                    desktopPane.add(IuAL);
                    IuAL.setVisible(true);
                } else if (var.equals("Empleado")) {
                    IUEmpleados emle = new IUEmpleados();
                    desktopPane.add(emle);
                    emle.setVisible(true);
                } else if (var.equals("Cliente")) {
                    IUClientes client = new IUClientes();
                    desktopPane.add(client);
                    client.setVisible(true);
                } else if (var.equals("Producto")) {
                    IUProducto IuP = new IUProducto();
                    desktopPane.add(IuP);
                    IuP.setVisible(true);
                } else if (var.equals("Lista Productos")) {
                    IUListarProductos Listp = new IUListarProductos();
                    desktopPane.add(Listp);
                    Listp.setVisible(true);
                } else if (var.equals("Lista Pedidos")) {
                    IUPedido listPed = new IUPedido();
                    desktopPane.add(listPed);
                    listPed.setVisible(true);
                } else if (var.equals("Lista Empleados")) {
                    ListEmpleados emple = new ListEmpleados();
                    desktopPane.add(emple);
                    emple.setVisible(true);
                } else if (var.equals("Lista Clientes")) {
                    ListClientes client = new ListClientes();
                    desktopPane.add(client);
                    client.setVisible(true);
                }else if(var.equals("Generar ReportClientes")){
                    IUReporteClientes reportcli= new IUReporteClientes();
                    desktopPane.add(reportcli);
                    reportcli.setVisible(true);
                }
            }

        } catch (NullPointerException e) {

        }
    }//GEN-LAST:event_treMenuMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MDIMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDIMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDIMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDIMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree treMenu;
    // End of variables declaration//GEN-END:variables

}
