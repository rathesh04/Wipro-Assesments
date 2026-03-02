package positive;

import java.sql.*;

public class JdbcExample2 {

    public static void main(String[] args) {

        String sql = "CREATE TABLE IF NOT EXISTS STUDENTS (" +
                     "Id INT PRIMARY KEY, " +
                     "Name VARCHAR(50), " +
                     "Age INT)";
        try {           
            Class.forName("com.mysql.cj.jdbc.Driver");            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root", "Rss@2764");         
            Statement stmt = con.createStatement();           
            stmt.executeUpdate(sql);
            stmt.executeUpdate("INSERT INTO STUDENTS VALUES (2,'RATHESH',21)");
            stmt.executeUpdate("INSERT INTO STUDENTS VALUES (3,'SAI',22)");
            stmt.executeUpdate("INSERT INTO STUDENTS VALUES (4,'HARI',23)");
            stmt.executeUpdate("INSERT INTO STUDENTS VALUES (5,'RAJ',24)");
            System.out.println("Table STUDENTS created successfully");
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }
}
