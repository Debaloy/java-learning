import java.sql.*;

public class JDBCProg {
    public static void main(String[] args) {
        try {
            // Loading the MySQL driver
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "********");

            Statement stmt = con.createStatement();

            ResultSet set = stmt.executeQuery("SELECT * FROM student1");

            while(set.next()) {
                System.out.println(
                    set.getInt(1) 
                    + " | " + set.getString(2)
                    + " | " + set.getString(3)
                    + " | " + set.getInt(4)
                );
            }

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
