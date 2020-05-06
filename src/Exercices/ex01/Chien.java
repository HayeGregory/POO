package Exercices.ex01;

public class Chien {
    String nom;
    String dateNaissance;
    Personne Propietaire;

    // Constructor
    public Chien (String nom, String dateNaissance, Personne proprietaire) {
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.Propietaire = proprietaire;

    }

    // Methods
    public void aboyer() {
        System.out.println(nom + " aboie sur " + Propietaire.nom);

    }
}
