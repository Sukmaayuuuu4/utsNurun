/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanpos;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rinda
 */
public class Connection {
    public static java.sql.Connection getConnections(){
        java.sql.Connection conn = null;
        if(conn == null){
            try{
                String url = "jdbc:mysql://localhost/biu_pos";
                String user = "root";
                String pass = "";
                conn = DriverManager.getConnection(url,user,pass);
                System.out.println("Connection Succesfully");
                
            }
            catch(SQLException e){
                System.out.println("Failed to Connection");
            }
            }
        return conn;
        }
    public static void main(String arg[]){
        getConnections();
    }
    
}
