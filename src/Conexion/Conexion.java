/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Conexion {
    private static Connection conexion;
    private String user = "BD_SITRACH3";
    private String pass = "SITRACH30700";
    private String url = "jdbc:oracle:thin:"+user+"/"+pass+"@localhost:1521:xe";
    
    public Conexion(){
        try {
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            this.conexion = DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            System.out.println("ERROR DE CONEXION"+e.getMessage());
        }
    }
    public Connection obtenerConexion(){
        return conexion;
    }
}



