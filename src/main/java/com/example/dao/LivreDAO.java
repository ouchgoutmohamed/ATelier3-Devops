package com.example.dao;

import com.example.model.Livre;

import java.sql.*;
import java.util.*;

public class LivreDAO {

    private String jdbcURL = "jdbc:mysql://mysql:3306/devops_db?useSSL=false&allowPublicKeyRetrieval=true";
    private String jdbcUser = "root";
    private String jdbcPassword = "root";

    public List<Livre> getAll() {
        List<Livre> liste = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM livre")) {

            while (rs.next()) {
                Livre l = new Livre();
                l.setId(rs.getInt("id"));
                l.setTitre(rs.getString("titre"));
                l.setAuteur(rs.getString("auteur"));
                l.setAnnee(rs.getInt("annee"));
                liste.add(l);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return liste;
    }
}
