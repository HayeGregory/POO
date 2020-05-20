package Exercices.ex06;

public class Main {
    public static void main(String[] args) {
        Vehicule avion = new Avion(15000);
        Vehicule bateau = new Bateau(700);
        Vehicule voiture = new Voiture(500);
        Train train = new Train(8000);

        Conducteur<Vehicule> Greg = new Conducteur<Vehicule>("Greg", avion);

        Greg.conduire();
    }
}
