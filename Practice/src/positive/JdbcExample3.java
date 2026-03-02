package positive;

import java.sql.*;

public class JdbcExample3 {

    public static void main(String[] args) {

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");    
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Wiprodb",  "root","Rss@2764"); 
            CallableStatement cs = con.prepareCall("{CALL GetAllEmployee()}");
            ResultSet rs = cs.executeQuery();      
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id")+ " " +rs.getString("name")+ " " +rs.getInt("salary"));
            }
            rs.close();
            cs.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
