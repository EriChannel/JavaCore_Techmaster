package org.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {
    private static final String HOST_NAME = "localhost:3306";
    private static final String DATABASE_NAME = "quizz";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Midnight1996.";

    private static final String URL = "jdbc:mysql://"+ HOST_NAME +"/"+DATABASE_NAME;

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConnect(Connection conn){
        try {
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
