import java.io.FileOutputStream;
import java.util.Properties;

public class j1createPropertiesFile {
    public static void main(String[] args) {
        try {
            Properties props = new Properties();
            props.setProperty("db.driver", "com.mysql.cj.jdbc.Driver");
            props.setProperty("db.url", "jdbc:mysql://localhost:3306/mydatabase");
            props.setProperty("db.username", "root");
            props.setProperty("db.password", "pass09");

            FileOutputStream out = new FileOutputStream("db.properties");
            props.store(out, "Database Configuration");
            out.close();

            System.out.println("db.properties file created!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}