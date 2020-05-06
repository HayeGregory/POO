package Exercices.ex01;

public class Personne {
    // Attributes
    String nom;
    String dateNaissance;

    // Constructors
    public Personne (String nom, String dateNaissance) {
        setNom(nom);
        setDateNaissance(dateNaissance);

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

    // Methods
    public void caresser(Chien animal) {
        System.out.println(nom + " caresse " + animal.getNom());

    }

    public void saluer() {
        System.out.println("Salut je m'appelle " + nom);

    }
}
