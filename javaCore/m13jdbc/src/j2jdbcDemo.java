import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class j2jdbcDemo {
    public static void main(String[] args) {
        try{
            // m1 - using properties file created
            // 1- accessing the properties from the properties file
            // creating new properties object
            Properties prop = new Properties();
            // reading the text data from the db.properties file
            FileInputStream in = new FileInputStream("C:/Users/sandeep kumar/OneDrive/Desktop/java/db.properties");
            // loading the properties into the properties instance(prop)
            prop.load(in);
            // getting the properties and its value
            String driver = prop.getProperty("db.driver");
            String url = prop.getProperty("db.url");
            String username = prop.getProperty("db.username");
            String password = prop.getProperty("db.password");

            // 2- loading jdbc drivers
            Class.forName(driver);
            System.out.println("Drivers loaded successfully!!!");

            // 3- establishing database connection
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("connection established successfully !!");

            // 4- statement creation for execution of sql queries
            Statement stmt = con.createStatement();

            // 5- running queries
            String query = "select * from employee;";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String job_title = rs.getString("job_title");
                double salary = rs.getDouble("salary");
                System.out.println();
                System.out.println("=====================");
                System.out.println("Id : " +id);
                System.out.println("Name : " +name);
                System.out.println("Job Title : " +job_title);
                System.out.println("Salary : " +salary);
            }

//            // prepared statements
//            PreparedStatement pstmt;
//            String sql = "update employee set name = ? where id = ?";
//            pstmt = con.prepareStatement(sql);
//            pstmt.setString(1, "smith");
//            pstmt.setInt(2, );
//            int result = pstmt.executeUpdate();
//            System.out.println("update is " +result);

//            // callable statements for procedures and functions
//            CallableStatement cstmt;
//            cstmt = con.prepareCall("call procDemo(?, ?)");
//            cstmt.setInt(1, 100);
//            cstmt.setString(2, "testJava");
//            cstmt.executeQuery();

//            // commit and rollback
//            con.commit();
//            con.rollback();

//            // closing all
//            rs.close();
//            stmt.close();
//            con.close();
//            System.out.println();
//            System.out.println("connection closed successfully !!!");


//            // m2 - using path names directly
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("Drivers loaded successfully!!!");
//
//            // establishing database connection
//            String url = "jdbc:mysql://localhost:3306/mydatabase";
//            String username = "root";
//            String password = "pass09";
//            Connection con = DriverManager.getConnection(url, username, password);
//            System.out.println("connection established successfully !!");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
