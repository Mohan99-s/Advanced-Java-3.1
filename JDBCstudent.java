import java.sql.*;

public class Statement {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb"; // Replace with your database name
        String user = "root";
        String pwd = "root123"; // Replace with your MySQL password

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, pwd);

            java.sql.Statement stmt = con.createStatement();

            String create = "CREATE TABLE IF NOT EXISTS Student ("
                    + "RollNo INT PRIMARY KEY, "
                    + "Name VARCHAR(100), "
                    + "Address VARCHAR(100))";

            stmt.executeUpdate(create);
            System.out.println("Table Created Successfully");

            // Insert initial records
            stmt.executeUpdate("INSERT INTO Student VALUES (1,'SATARU','HYD')");
            stmt.executeUpdate("INSERT INTO Student VALUES (2,'JINWOO','TOKYO')");
            stmt.executeUpdate("INSERT INTO Student VALUES (3,'WANG','BANGALORE')");
            System.out.println("\nInitial Records Inserted");

            System.out.println("\nInitial Records");
            displayRecords(stmt);

            // Insert new records
            stmt.executeUpdate("INSERT INTO Student VALUES (4,'MAHESH BABU','GNT')");
            stmt.executeUpdate("INSERT INTO Student VALUES (5,'KOHLI','DELHI')");
            System.out.println("\n2 New Records Inserted");

            // Update record
            stmt.executeUpdate("UPDATE Student SET Address='DELHI' WHERE RollNo=3");
            System.out.println("1 Row Updated");

            // Delete record
            stmt.executeUpdate("DELETE FROM Student WHERE RollNo=2");
            System.out.println("1 Row Deleted");

            System.out.println("\nFinal Records");
            displayRecords(stmt);

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void displayRecords(java.sql.Statement stmt) throws SQLException {

        ResultSet rs = stmt.executeQuery("SELECT * FROM Student");

        System.out.println("RollNo\tName\t\tAddress");

        while (rs.next()) {
            int roll = rs.getInt("RollNo");
            String name = rs.getString("Name");
            String address = rs.getString("Address");

            System.out.println(roll + "\t" + name + "\t\t" + address);
        }

        rs.close();
    }
}
