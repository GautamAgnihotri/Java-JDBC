
package JDBC_Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.CallableStatement;

public class Callable_Statement_JDBC {
    public static void main(String []args){
        String url ="jdbc:mysql://localhost:3306/mydbms";
        String dbid ="root";
        String dbpass ="goutam@2001";
        try{
        Connection cnn = DriverManager.getConnection(url,dbid,dbpass);
        
        CallableStatement cs = cnn.prepareCall("{call CProcedure(?,?,?,?)}");
        
            cs.setString(1, "Rakesh");
            cs.setString(2, "Kumar");
            cs.setString(3, "Rakesh@gmail.com");
            cs.setString(4, "4633664476");
            
            cs.execute();
            cnn.close();
        
      System.out.println("Success");
    } catch(SQLException ex){
      ex.printStackTrace();
        }
    }
}

