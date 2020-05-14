package Exercices.ex04;

public class Chien {

    // Attributes
    private String nom;
    private String dateNaiss;
    private Double taille;
    private String race;

    // Constructors
    public Chien(String nom, String dateNaiss, Double taille ) {
        this.nom = nom;
        this.dateNaiss = dateNaiss;
        this.taille = taille;
        this.race = "default";
    }

    // GetSetters
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getDateNaiss() {
        return dateNaiss;
    }
    public void setDateNaiss(String dateNaiss) {
        this.dateNaiss = dateNaiss;
    }
    public Double getTaille() {
        return taille;
    }
    public void setTaille(Double taille) {
        this.taille = taille;
    }
    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    }

    // Methods
    public void aboyer() {
        System.out.println(nom + " aboie ");
    }
}
