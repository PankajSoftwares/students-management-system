import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/student";
        String DB_USER = "root";
        String DB_PASSWORD = "953001"; // Or use args[0] or env var

        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            
            if (conn != null && conn.isValid(2)) {
                System.out.println("✅ Database connected successfully!");
            } else {
                System.out.println("❌ Connection failed.");
            }

            conn.close();
        } catch (SQLException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
