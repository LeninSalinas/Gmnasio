package GUI;


import conexion.Conexion;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Membresias extends javax.swing.JDialog {

    
    public Membresias(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize(683, 510);
        setLocationRelativeTo(null);
        jtfID.setText(String.valueOf(buscarID()));
    }
    
    //VARIABLES GLOBALES
    Conexion conect = new Conexion("gimnasio");
    Connection con = null;
    Statement st = null;
    //VARIABLES GLOBALES PARA LA TABLA (JTABLE)
    DefaultTableModel modelo;
    Object Miembro[] = new Object[7];
    // String 
    String encontrado;
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtfID = new javax.swing.JTextField();
        jtfTipo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jtfMatricula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfPrecio = new javax.swing.JTextField();
        botVolver = new javax.swing.JButton();
        botCrear = new javax.swing.JButton();
        botListar = new javax.swing.JButton();
        botCambiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabMiembros = new javax.swing.JTable();
        botBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("PRECIO");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 70, 20));

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("ID ");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 20));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("PRECIO");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 70, 20));

        jtfID.setEditable(false);
        jPanel5.add(jtfID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 112, 32));
        jPanel5.add(jtfTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 116, 112, 32));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("MATRICULA");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, 20));
        jPanel5.add(jtfMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 112, 32));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("TIPO");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 20));
        jPanel5.add(jtfPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 112, 32));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 490));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 490));

        botVolver.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botVolver.setText("VOLVER");
        botVolver.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 102, 255), new java.awt.Color(153, 255, 255)));
        botVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botVolverActionPerformed(evt);
            }
        });
        jPanel1.add(botVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 100, 50));

        botCrear.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botCrear.setText("CREAR");
        botCrear.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 102, 255), new java.awt.Color(153, 255, 255)));
        botCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCrearActionPerformed(evt);
            }
        });
        jPanel1.add(botCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 100, 50));

        botListar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botListar.setText("LISTAR");
        botListar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 102, 255), new java.awt.Color(153, 255, 255)));
        botListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botListarActionPerformed(evt);
            }
        });
        jPanel1.add(botListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 100, 50));

        botCambiar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botCambiar.setText("CAMBIAR");
        botCambiar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 102, 255), new java.awt.Color(153, 255, 255)));
        botCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCambiarActionPerformed(evt);
            }
        });
        jPanel1.add(botCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 100, 50));

        tabMiembros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "         ID", "         TIPO", "         PRECIO", "     MATRICULA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabMiembros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 430, 240));

        botBorrar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botBorrar.setText("BORRAR");
        botBorrar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 102, 255), new java.awt.Color(153, 255, 255)));
        botBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(botBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 100, 50));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 680, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCrearActionPerformed
        crearMembresia();
        limpiarTabla();
        limpiar();
        buscarMembresia();
        
    }//GEN-LAST:event_botCrearActionPerformed

    private void botListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botListarActionPerformed
        limpiarTabla();
        buscarMembresia();
    }//GEN-LAST:event_botListarActionPerformed

    private void botCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCambiarActionPerformed
        actualizarMembresia();
        limpiar();
    }//GEN-LAST:event_botCambiarActionPerformed

    private void botBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botBorrarActionPerformed
        eliminarMembresia();
        limpiarTabla();
        limpiar();
        buscarMembresia();
    }//GEN-LAST:event_botBorrarActionPerformed

    private void botVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_botVolverActionPerformed

    public void crearMembresia() {
        try {
            con = conect.getConexion();
            //COLOQUE EN LA SENTENCIA SQL EL NOMBRE DE SU BD Y LOS NOMBRE DE LOS CAMPOS
            String sql = "INSERT INTO membresia (ID,tipo,precio,matricula,estado) VALUES (?,?,?,?,?)";
            PreparedStatement ps = conect.getConexion().prepareStatement(sql);
            //COLOQUE LOS NOMBRES DE SUS CUADROS DE DIALOGO (JTEXTFIELD)
            ps.setInt(1, 0);
            ps.setString(2, jtfTipo.getText());
            ps.setString(3, jtfPrecio.getText());
            ps.setString(4, jtfMatricula.getText());
            ps.setString(5, "Activo");           
            ps.execute();
            JOptionPane.showMessageDialog(null, "REGISTRO INGRESADO CORRECTAMENTE", "ATENCION!", 1);
            limpiar();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "REGISTRO NO SE PUDO GUARDAR", "ATENCION!" + e, 0);
        }
    }
    
