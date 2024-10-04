import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConn {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:postgresql://localhost:5432/javadb";
        String username = "postgres";
        String password = "491625";

        try {
            // Load the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // Create a connection to the database
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            if (connection != null) {
                System.out.println("Connected to the PostgreSQL database successfully!");
                // You can perform database operations here

                // Don't forget to close the connection when done
                connection.close();
            }
       } catch (ClassNotFoundException e) {
            System.err.println("PostgreSQL JDBC driver not found. Make sure it's in the classpath.");
            e.printStackTrace();
        }
        catch (SQLException e) {
            System.err.println("Connection to the database failed.");
            e.printStackTrace();
        }
    }
}


/* -- sudo apt install libpostgresql-jdbc-java
   -- export CLASSPATH=$CLASSPATH:<path to the postgresql.jar file>
   -- sudo nano /etc/postgresql/<version>/main/pg_hba.conf
	scroll down and here make following changes
	-- Change IPV4 Connectioin Method from 'peer' or 'md5' to 'trust'
	-- Change 'Database Admininstrative Login by Unix Domain socket' method from 'peer' or 'md5' to 'trust'
   -- sudo systemctl restart postgresql */