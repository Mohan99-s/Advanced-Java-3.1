import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    // Reusable connection method
    public static Connection getConnection() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/company",
            "root",
            "root123"
        );
    }

    // Test method
    public static void main(String[] args) {

        try {

            Connection con = getConnection();

            System.out.println("Connected Successfully");

            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
