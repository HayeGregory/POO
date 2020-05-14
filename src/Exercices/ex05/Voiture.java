package Exercices.ex05;

public class Voiture extends Vehicule implements Roulant {
    private String modele;

    public Voiture(float poids, String modele) {
        super(poids);
        this.modele = modele;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    @Override
    public void seDeplacer() {
        System.out.println("je me deplace sur la route");
    }

    @Override
    public void rouler() {
        System.out.println("La voiture roule");
    }
}
