package Exercices.RecapMediaPart3;

import java.util.ArrayList;
import java.util.List;

public class Album extends Media implements Audible {
    // Attributes
    private List<String> titres = new ArrayList<>();

    // Getters - Setters
    public List<String> getTitres() {
        return titres;
    }
    public void setTitres(List<String> titres) {
        if (titres.size() > 0) {
            this.titres = titres;
        }
    }

    // Contructors
    public Album(String titre, String nomAuteur, float prix, List<String> titres) {
        super(titre, nomAuteur, prix);
        setTitres(titres);
    }

    // Methods
    // Override

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int n = 0;

        sb.append(super.toString());
        sb.append("Informations spécifique album :\n");

        sb.append("titres sur l'album : \n");
        if(titres.size() == 0) sb.append("Aucun titre\n");
        for (String titre : titres) {
            sb.append(++n).append(". ").append(titre).append("\n");
        }

        return sb.toString();
    }

    @Override
    public void ecouter() {
        System.out.println("ecoute album");
    }
}
