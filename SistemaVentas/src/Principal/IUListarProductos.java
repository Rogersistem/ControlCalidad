package Principal;

//import clases.Almacen;
import clases.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.MProductos;

public class IUListarProductos extends javax.swing.JInternalFrame {

    public IUListarProductos() {
        initComponents();
        mostrar("");
        int x = MDIMenuPrincipal.desktopPane.getWidth() - this.getWidth();
        int y = MDIMenuPrincipal.desktopPane.getHeight() - this.getHeight();
        setLocation(x / 2, y / 2);
    }
    //oculta las columnas que no oquieres mostrar en la latbla
    void Ocultarcolumnas() {
        tblProductos.getColumnModel().getColumn(0).setMaxWidth(0);
        tblProductos.getColumnModel().getColumn(0).setMinWidth(0);
        tblProductos.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            MProductos man = new MProductos();
            modelo = man.mostrar(buscar);
            tblProductos.setModel(modelo);
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
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        setClosable(true);
        setTitle("L I S T A   D E    P R O D U C T O S");
        setMinimumSize(new java.awt.Dimension(87, 48));
        setPreferredSize(new java.awt.Dimension(660, 420));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(0, 51, 204))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 160, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Por Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 37, -1, 20));

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
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 90, 30));

        tblProductos.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
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
                "Codigo", "Nombre", "Descripción", "Categoría", "Stock", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductos.setGridColor(new java.awt.Color(51, 51, 51));
        tblProductos.setMinimumSize(new java.awt.Dimension(90, 74));
        tblProductos.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tblProductos.setSelectionForeground(new java.awt.Color(153, 153, 153));
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(0).setHeaderValue("Codigo");
            tblProductos.getColumnModel().getColumn(1).setHeaderValue("Nombre");
            tblProductos.getColumnModel().getColumn(2).setHeaderValue("Descripción");
            tblProductos.getColumnModel().getColumn(3).setHeaderValue("Categoría");
            tblProductos.getColumnModel().getColumn(4).setHeaderValue("Stock");
            tblProductos.getColumnModel().getColumn(5).setHeaderValue("Precio");
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 540, 190));

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTotal.setText("Total");
        jPanel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 170, 30));
        lblTotal.getAccessibleContext().setAccessibleName("lbltotal");

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
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 90, 30));

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
        jPanel1.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 30, 100, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 640, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        List lis = new ArrayList();
        for (int i = 0; i < tblProductos.getRowCount(); i++) {
            //Producto pro = new Producto(tblProductos.getValueAt(i,0),tblProductos.getValueAt(i,1),tblProductos.getValueAt(i,2),tblProductos.getValueAt(i,3), tblProductos.getValueAt(i,4),tblProductos.getValueAt(i,5));
            //https://www.youtube.com/watch?v=3dJ38WWTIZU
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        mostrar(txtBuscar.getText());

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked

        int fila = tblProductos.rowAtPoint(evt.getPoint());

        txtBuscar.setText(tblProductos.getValueAt(fila, 0).toString());
    }//GEN-LAST:event_tblProductosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
