package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/task1/1/4";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "2810";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("Connection is successful");
        } catch (ClassNotFoundException | SQLException e) {
            e.getStackTrace();
            System.out.println("Connection ERROR");
        }
        return connection;
    }
}
