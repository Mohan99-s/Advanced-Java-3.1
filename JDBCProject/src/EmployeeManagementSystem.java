import java.sql.*;
import java.util.Scanner;

public class EmployeeManagementSystem {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee();
                    break;

                case 2:
                    viewEmployees();
                    break;

                case 3:
                    updateEmployee();
                    break;

                case 4:
                    deleteEmployee();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    // Add Employee
    static void addEmployee() {

        try {

            Connection con = DBConnection.getConnection();

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();

            String sql = "INSERT INTO employee VALUES (?, ?, ?)";

            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setDouble(3, salary);

            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Added Successfully!");
            }

            pstmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // View Employees
    static void viewEmployees() {

        try {

            Connection con = DBConnection.getConnection();

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            System.out.println("\nID\tName\tSalary");
            System.out.println("----------------------------");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + "\t" +
                        rs.getString("name") + "\t" +
                        rs.getDouble("salary"));
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Update Employee Salary
    static void updateEmployee() {

        try {

            Connection con = DBConnection.getConnection();

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();

            System.out.print("Enter New Salary: ");
            double salary = sc.nextDouble();

            String sql = "UPDATE employee SET salary=? WHERE id=?";

            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setDouble(1, salary);
            pstmt.setInt(2, id);

            int rows = pstmt.executeUpdate();

            if (rows > 0)
                System.out.println("Employee Updated Successfully!");
            else
                System.out.println("Employee Not Found!");

            pstmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Delete Employee
    static void deleteEmployee() {

        try {

            Connection con = DBConnection.getConnection();

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();

            String sql = "DELETE FROM employee WHERE id=?";

            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setInt(1, id);

            int rows = pstmt.executeUpdate();

            if (rows > 0)
                System.out.println("Employee Deleted Successfully!");
            else
                System.out.println("Employee Not Found!");

            pstmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
