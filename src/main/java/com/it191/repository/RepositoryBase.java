package com.it191.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class RepositoryBase {
    private String USERNAME = "sql6636483";
    private String PASSWORD = "v2rfhrF38K";
    private final String LINK = "jdbc:mysql://sql6.freemysqlhosting.net:3306?useTimezone=true&serverTimezone=UTC";
    private final String CONNECTOR = "com.mysql.cj.jdbc.Driver";

    public RepositoryBase() {
        try { Class.forName(CONNECTOR); } catch(ClassNotFoundException ex) {}
    }

    protected Connection getSqlConnection() {
        try {
            Connection sql_con = DriverManager.getConnection(LINK, USERNAME, PASSWORD);
            
            Statement SetDB = sql_con.createStatement();
            SetDB.executeUpdate("USE sql6636483");

            return sql_con;
    
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
