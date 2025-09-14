/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Sandeep Kumar
 */
public class c1connectDb {
    static Connection con=null;
    public static Connection ConnectToDB() {
        try {
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb2","root","pass09");
        } catch (SQLException ex) {
            Logger.getLogger(c1connectDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
