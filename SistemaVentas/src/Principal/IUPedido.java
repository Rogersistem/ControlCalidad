package Principal;

import clases.Almacen;
import clases.DetallePedido;
import clases.Pedido;
//import clases.Producto;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.objects.NativeDate;
import logica.MProductos;

public class IUPedido extends javax.swing.JInternalFrame {

    //Variables Globales
   // static Producto oPr = null;
    static Almacen oAl = null;
    static Pedido oPe = null;
    static DetallePedido oDP = null;

    public IUPedido() {
        initComponents();
        mostrar("");
        int x = MDIMenuPrincipal.desktopPane.getWidth() - this.getWidth();
        int y = MDIMenuPrincipal.desktopPane.getHeight() - this.getHeight();
        setLocation(x / 2, y / 2);
    }

    //Declaramos un variable para definir una accion
    private String Accion = "Guardar";

    //oculta las columnas que no oquieres mostrar en la latbla
    void Ocultarcolumnas() {
        tblDetalle_pedido.getColumnModel().getColumn(0).setMaxWidth(0);
        tblDetalle_pedido.getColumnModel().getColumn(0).setMinWidth(0);
        tblDetalle_pedido.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    public void Limpiar() {
        this.txtNumero.setText(null);
        this.txtFecha.setText(null);
        this.txtCliente.setText(null);
        this.txtEmpleado.setText(null);
        this.txtProducto.setText(null);
        this.txtPrecio.setText(null);
        this.txtCantidad.setText(null);
    }

    public void Editar(boolean var) {
        this.txtNumero.setEnabled(var);
        this.txtFecha.setEnabled(var);
        this.txtCliente.setEnabled(var);
        this.txtEmpleado.setEnabled(var);
        this.txtProducto.setEnabled(var);
        this.txtPrecio.setEnabled(var);
        this.txtCantidad.setEnabled(var);
        this.btnGuardar.setEnabled(var);
        this.btnEliminar.setEnabled(var);
        this.btnSalir.setEnabled(var);
        this.btnBuscar.setEnabled(var);

    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            MProductos man = new MProductos();
            modelo = man.mostrar(buscar);
            tblDetalle_pedido.setModel(modelo);
            Ocultarcolumnas();
            lblTotal.setText("Total Registros: " + Integer.toString(man.TotalResgistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtEmpleado = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalle_pedido = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnIngresoProducto = new javax.swing.JButton();
        btnGenerePedido = new javax.swing.JButton();
        BtnListarProducto = new javax.swing.JButton();
        btnListarPedido = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setClosable(true);
        setTitle("GUI: Pedido Productos");
        setPreferredSize(new java.awt.Dimension(710, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pedido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Fecha:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 60, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Cliente:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Producto:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Precio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 80, -1));

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 130, -1));

        txtEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 130, -1));

        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });
        jPanel1.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 130, -1));

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Cantidad:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 130, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Numero:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 60, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Empleado:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Aceptar.gif"))); // NOI18N
        btnAgregar.setText("Agregar");
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 440, 250));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle Pedido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDetalle_pedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Precio", "Cantidad", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDetalle_pedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDetalle_pedidoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDetalle_pedido);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 470, 190));

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTotal.setText("Total");
        jPanel2.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 180, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Buscar");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));
        jPanel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 180, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 510, 290));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nuevo.gif"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 130, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Guardar.gif"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 130, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Salir.gif"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 130, -1));

        btnIngresoProducto.setText("Ingresar Producto");
        btnIngresoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 130, -1));

        btnGenerePedido.setText("Generar Pedido");
        btnGenerePedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerePedidoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerePedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 130, -1));

        BtnListarProducto.setText("Listar Producto");
        getContentPane().add(BtnListarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 130, 30));

        btnListarPedido.setText("Listar Pedido");
        getContentPane().add(btnListarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 130, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Salir.gif"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 130, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Buscar.gif"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoProductoActionPerformed
        // hace el llamdo al intefaz producto 
        IUProducto product = new IUProducto();
        MDIMenuPrincipal.desktopPane.add(product);
        product.toFront();//permite que se visualice 
        product.setVisible(true);

    }//GEN-LAST:event_btnIngresoProductoActionPerformed

    private void btnGenerePedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerePedidoActionPerformed

        //generamos la variable pedido
        // Generar el pedido
        /*
        String numero, fecha, cliente, empleado;
        int cantidad;
        numero = txtNumero.getText();
        fecha = txtFecha.getText();
        cliente = txtCliente.getText();
        empleado = txtEmpleado.getText();
        cantidad = Integer.parseInt(txtCantidad.getText());*/

 /*
        oPe = new Pedido(numero, fecha, cliente, empleado);
        
       
        oAl = new Almacen("Principal");

        int opcion, stock, cantidadDetalle;
        float preci0;
        for (int i = 0; i < oAl.getNproducto(); i++) {
          System.out.println("Ingrese Cantidad Solicitada [" + i + "]:de producto " + oAl.obtenerProducto(i).getNombre() + ":");
           //txtCantidad.getText(i + oAl.obtenerProducto(i).getNombre());
         */
 /*
            //cantidadDetalle = Integer.parseInt(buf.readLine());
            cantidadDetalle = Integer.parseInt(txtCantidad.getText());
            Producto pro = oAl.obtenerProducto(i);
            //agregar

            oPe.AddDetalle(new DetallePedido(cantidadDetalle, pro.getPrecio(), pro));
         *//*
            //============================
            System.out.println("LISTA PRODUCTOS DE ALMACEN" + oAl.getNombre());
                    System.out.println("==========================");
                    //recorre arreglo de productos 
                    for (int i = 0; i < oAl.getNproducto(); i++) {
                        Producto pro = oAl.obtenerProducto(i);

                        System.out.println(pro.toString());
                        System.out.println("CodigoProducto...... :" + pro.getCodigoProducto());
                        System.out.println("Nombre.............. :" + pro.getNombre());
                        System.out.println("Descripción......... :" + pro.getDescripcion());
                        System.out.println("Categoria........... :" + pro.getCategoria());
                        System.out.println("Stok................ :" + pro.getStock());
                        System.out.println("Precio.............. :S/." + pro.getPrecio());
         */

    }//GEN-LAST:event_btnGenerePedidoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        btnGuardar.setText("Guardar");
        Accion = ("Guardar");
        Limpiar();
        Editar(true);
        txtNumero.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtCliente.getText().length() == 0) {
            // JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Nombre");
            JOptionPane.showMessageDialog(this, "Debes ingresar un codigo de cliente existente", "Eroor", JOptionPane.ERROR_MESSAGE);
            txtCliente.requestFocus();
            return;
        }
        if (txtEmpleado.getText().length() == 0) {
            //JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una marca");
            JOptionPane.showMessageDialog(this, "Debes ingresar codigo existente de Cliente", "Eroor", JOptionPane.ERROR_MESSAGE);

            txtEmpleado.requestFocus();
            return;
        }
        if (txtFecha.getText().length() == 0) {
            //JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una talla");
            JOptionPane.showMessageDialog(this, "Debes ingresar una Fecha", "Eroor", JOptionPane.ERROR_MESSAGE);

            txtFecha.requestFocus();
            return;
        }
        if (txtCantidad.getText().length() == 0) {
            //JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una cantidad");
            JOptionPane.showMessageDialog(this, "Debes ingresar una Cantidad", "Eroor", JOptionPane.ERROR_MESSAGE);

            txtCantidad.requestFocus();
            return;
        }/*
        if (txtPrecio.getText().length() == 0) {
            //JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Precio");
            JOptionPane.showMessageDialog(this, "Debes ingresar un Precio", "Eroor", JOptionPane.ERROR_MESSAGE);
            txtPrecio.requestFocus();
            return;
        }*/
        // instanciamos la clase
      //  Pedido dts = new Pedido();
        
        // enviamos los datos a cada numero
        /*dts.setCliente(Integer.parseInt(txtCliente.getText()));
        dts.setEmpleado(Integer.parseInt(txtEmpleado.getText()));
        dts.setFecha(txtFecha.getText());
        dts.setNdetalle(Integer.parseInt(txtCantidad.getText()));
*//*
        if (Accion.equals("Guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(this, "Pedido Guardado", "Information", JOptionPane.INFORMATION_MESSAGE);
                mostrar("");//muestre todos los regitros
                Limpiar();
                Editar(false);

            }
        } else if (Accion.equals("editar")) {
            //dts.setNumero(Integer.parseInt(txtNumero.getText()));

            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(this, "Pedido Actualizado", "Information", JOptionPane.INFORMATION_MESSAGE);
                mostrar("");
                Limpiar();
                Editar(false);

            }
        }
        */
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (!txtNumero.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Desea Eliminar el pedido?", "Confirmar", 2);

            if (confirmacion == 0) {
                // instanciamos la clase
               // Pedido dts = new Pedido();
              
                //dts.setNumero(Integer.parseInt(txtNumero.getText()));
             
                mostrar("");
                Limpiar();
                Editar(false);//Desacctiva las cajas de texto
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        mostrar(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        txtNumero.requestFocus();
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        txtFecha.requestFocus();
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        txtCliente.requestFocus();
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpleadoActionPerformed
        txtEmpleado.requestFocus();
    }//GEN-LAST:event_txtEmpleadoActionPerformed

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        txtProducto.requestFocus();
    }//GEN-LAST:event_txtProductoActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        txtPrecio.requestFocus();
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        txtCantidad.requestFocus();
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void tblDetalle_pedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDetalle_pedidoMouseClicked
        btnGuardar.setText("editar");
        Editar(true);
        txtNumero.setEnabled(true);
        btnEliminar.setEnabled(true);
        Accion = "editar";

        int fila = tblDetalle_pedido.rowAtPoint(evt.getPoint());

        txtNumero.setText(tblDetalle_pedido.getValueAt(fila, 0).toString());
        txtCliente.setText(tblDetalle_pedido.getValueAt(fila, 1).toString());
        txtEmpleado.setText(tblDetalle_pedido.getValueAt(fila, 2).toString());
        txtFecha.setText(tblDetalle_pedido.getValueAt(fila, 3).toString());
        txtCantidad.setText(tblDetalle_pedido.getValueAt(fila, 4).toString());
        //txtPrecio.setText(tblDetalle_pedido.getValueAt(fila, 5).toString());

    }//GEN-LAST:event_tblDetalle_pedidoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnListarProducto;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerePedido;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnIngresoProducto;
    private javax.swing.JButton btnListarPedido;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblDetalle_pedido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtEmpleado;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
