package Principal;

import clases.Cliente;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.MCliente;

public class IUClientes extends javax.swing.JInternalFrame {

    public IUClientes() {
        initComponents();
        //CboTipoCliente.setSelectedItem(0);
        mostrar("");
        Editar(false);

        int x = MDIMenuPrincipal.desktopPane.getWidth() - this.getWidth();
        int y = MDIMenuPrincipal.desktopPane.getHeight() - this.getHeight();
        setLocation(x / 2, y / 2);
    }
    //Declaramos un variable para definir una accion
    private String Accion = "Guardar";

    //oculta columnas que no se deben mostrar en la tabal
    void Ocultarcolumnas() {
        tablaClientes.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaClientes.getColumnModel().getColumn(0).setMinWidth(0);
        tablaClientes.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    public void Limpiar() {
        this.txtCodigo.setText(null);
        this.txtNombre.setText(null);
        this.txtApellido.setText(null);
        this.txtTipoPersona.setText(null);
        this.txtDireccion.setText(null);
        this.txtEmail.setText(null);
        this.txtTelefono.setText(null);
    }

    public void Editar(boolean var) {
        this.txtCodigo.setEnabled(var);
        this.txtNombre.setEnabled(var);
        this.txtApellido.setEnabled(var);
        this.txtTipoPersona.setEnabled(var);
        this.txtDireccion.setEnabled(var);
        this.txtEmail.setEnabled(var);
        this.txtTelefono.setEnabled(var);
        this.btnGuardar.setEnabled(var);
        this.btnEliminar.setEnabled(var);
        this.btnSalir.setEnabled(var);
        this.btnBuscar.setEnabled(var);
        //this.btnCreaAlmacen.setEnabled(var);
    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            MCliente man = new MCliente();
            modelo = man.mostrar(buscar);
            tablaClientes.setModel(modelo);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtTipoPersona = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        PanelMostrarClientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();

        setClosable(true);
        setTitle("M A N T E N I M I E N T O     C L I E N T ES");
        setPreferredSize(new java.awt.Dimension(815, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Codigo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 30, 60, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Apellido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Direccion:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tipo Persona");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("E-mail");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 70, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Telefono:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 80, -1));

        txtNombre.setForeground(new java.awt.Color(255, 102, 102));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 160, -1));

        txtApellido.setForeground(new java.awt.Color(255, 102, 102));
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 160, -1));

