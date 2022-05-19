/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecmis;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class DB {
    
    public String url = "jdbc:mysql://localhost:3306/tecmis";
    public String user = "root";
    public String password = "";
    public Connection conn;
    public Statement stm;
    
    public static void main(String args[]){
 
    }
    
    public void getconnect(){
        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection(url, user, password);
            
            stm = conn.createStatement();
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
