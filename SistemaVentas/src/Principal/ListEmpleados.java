
package Principal;

import conneccion.conexion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.MEmpleado;

public class ListEmpleados extends javax.swing.JInternalFrame {

  
    public ListEmpleados() {
        initComponents();
        mostrar("");
        int x = MDIMenuPrincipal.desktopPane.getWidth() - this.getWidth();
        int y = MDIMenuPrincipal.desktopPane.getHeight() - this.getHeight();
        setLocation(x / 2, y / 2);
    }
    //oculta las columnas que no oquieres mostrar en la latbla
    void Ocultarcolumnas() {
        TablaEmpleados.getColumnModel().getColumn(0).setMaxWidth(0);
        TablaEmpleados.getColumnModel().getColumn(0).setMinWidth(0);
        TablaEmpleados.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
     void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            MEmpleado man = new MEmpleado();
            modelo = man.mostrar(buscar);
            TablaEmpleados.setModel(modelo);
            Ocultarcolumnas();
            lblTotal.setText("Total Registros: " + Integer.toString(man.TotalResgistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMostrarRegistros = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEmpleados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        btnMostrarLista = new javax.swing.JButton();

        setTitle("L I S T A       E M P L E A D O S");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelMostrarRegistros.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mostrar Registros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 0, 255))); // NOI18N
        PanelMostrarRegistros.setPreferredSize(new java.awt.Dimension(500, 180));
        PanelMostrarRegistros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(652, 602));

        TablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null, null},
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
        TablaEmpleados.setPreferredSize(new java.awt.Dimension(95, 180));
        jScrollPane1.setViewportView(TablaEmpleados);

        PanelMostrarRegistros.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 720, 200));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Por Nombre:");
        PanelMostrarRegistros.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 27, 110, 30));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(255, 51, 51));
        PanelMostrarRegistros.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 160, 30));

        btnBuscar.setBackground(new java.awt.Color(49, 63, 97));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Buscar.gif"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        PanelMostrarRegistros.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 90, 30));

        btnImprimir.setBackground(new java.awt.Color(49, 63, 97));
        btnImprimir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Imprimir.gif"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        PanelMostrarRegistros.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 30, 100, 30));

        btnSalir.setBackground(new java.awt.Color(49, 63, 97));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Salir.gif"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        PanelMostrarRegistros.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 90, 30));

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTotal.setText("Total");
        PanelMostrarRegistros.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 170, 30));

        getContentPane().add(PanelMostrarRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 340));

        btnMostrarLista.setBackground(new java.awt.Color(49, 63, 97));
        btnMostrarLista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMostrarLista.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarLista.setText("MostrarLista");
        btnMostrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarListaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 140, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarListaActionPerformed
         //jTable1.setModel(metodo.listaeMPleados());
        //PanelMostrarRegistros.setVisible(true);
    }//GEN-LAST:event_btnMostrarListaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        mostrar(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
       conexion cn= new conexion();
         
        
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMostrarRegistros;
    private javax.swing.JTable TablaEmpleados;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnMostrarLista;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
