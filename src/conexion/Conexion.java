/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.*;
import javax.swing.JOptionPane;
public class Conexion 
{
     Connection c;
     public Conexion(String db) {
        try {
            /* Driver */
            String driver = "com.mysql.jdbc.Driver";
            System.out.println("=> Cargando el Driver:");
            Class.forName(driver);
            System.out.println("Driver OK");

            /* Definiendo Base de Datos */
            String url = "jdbc:mysql://localhost/" + db;
            String user = "root";
            String pass = "";

            /* Conectando */
            System.out.println("=> conectando a la BD:");
            c = DriverManager.getConnection(url, user, pass);
            System.out.println("Base de Datos OK");

        } catch (ClassNotFoundException | SQLException x) {
            JOptionPane.showMessageDialog(null, "Error al tratar de conectar a la Base de Datos!", "", JOptionPane.WARNING_MESSAGE);
        }
    }

    public Connection getConexion() {
        return c;
    }

    public static void main(String args[]) {
        new Conexion("gimnasio");
    }
}
