package Exercices.ex05;

public class VoitureAmphibie extends Voiture implements Navigant{
    private String couleur;

    public VoitureAmphibie(float poids, String modele, String couleur) {
        super(poids, modele);
        this.couleur = couleur;
    }

    public String getSouleur() {
        return couleur;
    }

    public void setSouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public void seDeplacer() {
        System.out.println("je me deplace sur terre et sur l'eau");
    }

    @Override
    public void naviguer() {
        System.out.println("le code pour decrire comment le vehicule amphibie  navigue");
    }


}
