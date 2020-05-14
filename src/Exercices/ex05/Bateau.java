package Exercices.ex05;

public class Bateau  extends Vehicule implements Navigant{
    private int puissanceMoteur;

    public Bateau(float poids, int puissanceMoteur) {
        super(poids);
        this.puissanceMoteur = puissanceMoteur;
    }

    public int getPuissanceMoteur() {
        return puissanceMoteur;
    }

    public void setPuissanceMoteur(int puissanceMoteur) {
        this.puissanceMoteur = puissanceMoteur;
    }


    @Override
    public void seDeplacer() {
        System.out.println("je me deplace sur l'eau");
    }

    @Override
    public void naviguer() {
        System.out.println("le code pour decrire comment le bateau navigue");
    }
}
