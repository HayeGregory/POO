package Exercices.ex01;

public class Chien {
    // Attributes
    private String nom;
    private String dateNaissance;
    private Personne Propietaire;

    // Constructor
    public Chien (String nom, String dateNaissance, Personne proprietaire) {
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.Propietaire = proprietaire;

    }

    // Setters - Getters
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getDateNaissance() {
        return dateNaissance;
    }
    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    public Personne getPropietaire() {
        return Propietaire;
    }
    public void setPropietaire(Personne propietaire) {
        Propietaire = propietaire;
    }

    // Methods
    public void aboyer() {
        System.out.println(nom + " aboie sur " + Propietaire.nom);

    }
}
