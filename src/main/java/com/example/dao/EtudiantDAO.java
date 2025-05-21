package com.example.dao;

    import com.example.model.Etudiant;
    import java.sql.*;
    import java.util.*;

    public class EtudiantDAO extends DAO {
        public List<Etudiant> getAll() {
            List<Etudiant> liste = new ArrayList<>();
            try (
                    Connection conn = getConnection();
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT * FROM etudiant")
            ) {
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