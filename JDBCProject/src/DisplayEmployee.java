import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class DisplayEmployee {

    public static void main(String[] args) {

        try {

            Connection con = DBConnection.getConnection();

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            System.out.println("ID\tName\tSalary");
            System.out.println("-----------------------------");

            while (rs.next()) {

                System.out.println(
                    rs.getInt("id") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getDouble("salary")
                );
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
