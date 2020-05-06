package Exercices.ex02;

import java.util.Objects;

public class Chien {
    private String nom;
    private String race;

    // Constructors
    public Chien(String nom, String race) {
        setNom(nom);
        setRace(race);
    }


    // Getters -- Setters
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        if (!nom.contains(" ")) this.nom = nom;
    }
    public String getRace() {
        return race;
    }
    private void setRace(String race) {
        this.race = race;
    }
}
