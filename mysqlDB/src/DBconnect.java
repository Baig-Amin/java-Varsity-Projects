
import java.sql.*;

public class DBconnect {

    private Connection con;
    private Statement st;
    private ResultSet rs;

    public DBconnect() {

        try {
            
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/try","root","");
            st  = con.createStatement();
        } catch (Exception ex) {

            System.out.println("Error: "+ ex);
        }
    }
    
    public void getData()
    {
        
        try {
            String query =("select * from persons");
            rs =st.executeQuery(query);
            System.out.println("Record from Database");
            while(rs.next())
            {
            Integer id = rs.getInt("id");
            String name = rs.getString("name");
            String age = rs.getString("age");
            
             System.out.println("\nID : " + id
             +"\nName: "+name
                     +"\nAge: "+age
             );
            }
            
        } catch (Exception ex) {

            System.out.println(ex);
        }
        
    }
}
