package com.example.dao;

import com.example.model.Reservation;
import com.example.model.Livre;
import com.example.model.Utilisateur;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReservationDAO extends DAO {
    private String jdbcURL = "jdbc:mysql://mysql:3306/devops_db?useSSL=false&allowPublicKeyRetrieval=true";
    private String jdbcUser = "root";
    private String jdbcPassword = "root";

    public List<Reservation> getAll() {
        List<Reservation> liste = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM reservation")) {
            while (rs.next()) {
                Reservation reservation = new Reservation();
                reservation.setId(rs.getLong("id"));
                reservation.setLivre(new Livre()); // Placeholder, adjust with actual Livre object
                reservation.setUtilisateur(new Utilisateur()); // Placeholder, adjust with actual Utilisateur object
                reservation.setDateReservation(rs.getObject("date_reservation", LocalDate.class));
                liste.add(reservation);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return liste;
    }
}