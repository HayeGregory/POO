package Exercices.ex03;

public class Humain {
    private String nom;
    private String dateNaissance;

    public Humain(String nom, String dateNaissance) {
        this.nom = nom;
        this.dateNaissance = dateNaissance;
    }

    public void saluer() {
        System.out.println("Bonjour je suis " + nom);
    }
    public void saluer(String message) {
        saluer();
        System.out.println("Mon message est '" + message + "'");
    }
    public void saluer(int repetition) {
        for (int i = 0; i < repetition; i++) {
            saluer();
        }
    }
    public void saluer(int repetition, String message) {
        saluer();
        for (int i = 0; i < repetition; i++) {
            System.out.println("Mon message est '" + message + "'");
        }
    }
    public void saluer(String message, int repetition) {
        for (int i = 0; i < repetition; i++) {
            saluer(message);
        }
    }
}
