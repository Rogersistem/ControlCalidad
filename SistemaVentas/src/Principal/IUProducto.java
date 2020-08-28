package Principal;

import clases.Producto;
import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.MProductos;

public class IUProducto extends javax.swing.JInternalFrame {
    //Conneción a la DBA 

    public IUProducto() {
        initComponents();
        int x = MDIMenuPrincipal.desktopPane.getWidth() - this.getWidth();
        int y = MDIMenuPrincipal.desktopPane.getHeight() - this.getHeight();
        setLocation(x / 2, y / 2);
        jpanelproductos.setVisible(false);
        mostrar("");
        Editar(false);//desabilitar todas las cajas de texto
    }
    //Declaramos un variable para definir una accion
    private String Accion = "Guardar";
    //oculta las columnas que no oquieres mostrar en la latbla
    void Ocultarcolumnas() {
        tablaListado.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaListado.getColumnModel().getColumn(0).setMinWidth(0);
        tablaListado.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    public void Limpiar() {
        this.txtCodProducto.setText(null);
        this.txtNombre.setText(null);
        this.txtMarca.setText(null);
        this.txtTalla.setText(null);
        this.txtPrecio.setText(null);
        this.txtStock.setText(null);
    }

    public void Editar(boolean var) {
        this.txtCodProducto.setEnabled(var);
        this.txtNombre.setEnabled(var);
        this.txtTalla.setEnabled(var);
        this.txtMarca.setEnabled(var);
        this.txtPrecio.setEnabled(var);
        this.txtStock.setEnabled(var);
        this.btnGuardar.setEnabled(var);
        this.BtnEliminar.setEnabled(var);
        this.btnSalir.setEnabled(var);
        this.btnBuscar.setEnabled(var);
        this.btnCreaAlmacen.setEnabled(var);
    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            MProductos man = new MProductos();
            modelo = man.mostrar(buscar);
            tablaListado.setModel(modelo);
            Ocultarcolumnas();
            lblTotal.setText("Total Registros: " + Integer.toString(man.TotalResgistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelproductos = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtTalla = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        lblTalla = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCodProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        btnCreaAlmacen = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListado = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();

        setBackground(new java.awt.Color(59, 89, 153));
        setClosable(true);
        setTitle("M A N T E N I M I E N T O        P R O D U C T O S");
        setPreferredSize(new java.awt.Dimension(620, 630));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanelproductos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingreso de Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 0, 255))); // NOI18N
        jpanelproductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Precio");
        jpanelproductos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txtTalla.setForeground(new java.awt.Color(255, 51, 51));
        txtTalla.setEnabled(false);
        txtTalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTallaActionPerformed(evt);
            }
        });
        jpanelproductos.add(txtTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 140, -1));

        txtPrecio.setForeground(new java.awt.Color(255, 51, 51));
        txtPrecio.setEnabled(false);
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jpanelproductos.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 140, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Stock");
        jpanelproductos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        txtStock.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtStock.setForeground(new java.awt.Color(255, 51, 51));
        txtStock.setEnabled(false);
        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });
        jpanelproductos.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 140, -1));

        lblTalla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTalla.setText("Talla:");
        jpanelproductos.add(lblTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jpanelproductos.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 340, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        jpanelproductos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cod Producto:");
        jpanelproductos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        txtNombre.setForeground(new java.awt.Color(255, 51, 51));
        txtNombre.setEnabled(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jpanelproductos.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 140, -1));

        txtCodProducto.setForeground(new java.awt.Color(255, 51, 51));
        txtCodProducto.setEnabled(false);
        jpanelproductos.add(txtCodProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Marca");
        jpanelproductos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        txtMarca.setForeground(new java.awt.Color(255, 51, 51));
        txtMarca.setEnabled(false);
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        jpanelproductos.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 140, -1));

        getContentPane().add(jpanelproductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 340, 240));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevo.setBackground(new java.awt.Color(49, 63, 97));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nuevo.gif"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, -1));

        btnGuardar.setBackground(new java.awt.Color(49, 63, 97));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Buscar.gif"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 130, -1));

        btnSalir.setBackground(new java.awt.Color(49, 63, 97));
        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Salir.gif"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setEnabled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 130, -1));

        btnBuscar.setBackground(new java.awt.Color(49, 63, 97));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Modificar.gif"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setEnabled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, -1));

        BtnEliminar.setBackground(new java.awt.Color(49, 63, 97));
        BtnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Eliminar.gif"))); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.setEnabled(false);
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, -1));

        btnCreaAlmacen.setBackground(new java.awt.Color(49, 63, 97));
        btnCreaAlmacen.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnCreaAlmacen.setForeground(new java.awt.Color(255, 255, 255));
        btnCreaAlmacen.setText("Crear Almacen");
        btnCreaAlmacen.setEnabled(false);
        btnCreaAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreaAlmacenActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreaAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 210, 240));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(0, 51, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cod_Producto", "Nombre", "Marca", "Talla", "Stock", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaListado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaListadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaListado);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 470, 160));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Buscar:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, -1));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(255, 102, 102));
        jPanel3.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 160, -1));

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTotal.setText("Registros");
        jPanel3.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 160, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 550, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        btnGuardar.setText("Guardar");
        Accion =("Guardar");
        Limpiar();
        Editar(true);

        jpanelproductos.setVisible(true);
        //this.txtCodProducto.requestFocus();
        txtCodProducto.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtNombre.getText().length() == 0) {
            // JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Nombre");
            JOptionPane.showMessageDialog(this, "Debes ingresar un Nombre", "Eroor", JOptionPane.ERROR_MESSAGE);
            txtNombre.requestFocus();
            return;
        }
        if (txtMarca.getText().length() == 0) {
            //JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una marca");
            JOptionPane.showMessageDialog(this, "Debes ingresar una marca", "Eroor", JOptionPane.ERROR_MESSAGE);

            txtMarca.requestFocus();
            return;
        }
        if (txtTalla.getText().length() == 0) {
            //JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una talla");
            JOptionPane.showMessageDialog(this, "Debes ingresar una talla", "Eroor", JOptionPane.ERROR_MESSAGE);

            txtTalla.requestFocus();
            return;
        }
        if (txtStock.getText().length() == 0) {
            //JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una cantidad");
            JOptionPane.showMessageDialog(this, "Debes ingresar una cantidad", "Eroor", JOptionPane.ERROR_MESSAGE);

            txtStock.requestFocus();
            return;
        }
        if (txtPrecio.getText().length() == 0) {
            //JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Precio");
            JOptionPane.showMessageDialog(this, "Debes ingresar un Precio", "Eroor", JOptionPane.ERROR_MESSAGE);
            txtPrecio.requestFocus();
            return;
        }
        // instanciamos la clase
        Producto dts = new Producto();
        MProductos func = new MProductos();
        // enviamos los datos a cada numero
        dts.setNombre(txtNombre.getText());
        dts.setMarca(txtMarca.getText());
        dts.setTalla(txtTalla.getText());
        dts.setStock(Integer.parseInt(txtStock.getText()));
        dts.setPrecio(Float.parseFloat(txtPrecio.getText()));

        if (Accion.equals("Guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(this, "Producto Guardado", "Information", JOptionPane.INFORMATION_MESSAGE);
                mostrar("");//muestre todos los regitros
                Limpiar();
                Editar(false);

            }
        } else if (Accion.equals("editar")) {
            dts.setCodigoProducto(Integer.parseInt(txtCodProducto.getText()));

            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(this, "Producto Actualizado", "Information", JOptionPane.INFORMATION_MESSAGE);
                mostrar("");
                Limpiar();
                Editar(false);
             
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCreaAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreaAlmacenActionPerformed
        // hace el mmado al almacen

        IUAlmacen almacen1 = new IUAlmacen();
        MDIMenuPrincipal.desktopPane.add(almacen1);
        almacen1.toFront();//permite que se visualice 
        almacen1.setVisible(true);

    }//GEN-LAST:event_btnCreaAlmacenActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        if (!txtCodProducto.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Desea Eliminar el producto?", "Confirmar", 2);

            if (confirmacion == 0) {
                // instanciamos la clase
                Producto dts = new Producto();
                MProductos func = new MProductos();
                dts.setCodigoProducto(Integer.parseInt(txtCodProducto.getText()));
                func.eliminar(dts);
                mostrar("");
                Limpiar();
                Editar(false);//Desacctiva las cajas de texto
            }
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed
    //// codigo para saltar de cuadro en cuadr
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        mostrar(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        txtNombre.transferFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        txtMarca.transferFocus();
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtTallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTallaActionPerformed
        txtTalla.transferFocus();
    }//GEN-LAST:event_txtTallaActionPerformed

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        txtStock.transferFocus();
    }//GEN-LAST:event_txtStockActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        txtPrecio.transferFocus();
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void tablaListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaListadoMouseClicked
        btnGuardar.setText("editar");
        Editar(true);
        txtCodProducto.setEnabled(true);
        BtnEliminar.setEnabled(true);
        Accion = "editar";

        int fila = tablaListado.rowAtPoint(evt.getPoint());

        txtCodProducto.setText(tablaListado.getValueAt(fila, 0).toString());
        txtNombre.setText(tablaListado.getValueAt(fila, 1).toString());
        txtMarca.setText(tablaListado.getValueAt(fila, 2).toString());
        txtTalla.setText(tablaListado.getValueAt(fila, 3).toString());
        txtStock.setText(tablaListado.getValueAt(fila, 4).toString());
        txtPrecio.setText(tablaListado.getValueAt(fila, 5).toString());

        
    }//GEN-LAST:event_tablaListadoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCreaAlmacen;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpanelproductos;
    private javax.swing.JLabel lblTalla;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tablaListado;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodProducto;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTalla;
    // End of variables declaration//GEN-END:variables
}
