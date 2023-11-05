/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectDB;

import utilities.connect.*;
import java.sql.*;


/**
 *
 * @author Nguyễn Xuân Nam
 */
public class ConnectDB {
    public static Connection conn;
    
    public static void connect() throws SQLException {
        String url = "jdbc:sqlserver://localhost:1433;databasename=KaraokeNightLight;encrypt=false";
        String user = "sa";
        String password = "sapassword";
        conn = DriverManager.getConnection(url, user, password);
    }
    
    public static void disconnect() {
        try {
            conn.close();
        } catch (SQLException e) {
            
        }
    }
}

