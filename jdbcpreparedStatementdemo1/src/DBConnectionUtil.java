import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {
    public static final String url = "jdbc:mysql://localhost:3306/ideyalabs";
    public static final String username="root";
    public static final String password="root@123";
    public static Connection createConnection() throws SQLException {
        return DriverManager.getConnection(url,username,password);
    }
}
