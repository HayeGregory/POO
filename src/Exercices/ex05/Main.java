package Exercices.ex05;

public class Main {
    public static void main(String[] args) {
        Voiture voiture = new Voiture(500, "Mazda");
        Bateau bateau = new Bateau(5000, 1999);
        VoitureAmphibie voitureAmphibie = new VoitureAmphibie(1000, "overcraft", "noir");

        System.out.println("voiture : ");
        voiture.seDeplacer();
        voiture.rouler();

        System.out.println("bateau : ");
        bateau.seDeplacer();
        bateau.naviguer();

        System.out.println("Vehicule amphibie :");
        voitureAmphibie.seDeplacer();
        voitureAmphibie.naviguer();
        voitureAmphibie.rouler();



    }
}
