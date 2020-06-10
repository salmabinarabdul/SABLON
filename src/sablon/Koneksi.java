/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sablon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Acer
 */
public class Koneksi {
    private static Connection sqlconfig;
    public static Connection bukaKoneksi() throws SQLException{
        
        try{
            
            
            
            String url="jdbc:mysql://localhost/sablon";
            String user="root";
            String pass="";
            
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            sqlconfig = DriverManager.getConnection(url,user,pass);
            
        } catch (SQLException e){
            
            
            JOptionPane.showMessageDialog(null,"Ada masalah dengan koneksi ke database."+"\nPenyebab:\n"+e.getMessage(),"Error",0);
            
        }
        return sqlconfig;
    }
     public static void main(String[] args) throws SQLException {
         bukaKoneksi();
     }
     }

