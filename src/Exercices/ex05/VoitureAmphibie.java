package Exercices.ex05;

public class VoitureAmphibie extends Voiture implements Navigant{
    private String couleur;

    public VoitureAmphibie(float poids, String modele, String couleur) {
        super(poids, modele);
        this.setCouleur(couleur);
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public void seDeplacer() {
        System.out.println("je me deplace sur terre et sur l'eau");
    }

    @Override
    public void naviguer() {
        System.out.println("Le vehicule amphibie  navigue");
    }

    @Override
    public void rouler() {
        System.out.println("Le vehicule amphibie roule");
    }
}
