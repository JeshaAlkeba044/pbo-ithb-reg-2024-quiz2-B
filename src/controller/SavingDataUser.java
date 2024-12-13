package controller;

import model.classes.Users;
import model.classes.Artworks;
import model.classes.DatabaseHandler;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import java.util.TimeZone;

public class SavingDataUser {

    public boolean insertValueToDB(Map<String, Object> data) {
    Connection con = new DatabaseHandler().logOn();
    PreparedStatement stmt = null;
    try {
        String query = "INSERT INTO User (id_User, name, email, password) VALUES (?, ?, ?, ?)";
        stmt = con.prepareStatement(query);

        stmt.setInt(1, (int) data.get("id_User"));
        stmt.setString(2, (String) data.get("nama"));
        stmt.setString(3, (String) data.get("email"));
        stmt.setString(5, (String) data.get("password"));
        
        int result = stmt.executeUpdate();
        return result > 0;  
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    } finally {
        try {
            if (stmt != null) stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

}