        txtDireccion.setForeground(new java.awt.Color(255, 102, 102));
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 160, -1));

        txtEmail.setForeground(new java.awt.Color(255, 102, 102));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 160, -1));

        txtTelefono.setForeground(new java.awt.Color(255, 102, 102));
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 160, -1));

        txtCodigo.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 90, -1));

        txtTipoPersona.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(txtTipoPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 160, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 490, 250));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(49, 63, 97));
        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Salir.gif"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, -1));

        btnGuardar.setBackground(new java.awt.Color(49, 63, 97));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Guardar.gif"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 130, -1));

        btnEliminar.setBackground(new java.awt.Color(49, 63, 97));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 130, 30));

        btnBuscar.setBackground(new java.awt.Color(49, 63, 97));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Buscar.gif"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, 30));

        btnNuevo.setBackground(new java.awt.Color(49, 63, 97));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nuevo.gif"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 180, 230));

        PanelMostrarClientes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mostrar Registros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(0, 0, 255))); // NOI18N
        PanelMostrarClientes.setPreferredSize(new java.awt.Dimension(450, 180));
        PanelMostrarClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(652, 602));

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Apellidos", "Dirección", "Cargo", "Email", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClientes.setPreferredSize(new java.awt.Dimension(95, 180));
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        PanelMostrarClientes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 720, 190));

        jLabel8.setText("Buscar por Nombre:");
        PanelMostrarClientes.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 30, 110, -1));
        jLabel8.getAccessibleContext().setAccessibleName("Busqueda por Nombre:");

        txtBuscar.setForeground(new java.awt.Color(255, 102, 102));
        PanelMostrarClientes.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 150, -1));

        lblTotal.setBackground(new java.awt.Color(255, 255, 255));
        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotal.setText("Total:");
        PanelMostrarClientes.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 190, -1));

        getContentPane().add(PanelMostrarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 760, 290));

        getAccessibleContext().setAccessibleName("M A N T E N I M I E N T O     C L I E N T ES");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (txtNombre.getText().length() == 0) {
            // JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Nombre");
            JOptionPane.showMessageDialog(this, "Ingresar un Nombre", "Eroor", JOptionPane.ERROR_MESSAGE);
            txtNombre.requestFocus();
            return;
        }
        if (txtApellido.getText().length() == 0) {
            //JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una marca");
            JOptionPane.showMessageDialog(this, "Ingresar un Apellido", "Eroor", JOptionPane.ERROR_MESSAGE);

            txtApellido.requestFocus();
            return;
        }
      
        // String Tipocliente = txtTipoCliente.getText();
        if (txtTipoPersona.getText().length() == 0) {
            //JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una talla");
            JOptionPane.showMessageDialog(this, "ingrese tipo  Cliente", "Eroor", JOptionPane.ERROR_MESSAGE);

            txtTipoPersona.requestFocus();
            return;
        }
        if (txtDireccion.getText().length() == 0) {
            //JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una cantidad");
            JOptionPane.showMessageDialog(this, "Debe ingresar una Dirección", "Eroor", JOptionPane.ERROR_MESSAGE);

            txtDireccion.requestFocus();
            return;
        }
        if (txtEmail.getText().length() == 0) {
            //JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Precio");
            JOptionPane.showMessageDialog(this, "Debes ingresar un correo Electrónico", "Eroor", JOptionPane.ERROR_MESSAGE);
            txtEmail.requestFocus();
            return;
        }
        if (txtTelefono.getText().length() == 0) {
            //JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Precio");
            JOptionPane.showMessageDialog(this, "Debes ingresar Nº Telefono", "Eroor", JOptionPane.ERROR_MESSAGE);
            txtTelefono.requestFocus();
            return;
        }
        // instanciamos la clase
        Cliente dts = new Cliente();
        MCliente func = new MCliente();

        // enviamos los datos a cada numero
        dts.setNombre(txtNombre.getText());
        dts.setApellidos(txtApellido.getText());
        dts.setTipocliente(txtTipoPersona.getText());
        dts.setDireccion(txtDireccion.getText());
        dts.setEmail(txtEmail.getText());
        dts.setTelefono(txtTelefono.getText());

        if (Accion.equals("Guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(this, "Cliente Registrado", "Information", JOptionPane.INFORMATION_MESSAGE);
                mostrar("");//muestre todos los regitros
                Limpiar();
                Editar(false);

            }
        } else if (Accion.equals("editar")) {
            dts.setCodigo(Integer.parseInt(txtCodigo.getText()));

            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(this, "Datos de  Cliente Actualizado", "Information", JOptionPane.INFORMATION_MESSAGE);
                mostrar("");
                Limpiar();
                Editar(false);

            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        txtDireccion.transferFocus();
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        btnGuardar.setText("Guardar");
        Accion = ("Guardar");
        Limpiar();
        Editar(true);
        txtCodigo.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (!txtCodigo.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Desea Eliminar el Cliente?", "Confirmar", 2);

            if (confirmacion == 0) {
                // instanciamos la clase
                Cliente dts = new Cliente();
                MCliente func = new MCliente();
                dts.setCodigo(Integer.parseInt(txtCodigo.getText()));
                func.eliminar(dts);
                mostrar("");
                Limpiar();
                Editar(false);//Desacctiva las cajas de texto
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        mostrar(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        txtNombre.transferFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        txtApellido.transferFocus();
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        txtEmail.transferFocus();
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        txtTelefono.transferFocus();
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked

        btnGuardar.setText("editar");
        Editar(true);
        txtCodigo.setEnabled(true);
        btnEliminar.setEnabled(true);
        Accion = "editar";

        int fila = tablaClientes.rowAtPoint(evt.getPoint());

        txtCodigo.setText(tablaClientes.getValueAt(fila, 0).toString());
        txtNombre.setText(tablaClientes.getValueAt(fila, 1).toString());
        txtApellido.setText(tablaClientes.getValueAt(fila, 2).toString());
        txtTipoPersona.setText(tablaClientes.getValueAt(fila, 3).toString());
        txtDireccion.setText(tablaClientes.getValueAt(fila, 4).toString());
        txtEmail.setText(tablaClientes.getValueAt(fila, 5).toString());
        txtTelefono.setText(tablaClientes.getValueAt(fila, 6).toString());

    }//GEN-LAST:event_tablaClientesMouseClicked
    public void limpiar() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
       txtTipoPersona.setText("");
        txtEmail.setText("");
        txtTelefono.setText("");
        txtCodigo.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMostrarClientes;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
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
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipoPersona;
    // End of variables declaration//GEN-END:variables
}
