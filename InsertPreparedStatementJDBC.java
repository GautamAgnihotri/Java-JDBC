
package JDBC_Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class InsertPreparedStatementJDBC {

    
    public static void main(String[] args) {
         String url ="jdbc:mysql://localhost:3306/mydbms";
        String dbid ="root";
        String dbpass ="goutam@2001";
        try{
        Connection cnn = DriverManager.getConnection(url,dbid,dbpass);
        
        PreparedStatement ps = cnn.prepareStatement("insert into user value(?,?,?,?)");
            ps.setString(1,"Gautam");
            ps.setString(2,"Agnihotri");
            ps.setString(3,"Abc@gmail.com");
            ps.setString(4,"7538526189");
            
            ps.executeUpdate();
        
      System.out.println("Success");
    } catch(SQLException ex){
      ex.printStackTrace();
        }
    }
    
  }
    

