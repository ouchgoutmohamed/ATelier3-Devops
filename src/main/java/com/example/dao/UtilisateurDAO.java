package com.example.dao;


import com.example.model.Utilisateur;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UtilisateurDAO extends DAO {
    public List<Utilisateur> getAll() {
        List<Utilisateur> liste = new ArrayList<>();
        try (
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM utilisateur")
        ) {
            while (rs.next()) {
                Utilisateur utilisateur = new Utilisateur();
                utilisateur.setId(rs.getLong("id"));
                utilisateur.setNom(rs.getString("nom"));
                utilisateur.setEmail(rs.getString("email"));
                liste.add(utilisateur);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return liste;
    }
}
