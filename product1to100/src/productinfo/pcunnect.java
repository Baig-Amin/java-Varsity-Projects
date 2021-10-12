
package productinfo;

import java.sql.*;

public class pcunnect {
    
    private Connection con;
    private Statement st;
    private ResultSet rs;

     public pcunnect() {

        try {
            
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/try","root","");
            st  = con.createStatement();
        } catch (Exception ex) {

            System.out.println("Error: "+ ex);
        }
    }
}
