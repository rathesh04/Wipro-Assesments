package testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataBaseUtil {

    public static Object[][] getDBData() throws Exception {

        List<Object[]> data = new ArrayList<>();

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/credentials",
                "root",
                "Rss@2764");

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT username, password FROM form");

        while (rs.next()) {
            String username = rs.getString("username");
            String password = rs.getString("password");

            data.add(new Object[]{username, password});
        }

        rs.close();
        stmt.close();
        con.close();

        return data.toArray(new Object[0][]);
    }
}