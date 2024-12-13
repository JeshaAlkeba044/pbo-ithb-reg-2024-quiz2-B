package model.classes;

import controller.*;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;

public class DatabaseHandler {
    public Connection con;
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/Artwork?useLegacyDatetimeCode=false";
    private String username = "root";
    private String password = ""; 
 
    public Connection logOn() {
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, username, password);
            if (con != null) {
                System.out.println("Connection Successful!");
            }
        } catch (Exception ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getLocalizedMessage());
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Connection Error", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }

    public void loginOff(){
        try{
            con.close();
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Eror" + ex);
        }
    }

    public void connect() {
        try {
            con = logOn();
        } catch (Exception ex) {
            System.out.println("Error occured when connecting to database");
        }
    }

    public void disconnect(){
        try{
            loginOff();
        }catch(Exception ex){
            System.out.println("Error when connecting to database");
        }
    }
}
