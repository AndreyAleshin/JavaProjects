package com.brainacad.andreyaa.labs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnector {

    private final String url = "jdbc:postgresql://localhost:5432/Store";
    private final String user = "postgres"; // andrey
    private final String password = "andrey12"; // andrey

    /**
     * Connects to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Successful connection to the PostgreSQL server.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JDBCConnector app = new JDBCConnector();
        app.connect();
    }
}