private void buscarMembresia() {
        try {
            String senten = "SELECT * FROM miembros WHERE estado LIKE 'Activo'";
            encontrado = "NO";            
            con = conect.getConexion();
            st = con.createStatement();
            ResultSet rs = st.executeQuery(senten);
            modelo = (DefaultTableModel) tabMiembros.getModel(); //tblDatos es el nombre del JTable

            while (rs.next()) {
                 Miembro[0] = (rs.getInt("ID"));
                 Miembro[1] = (rs.getString("tipo"));
                 Miembro[2] = (rs.getString("precio"));
                 Miembro[3] = (rs.getString("matricula"));
                modelo.addRow(Miembro);
                encontrado = "SI";
                limpiar();
            }
            if (encontrado.equals("NO")) {
                JOptionPane.showMessageDialog(null, "NO ENCONTRADO", "ATENCION!", JOptionPane.ERROR_MESSAGE);
            }
            tabMiembros.setModel(modelo);
            con.close();
        } catch (HeadlessException | SQLException x) {}
    }

    int codigo;
    public int buscarID() {
        try {
            String senten = "SELECT COUNT(ID) FROM membresia";
            encontrado = "NO";            
            con = conect.getConexion();
            st = con.createStatement();
            ResultSet rs = st.executeQuery(senten);
             rs.next(); 
                codigo = rs.getInt("COUNT(ID)");
                encontrado = "SI";
                
            if (encontrado.equals("NO")) {
                JOptionPane.showMessageDialog(null, "NO ENCONTRADO", "ATENCION!", JOptionPane.ERROR_MESSAGE);
            }
            con.close();
        } catch (HeadlessException | SQLException x) {}
        return codigo+1;
    }
    
public void actualizarMembresia(){        
            try {
                Conexion conect = new Conexion("gimnasio");
                con = conect.getConexion();
                st = con.createStatement();
                PreparedStatement ps;

		//COLOQUE EL NOMBRE DE SU TABLA Y EL NOMBRE DE SUS CAMPOS
                String sql = "UPDATE miembros SET tipo=?, precio=?, matricula=? WHERE ID =?";
                ps = conect.getConexion().prepareStatement(sql);
                ps.setString(1, jtfTipo.getText());
                ps.setString(2, jtfPrecio.getText());
                ps.setString(3, jtfMatricula.getText());
                ps.execute();
                JOptionPane.showMessageDialog(null, "REGISTRO ACTUALIZADO CORRECTAMENTE", "ATENCION!", 1);
                limpiar();
                con.close();                
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "REGISTRO NO SE PUDO ACTUALIZAR" + e, "ATENCION!", 0);
            }        
    }

    public void eliminarMembresia() {
       
        String elimina = "UPDATE  SET estado='Inactivo' WHERE ID =" + jtfID.getText().trim();
        try {
            Conexion conect = new Conexion("gimnasio");
            con = conect.getConexion();
            st = con.createStatement();
            st.execute(elimina);
            JOptionPane.showMessageDialog(null, "REGISTRO ELIMINADO CORRECTAMENTE", "ATENCION!", 1);
            con.close();
            limpiar();
            //limpiarTabla();
            buscarMembresia();
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMINAR EL REGISTRO", "ATENCION!", 0);
        }
    }
    
    public void limpiar(){
        jtfID.setText("");
        jtfTipo.setText("");
        jtfPrecio.setText("");
        jtfMatricula.setText("");
    }
    
    public void limpiarTabla() {
        int fila = tabMiembros.getRowCount();
        for (int i = fila - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
        limpiar();
    } 
        
        
    
    
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
            java.util.logging.Logger.getLogger(Membresias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Membresias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Membresias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Membresias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Membresias dialog = new Membresias(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton botBorrar;
    private javax.swing.JButton botCambiar;
    private javax.swing.JButton botCrear;
    private javax.swing.JButton botListar;
    private javax.swing.JButton botVolver;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfMatricula;
    private javax.swing.JTextField jtfPrecio;
    private javax.swing.JTextField jtfTipo;
    private javax.swing.JTable tabMiembros;
    // End of variables declaration//GEN-END:variables
}
