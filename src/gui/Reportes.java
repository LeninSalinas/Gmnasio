/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author t
 */
public class Reportes extends javax.swing.JDialog {

    /**
     * Creates new form Reportes
     */
    public Reportes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botReporteClientesPDF = new javax.swing.JButton();
        botEvolucionCliente = new javax.swing.JButton();
        botReporteMembresia = new javax.swing.JButton();
        botReportePagos = new javax.swing.JButton();
        botReporteCuentaCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 300));
        setMinimumSize(new java.awt.Dimension(500, 300));
        setPreferredSize(new java.awt.Dimension(500, 300));
        getContentPane().setLayout(null);

        botReporteClientesPDF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botReporteClientesPDF.setText("<html>    REPORTE CLIENTES </p> PDF <html>");
        botReporteClientesPDF.setMaximumSize(new java.awt.Dimension(500, 300));
        botReporteClientesPDF.setMinimumSize(new java.awt.Dimension(500, 300));
        botReporteClientesPDF.setPreferredSize(new java.awt.Dimension(500, 300));
        getContentPane().add(botReporteClientesPDF);
        botReporteClientesPDF.setBounds(30, 50, 130, 40);

        botEvolucionCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botEvolucionCliente.setText("<html>EVOLUCION </p> CLIENTE<html>");
        getContentPane().add(botEvolucionCliente);
        botEvolucionCliente.setBounds(30, 100, 130, 40);

        botReporteMembresia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botReporteMembresia.setText("<html>REPORTE </p> MEMBRECIA<html>");
        getContentPane().add(botReporteMembresia);
        botReporteMembresia.setBounds(30, 150, 130, 40);

        botReportePagos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botReportePagos.setText("<html>REPORTE </p> PAGOS<html>");
        getContentPane().add(botReportePagos);
        botReportePagos.setBounds(260, 50, 130, 40);

        botReporteCuentaCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botReporteCuentaCliente.setText("<html>REPORTE CUENTA </p> CLIENTE<html>");
        getContentPane().add(botReporteCuentaCliente);
        botReporteCuentaCliente.setBounds(260, 110, 130, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Reportes dialog = new Reportes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botEvolucionCliente;
    private javax.swing.JButton botReporteClientesPDF;
    private javax.swing.JButton botReporteCuentaCliente;
    private javax.swing.JButton botReporteMembresia;
    private javax.swing.JButton botReportePagos;
    // End of variables declaration//GEN-END:variables
}
