package positive;
 
import java.sql.*;
 
public class JdbcExample {
 
public static void main(String[] args)
{
	
try {
	
Class.forName("com.mysql.cj.jdbc.Driver"); 
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Rss@2764");
 
Statement stmt=con.createStatement();
 
ResultSet rs=stmt.executeQuery(" select * from employee");
 
System.out.println("EMP_ID" + " " + "EMP_NAME"+ " " + "age" + " " + "EMP_DEPT" + " " + "salary" + " " + "LOCATION" + " " + "LOGIN_PERIOD" + " " + "LAST_LOGIN" + " " +"EMAIL" );
while (rs.next())
{
	System.out.println(
	        rs.getInt("EMP_ID") + "\t" +
	        rs.getString("EMP_NAME") + "\t" +
	        rs.getInt("age") + "\t" +
	        rs.getString("EMP_DEPT") + "\t" +
	        rs.getInt("salary") + "\t" +
	        rs.getString("LOCATION") + "\t" +
	        rs.getString("LOGIN_PERIOD") + "\t" +
	        rs.getString("LAST_LOGIN") + "\t" +
	        rs.getString("EMAIL")
	    );
}
con.close();
}
	catch (Exception e)
   {
		System.out.println(e);
   }	
}
 
}
 
 