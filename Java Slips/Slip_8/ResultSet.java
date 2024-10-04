import java.sql.*;

public class ResultSet {
    public static void main(String[] args) {
        // Database connection details
        String jdbcUrl = "jdbc:postgresql://localhost:5432/javadb";
        String username = "postgres";
        String password = "491625";

        try {
            // Establish a database connection
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Create a statement for executing SQL queries
            Statement statement = connection.createStatement();

            // Create the "Person" table if it doesn't exist
            String createTableSQL = "CREATE TABLE IF NOT EXISTS Person (PID serial PRIMARY KEY, name VARCHAR, gender VARCHAR, birth_year INTEGER)";
            statement.execute(createTableSQL);

            // Insert sample data into the table
            String insertDataSQL = "INSERT INTO Person (name, gender, birth_year) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertDataSQL);
            preparedStatement.setString(1, "Chirag");
            preparedStatement.setString(2, "Male");
            preparedStatement.setInt(3, 1990);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "Anita");
            preparedStatement.setString(2, "Female");
            preparedStatement.setInt(3, 1985);
            preparedStatement.executeUpdate();

            // Execute a query to retrieve data from the table
            String query = "SELECT * FROM Person";
            ResultSet resultSet = statement.executeQuery(query);

            // Get ResultSet metadata
            ResultSetMetaData metaData = resultSet.getMetaData();

            // Display metadata information
            int columnCount = metaData.getColumnCount();
            System.out.println("Number of columns in the ResultSet: " + columnCount);

            for (int i = 1; i <= columnCount; i++) {
                String columnName = metaData.getColumnName(i);
                String columnType = metaData.getColumnTypeName(i);
                System.out.println("Column Name: " + columnName);
                System.out.println("Column Type: " + columnType);
            }

            // Close the resources
            resultSet.close();
            preparedStatement.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            System.err.println("PostgreSQL JDBC driver not found. Make sure it's in the classpath.");
            e.printStackTrace();
    }
}

