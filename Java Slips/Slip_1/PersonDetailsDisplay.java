import java.sql.*;

public class PersonDetailsDisplay {
    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:postgresql://localhost:5432/javadb";
        String username = "postgres";
        String password = "491625";

        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");
            // Connect to the PostgreSQL database
            connection = DriverManager.getConnection(url, username, password);

            // Create the "Person" table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS Person (PID SERIAL PRIMARY KEY, name VARCHAR(255), gender VARCHAR(10), birth_year INT)";
            PreparedStatement createTableStatement = connection.prepareStatement(createTableSQL);
            createTableStatement.executeUpdate();

            // Insert sample data into the table
            String insertDataSQL = "INSERT INTO Person (name, gender, birth_year) VALUES (?, ?, ?)";
            PreparedStatement insertDataStatement = connection.prepareStatement(insertDataSQL);

            insertDataStatement.setString(1, "Mithun");
            insertDataStatement.setString(2, "Male");
            insertDataStatement.setInt(3, 1985);
            insertDataStatement.executeUpdate();

            insertDataStatement.setString(1, "Nita");
            insertDataStatement.setString(2, "Female");
            insertDataStatement.setInt(3, 1990);
            insertDataStatement.executeUpdate();

            // Retrieve and display all details from the "Person" table
            String selectDataSQL = "SELECT * FROM Person";
            PreparedStatement selectDataStatement = connection.prepareStatement(selectDataSQL);
            ResultSet resultSet = selectDataStatement.executeQuery();

            System.out.println("PID | Name | Gender | Birth Year");
            System.out.println("-------------------------------");

            while (resultSet.next()) {
                int pid = resultSet.getInt("PID");
                String name = resultSet.getString("name");
                String gender = resultSet.getString("gender");
                int birthYear = resultSet.getInt("birth_year");

                System.out.println(pid + " | " + name + " | " + gender + " | " + birthYear);
            }
        } catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("PostgreSQL JDBC driver not found. Make sure it's in the classpath.");
            e.printStackTrace();
        } 
        finally{
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
