package Exercices.ex01;

public class Personne {
    String nom;
    String dateNaissance;

    // Constructors
    public Personne (String nom, String dateNaissance) {
        this.nom = nom;
        this.dateNaissance = dateNaissance;

    }

    public void caresser(Chien animal) {
        System.out.println(nom + " caresse " + animal.nom);

    }
    public void saluer() {
        System.out.println("Salut je m'appelle " + nom);

    }
}
