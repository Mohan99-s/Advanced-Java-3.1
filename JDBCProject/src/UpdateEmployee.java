import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateEmployee {

    public static void main(String[] args) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "UPDATE employee SET salary = ? WHERE id = ?";

            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setDouble(1, 60000);
            pstmt.setInt(2, 101);

            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee updated successfully.");
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
