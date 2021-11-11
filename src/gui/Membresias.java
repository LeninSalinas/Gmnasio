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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfID = new javax.swing.JTextField();
        jtfMiembro = new javax.swing.JTextField();
        jtfPrecio = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jtfPendiente = new javax.swing.JTextField();
        jtfID1 = new javax.swing.JTextField();
        jtfMiembro1 = new javax.swing.JTextField();
        jtfPrecio1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jtfMatricula = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jffTelefono = new javax.swing.JFormattedTextField();
        botVolver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
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

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("ID ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("MIEMBRO");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("PRECIO");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 70, 20));
        jPanel3.add(jtfID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 112, 32));
        jPanel3.add(jtfMiembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 116, 112, 32));
        jPanel3.add(jtfPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 112, 32));

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("ID ");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 20));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("MIEMBRO");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 20));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("PRECIO");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 70, 20));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("PENDIENTE");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 90, 20));
        jPanel5.add(jtfPendiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 110, 32));
        jPanel5.add(jtfID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 112, 32));
        jPanel5.add(jtfMiembro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 116, 112, 32));
        jPanel5.add(jtfPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 112, 32));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("MATRICULA");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 100, 20));
        jPanel5.add(jtfMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 112, 32));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("TELEFONO");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 100, 20));

        try {
            jffTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel5.add(jffTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 110, 30));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 490));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 490));

        botVolver.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botVolver.setText("VOLVER");
        botVolver.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 102, 255), new java.awt.Color(153, 255, 255)));
        jPanel1.add(botVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 100, 50));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("ID ");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 20));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("MIEMBRO");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 20));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("PRECIO");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 70, 20));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("PEDIENTE");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 80, 20));
        jPanel4.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 110, 32));
        jPanel4.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 112, 32));
        jPanel4.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 116, 112, 32));
        jPanel4.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 112, 32));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("MATRICULA");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 100, 20));
        jPanel4.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 112, 32));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 490));

        jButton2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton2.setText("CREAR");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 102, 255), new java.awt.Color(153, 255, 255)));
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 100, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        botCrear.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botCrear.setText("CREAR");
        botCrear.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 102, 255), new java.awt.Color(153, 255, 255)));
        jPanel1.add(botCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 100, 50));

        botListar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botListar.setText("LISTAR");
        botListar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 102, 255), new java.awt.Color(153, 255, 255)));
        jPanel1.add(botListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 100, 50));

        botCambiar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botCambiar.setText("CAMBIAR");
        botCambiar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 102, 255), new java.awt.Color(153, 255, 255)));
        jPanel1.add(botCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 100, 50));

        tabMiembros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "         ID", "         MIEMBRO", "         PRECIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabMiembros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 430, 240));

        botBorrar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botBorrar.setText("BORRAR");
        botBorrar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 102, 255), new java.awt.Color(153, 255, 255)));
        jPanel1.add(botBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 100, 50));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 680, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
//CREAR CLIENTES Y LOS GUARDA EN LA BD, LLAME A ESTE METODO EN EL BOTON CREAR
    public void crearMembresia() {
        try {
            con = conect.getConexion();
            //COLOQUE EN LA SENTENCIA SQL EL NOMBRE DE SU BD Y LOS NOMBRE DE LOS CAMPOS
            String sql = "INSERT INTO membresia (ID,nombre,precio,matricula,telefono,pendiente,estado) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = conect.getConexion().prepareStatement(sql);
            //COLOQUE LOS NOMBRES DE SUS CUADROS DE DIALOGO (JTEXTFIELD)
            ps.setInt(1, 0);
            ps.setString(2, jtfMiembro.getText());
            ps.setString(3, jtfPrecio.getText());
            ps.setString(4, jtfMatricula.getText());
            ps.setString(5, jffTelefono.getText());
            ps.setString(6, jtfPendiente.getText());
            ps.setString(7, "Activo");           
            ps.execute();
            JOptionPane.showMessageDialog(null, "REGISTRO INGRESADO CORRECTAMENTE", "ATENCION!", 1);
            limpiar();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "REGISTRO NO SE PUDO GUARDAR", "ATENCION!" + e, 0);
        }
    }
    
private void BuscarMembresia() {
        try {
            String senten = "SELECT * FROM miembros WHERE estado LIKE 'Activo'";
            encontrado = "NO";            
            con = conect.getConexion();
            st = con.createStatement();
            ResultSet rs = st.executeQuery(senten);
            modelo = (DefaultTableModel) tabMiembros.getModel(); //tblDatos es el nombre del JTable

            while (rs.next()) {
                 Miembro[0] = (rs.getInt("ID"));
                 Miembro[1] = (rs.getString("nombre"));
                 Miembro[2] = (rs.getString("precio"));
                 Miembro[3] = (rs.getString("matricula"));
                 Miembro[4] = (rs.getString("telefono"));
                 Miembro[5] = (rs.getString("pendiente"));
                 Miembro[6] = (rs.getString("estado"));
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

public void actualizarMembresia(){        
            try {
		//COLOQUE EL NOMBRE DE SU BD
                Conexion conect = new Conexion("gimnasio");
                con = conect.getConexion();
                st = con.createStatement();
                PreparedStatement ps;

		//COLOQUE EL NOMBRE DE SU TABLA Y EL NOMBRE DE SUS CAMPOS
                String sql = "UPDATE miembros SET nombre=?, precio=?, matricula=?, telefono=?, pendiente=? WHERE ID =?";
                ps = conect.getConexion().prepareStatement(sql);
                ps.setString(1, jtfMiembro.getText());
                ps.setString(2, jtfPrecio.getText());
                ps.setString(3, jtfMatricula.getText());
                ps.setString(4, jffTelefono.getText());
                ps.setString(5, jtfPendiente.getText());
                ps.execute();
                JOptionPane.showMessageDialog(null, "REGISTRO ACTUALIZADO CORRECTAMENTE", "ATENCION!", 1);
                limpiar();
                con.close();                
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "REGISTRO NO SE PUDO ACTUALIZAR" + e, "ATENCION!", 0);
            }        
    }

 //ELIMINA CLIENTE DE BD
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
            BuscarMembresia();
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMINAR EL REGISTRO", "ATENCION!", 0);
        }
    }
    
    public void limpiar(){
        jtfID.setText("");
        jtfMiembro.setText("");
        jtfPrecio.setText("");
        jtfMatricula.setText("");
        jffTelefono.setText("");   
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
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JFormattedTextField jffTelefono;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfID1;
    private javax.swing.JTextField jtfMatricula;
    private javax.swing.JTextField jtfMiembro;
    private javax.swing.JTextField jtfMiembro1;
    private javax.swing.JTextField jtfPendiente;
    private javax.swing.JTextField jtfPrecio;
    private javax.swing.JTextField jtfPrecio1;
    private javax.swing.JTable tabMiembros;
    // End of variables declaration//GEN-END:variables
}
