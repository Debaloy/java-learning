import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

class FirstJDBC {
    public static void main(String args[]) {
        try {
            // Loading the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Creating a connection
            String url = "jdbc:mysql://localhost:3306/student";
            String user = "root";
            String password = "********";

            Connection con = DriverManager.getConnection(
                url,
                user,
                password
            );

            // Checking if connection was created or not
            if(con.isClosed()) {
                System.out.println("Connection terminated...");
            } else {
                System.out.println("Connection established...");
            }

            // Checking if the table already exists or not
            if(tableExistsSQL(con, "student1")) {
                // Do nothing
            } else {
                // Creating the table
                String query = "CREATE TABLE student1(" +
                               "sid   int(20)      PRIMARY KEY auto_increment," +
                               "sname varchar(200) NOT NULL," +
                               "scity varchar(200)," +
                               "sfee  int(10)      DEFAULT 2000)";
                
                // Creating a statement that we can use to execute our queries
                Statement stmt = con.createStatement();
                stmt.executeUpdate(query);
                System.out.println("Table created...");
            }

            // Inserting data into table
            String query = "INSERT INTO student1(sname,scity,sfee) VALUES(?,?,?)";
            
            // Get the PreparedStatement object
            PreparedStatement pstmt = con.prepareStatement(query);

            // Static input or Dynamic Input
            boolean flag = true;
            
            // flag = true  means static, else dynamic
            if(flag) {
                // Setting the values statically
                pstmt.setString(1, "Simran");  // sname
                pstmt.setString(2, "Lucknow");    // scity
                pstmt.setInt(3, 3400);          // sfee

                pstmt.executeUpdate();
            } else {
                // Dynamic Input
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Student Name: ");
                String sname = br.readLine();

                System.out.println("Enter City: ");
                String scity = br.readLine();

                System.out.println("Enter Student Fees: ");
                int sfee = Integer.parseInt(br.readLine());

                pstmt.setString(1, sname);  // sname
                pstmt.setString(2, scity);  // scity
                pstmt.setInt(3, sfee);      // sfee
                
                pstmt.executeUpdate();
            }
            System.out.println("Data Inserted...");

            // Printing the data on terminal by ascending order of names
            query = "SELECT * FROM student1 ORDER BY sname";
            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(query);

            System.out.println("S_ID | S_Name | S_City | S_Fees");
            while(set.next()) {
                int sid = set.getInt(1);
                String sname = set.getString(2);
                String scity = set.getString(3);
                int sfee = set.getInt(4);
                System.out.println(sid + "  |  " + sname + "  |  " + scity + "  |  " + sfee);
            }

            // Closing the connection
            con.close();
            System.out.println("Connection terminated...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    };

    static boolean tableExistsSQL(Connection connection, String tableName) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT count(*) "
          + "FROM information_schema.tables "
          + "WHERE table_name = ?"
          + "LIMIT 1;");
        preparedStatement.setString(1, tableName);
    
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        return resultSet.getInt(1) != 0;
    }
}
