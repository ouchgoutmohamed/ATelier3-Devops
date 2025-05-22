package com.example.dao;

    import com.example.model.Etudiant;
    import java.sql.*;
    import java.util.*;

    public class EtudiantDAO {
        private String jdbcURL;
        private String jdbcUser;
        private String jdbcPassword;

        public EtudiantDAO() {
            String host = System.getenv("DB_HOST") != null ? System.getenv("DB_HOST") : "mysql";
            String port = System.getenv("DB_PORT") != null ? System.getenv("DB_PORT") : "3306";
            String dbName = System.getenv("DB_NAME") != null ? System.getenv("DB_NAME") : "devops_db";
            this.jdbcURL = "jdbc:mysql://" + host + ":" + port + "/" + dbName + "?useSSL=false&allowPublicKeyRetrieval=true";
            this.jdbcUser = System.getenv("DB_USER") != null ? System.getenv("DB_USER") : "root";
            this.jdbcPassword = System.getenv("DB_PASSWORD") != null ? System.getenv("DB_PASSWORD") : "root";
        }

        public List<Etudiant> getAll() {
            List<Etudiant> liste = new ArrayList<>();
            try (Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM etudiant")) {
                while (rs.next()) {
                    Etudiant e = new Etudiant();
                    e.setId(rs.getInt("id"));
                    e.setNom(rs.getString("nom"));
                    e.setPrenom(rs.getString("prenom"));
                    e.setEmail(rs.getString("email"));
                    liste.add(e);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return liste;
        }
    }
