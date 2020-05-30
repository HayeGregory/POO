package Exercices.ex01;

public class Main {
    /*
     * Enoncé : voir schéma dossier
     * */
    public static void main(String[] args) {
        Personne greg = new Personne("Greg", "14061979");
        Chien idefix = new Chien("Idefix", "10102010", greg);

        greg.saluer();
        idefix.aboyer();
        greg.caresser(idefix);

        System.out.println(greg.getClass().getSimpleName());

    }
}
