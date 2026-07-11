import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteEmployee {

    public static void main(String[] args) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "DELETE FROM employee WHERE id = ?";

            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setInt(1, 101);

            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee deleted successfully.");
            } else {
                System.out.println("Employee not found.");
            }

            pstmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
