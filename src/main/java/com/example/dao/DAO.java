package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
    protected String jdbcURL = "jdbc:mysql://mysql:3306/devops_db?useSSL=false&allowPublicKeyRetrieval=true";
    protected String jdbcUser = "root";
    protected String jdbcPassword = "";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
    }
}
