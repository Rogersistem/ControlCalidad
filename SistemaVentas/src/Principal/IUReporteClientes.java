package Principal;

import conneccion.conexion;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class IUReporteClientes extends javax.swing.JInternalFrame {

    public IUReporteClientes() {
        initComponents();
        int x = MDIMenuPrincipal.desktopPane.getWidth() - this.getWidth();
        int y = MDIMenuPrincipal.desktopPane.getHeight() - this.getHeight();
        setLocation(x / 2, y / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReporte = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(300, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Lista.gif"))); // NOI18N
        btnReporte.setText("Generar Reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        getContentPane().add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 140, 40));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Salir.gif"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 80, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        
      
        try {
            // establemcemos connecciona la bade dedatos

            conexion con = new conexion();
            Connection connec = con.coneccion();

            JasperReport reporte = null;
            String path="C:\\Users\\Lenovo\\Desktop\\ProyectoControlCalidadSoftwrae\\SistemaVentas\\src\\Reportes\\ReporteClientes.jasper";
            //String path="src\\Reportes\\ReporteClientes.jasper";
            
             reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            // llenamos al reporte
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, connec);

            //creamos la vista del reporte
            JasperViewer view = new JasperViewer(jprint, false);
            //para cerrar
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(this, "Ocurrio error","Error",JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(IUReporteClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalir;
    // End of variables declaration//GEN-END:variables
}
