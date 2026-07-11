import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertEmployee {

    public static void main(String[] args) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO employee (id, name, salary) VALUES (?, ?, ?)";

            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setInt(1, 101);
            pstmt.setString(2, "Rahul");
            pstmt.setDouble(3, 50000);

            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee inserted successfully.");
            }

            pstmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
