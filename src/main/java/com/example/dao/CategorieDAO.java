package com.example.dao;

import com.example.model.Categorie;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategorieDAO extends DAO {
    public List<Categorie> getAll() {
        List<Categorie> liste = new ArrayList<>();
        try (
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM categorie")
        ) {
            while (rs.next()) {
                Categorie categorie = new Categorie();
                categorie.setId(rs.getLong("id"));
                categorie.setNom(rs.getString("nom"));
                categorie.setDescription(rs.getString("description"));
                liste.add(categorie);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return liste;
    }
}
