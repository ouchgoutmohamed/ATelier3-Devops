
package com.example.dao;

import com.example.model.Bibliothecaire;

import java.util.ArrayList;
import java.util.List;

public class BibliothecaireDAO {

    private static List<Bibliothecaire> bibliothecaires = new ArrayList<>();

    static {
        bibliothecaires.add(new Bibliothecaire("BIB001", "Admin"));
        bibliothecaires.add(new Bibliothecaire("BIB002", "Responsable"));
    }

    public List<Bibliothecaire> getAll() {
        return bibliothecaires;
    }

    public void add(Bibliothecaire b) {
        bibliothecaires.add(b);
    }

    public Bibliothecaire getByMatricule(String matricule) {
        for (Bibliothecaire b : bibliothecaires) {
            if (b.getMatricule().equals(matricule)) {
                return b;
            }
        }
        return null;
    }
}
