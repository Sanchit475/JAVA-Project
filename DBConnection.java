package com.example;

import java.sql.*;

public class DBConnection {

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = System.getenv("DB_URL");
            String user = System.getenv("DB_USER");
            String pass = System.getenv("DB_PASSWORD");

            return DriverManager.getConnection(url,user,pass);

        } catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
