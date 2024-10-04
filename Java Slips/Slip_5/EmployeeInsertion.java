import java.sql.*;
import java.util.Scanner;

public class EmployeeInsertion {
    public static void main(String[] args) {
        String dbUrl = "jdbc:postgresql://localhost:5432/javadb"; 
        String dbUser = "postgres"; 
        String dbPassword = "491625"; 

        try {
            Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            // Prepare the SQL INSERT statement using a PreparedStatement
            String insertQuery = "INSERT INTO Employee (ID, name, salary) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(insertQuery);

            // Accept employee details from the user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Employee ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Employee Salary: ");
            double salary = scanner.nextDouble();

            // Set the parameters in the PreparedStatement
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setDouble(3, salary);

            // Execute the INSERT query
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Record inserted successfully.");
            } else {
                System.out.println("Failed to insert the record.");
            }

            // Close the resources
            preparedStatement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("PostgreSQL JDBC driver not found. Make sure it's in the classpath.");
            e.printStackTrace();
    }
}

