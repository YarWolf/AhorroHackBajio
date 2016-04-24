/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felipe
 */
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class mysql {
    String conString = "jdbc:mysql://localhost:3306/educa";
    String username="root";
    String password ="";
    public Boolean add(String correo, String contra, String nombre){
        // sql statement
        String sql ="insert into Usuario(correo, contra, nombre) values('"+correo+"','"+contra+"','"+nombre+"') ";
        
        try {
            
            //GET CONNECTION
            java.sql.Connection con = DriverManager.getConnection(conString, username, password);
        
            //prepared statement
            PreparedStatement s = con.prepareStatement(sql);
            s.execute(sql);
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
        }
            return false;
        
    }
    
}
