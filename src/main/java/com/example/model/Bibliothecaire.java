
package com.example.model;

public class Bibliothecaire {
    private String matricule;
    private String role;

    public Bibliothecaire() {}

    public Bibliothecaire(String matricule, String role) {
        this.matricule = matricule;
        this.role = role;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
