package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
    protected String jdbcURL;
    protected String jdbcUser;
    protected String jdbcPassword;

    public DAO() {
        String host = System.getenv("MYSQL_HOST") != null ? System.getenv("MYSQL_HOST") : "mysql";
        String db = System.getenv("MYSQL_DB") != null ? System.getenv("MYSQL_DB") : "devops_db";
        this.jdbcUser = System.getenv("MYSQL_USER") != null ? System.getenv("MYSQL_USER") : "root";
        this.jdbcPassword = System.getenv("MYSQL_PASSWORD") != null ? System.getenv("MYSQL_PASSWORD") : "root";
        this.jdbcURL = "jdbc:mysql://" + host + ":3306/" + db + "?useSSL=false&allowPublicKeyRetrieval=true";
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
    }
}
