import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class l2libraryUtil {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Properties prop = new Properties();
            FileInputStream in = new FileInputStream("C:/Users/sandeep kumar/OneDrive/Desktop/java/javaProjects/p2libraryManagement1/db.properties");
            prop.load(in);

            String driverName= prop.getProperty("db.driver");
            Class.forName(driverName);

            String url,username,password;
            url = prop.getProperty("db.url");
            username = prop.getProperty("db.username");
            password= prop.getProperty("db.password");

            conn= DriverManager.getConnection(url, username, password);
            return conn;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;

    }
}
