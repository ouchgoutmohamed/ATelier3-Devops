package com.example.model;

import java.time.LocalDate;

public class Reservation {
    private Long id;
    private Livre livre;
    private Utilisateur utilisateur;
    private LocalDate dateReservation;

    public Reservation() {
    }

    public Reservation(Long id, Livre livre, Utilisateur utilisateur, LocalDate dateReservation) {
        this.id = id;
        this.livre = livre;
        this.utilisateur = utilisateur;
        this.dateReservation = dateReservation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public LocalDate getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(LocalDate dateReservation) {
        this.dateReservation = dateReservation;
    }
}