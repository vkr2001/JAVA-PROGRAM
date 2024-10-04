import java.sql.*;

public class UpdateCourseStudents {
    public static void main(String[] args) {
        // JDBC URL, username, and password of the PostgreSQL server
        String url = "jdbc:postgresql://localhost:5432/javadb";
        String user = "postgres";
        String password = "491625"; // Replace with your password

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            //Class.forName("org.postgresql.Driver");
            // SQL update statement to change the number_of_students for "BCA Science" to 1000
            String sql = "UPDATE Course SET no_of_students = 1000 WHERE name = ?";

            // Create a PreparedStatement
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, "BCA SCIENCE");

            // Execute the update statement
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Number of students for 'BCA Science' updated successfully.");
            } else {
                System.out.println("No rows updated. Course not found.");
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
        catch (ClassNotFoundException e) {
            System.err.println("PostgreSQL JDBC driver not found. Make sure it's in the classpath.");
            e.printStackTrace();
    }
}

