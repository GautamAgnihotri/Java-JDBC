
package JDBC_Package;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class SimpleJDBC {

    
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/mydbms";
        String dbid ="root";
        String dbpass ="goutam@2001";
        try{
        Connection cnn = DriverManager.getConnection(url,dbid,dbpass);
        
        Statement stm = cnn.createStatement();
        
        String query ="select * from user";
        ResultSet rs = stm.executeQuery(query);
        while(rs.next()){
            String fname = rs.getString(1);
            String lname = rs.getString(2);
            String email = rs.getString(3);
            String mobile_no = rs.getString(4);
            
            System.out.println(fname+ ": " + lname+": " + email+": " + mobile_no );
        }
      
    } catch(SQLException ex){
      ex.printStackTrace();
    }}
    
}
