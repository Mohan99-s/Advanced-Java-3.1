import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {

    public static void main(String[] args) {

        try {

            Connection con = DBConnection.getConnection();

            Statement stmt = con.createStatement();

            String sql =
            "CREATE TABLE employee (" +
            "id INT PRIMARY KEY," +
            "name VARCHAR(50)," +
            "salary DOUBLE)";

            stmt.executeUpdate(sql);

            System.out.println("Employee Table Created");

            con.close();

        }
        catch(Exception e) {

            e.printStackTrace();
        }
    }
}
