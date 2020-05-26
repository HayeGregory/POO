package Exercices.RecapMedia;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
    // Attributes
    private String nom = "user default";
    private float solde = 0;
    private List<Media> medias = new ArrayList<>();

    // Getters - Setters
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        if (!this.nom.isBlank()) {
            this.nom = nom;
        }
    }
    public float getSolde() {
        return solde;
    }
    private void setSolde(float solde) {
        if ( this.solde >= 0 ) {
            this.solde = solde;
        }
    }
    public List<Media> getMedias() {
        return medias;
    }
    public void setMedias(List<Media> medias) {
        this.medias = medias;
    }

    // Contructors
    public Utilisateur(String nom, float solde, List<Media> medias) {
        setNom(nom);
        setSolde(solde);
        setMedias(medias);
    }
    public Utilisateur(String nom, float solde) {
        this(nom, solde, new ArrayList<>());
    }

    // Methods
    public boolean acheter (Media media) {
        if ( getSolde() >= media.getPrix()) {
            setSolde(getSolde() - media.getPrix());
            return medias.add(media);
        }
        System.out.println(getNom() + " ne peut acheter le media '"+ media.getTitre() + "' (prix : " +
               media.getPrix() + "), solde insuffisant : " + getSolde());
        return false;
    }

    public boolean vendre (Media media) {
        if (medias.contains(media)) {
            setSolde(getSolde() + media.getPrix() / 2); // 50% du prix
            return medias.remove(media);
        }
        System.out.println(media.getTitre() + "ne fait pas partie de la collection de " + getNom());
        return false;
    }
    public boolean vendre (Media media, Utilisateur acheteur) {
        if (medias.contains(media)) {
            if (acheteur.acheter(media)) {
                setSolde(getSolde() + media.getPrix());
                return medias.remove(media);
            } else {
                System.out.println("vente annulée , l'acheteur n'as pas l'argent");
                return false;
            }
        }
        System.out.println(media.getTitre() + "ne fait pas partie de la collection de " + getNom());
        return false;
    }

    public Media recupererMedia(int index ) {
        return medias.get(index);
    }

    public void listingMedias () {
        StringBuilder sb = new StringBuilder();

        sb.append("Liste des medias de ").append(getNom()).append(" : \n");
        if (medias.size() == 0) sb.append("aucun media");
        for (Media media : medias) {
            sb.append(media);
            sb.append("-----------------------------------------------------\n");
        }

        System.out.println(sb.toString());
    }

    public void ecouter(Audible media) {
        System.out.println("<< debut audition >>");
        media.ecouter();
        System.out.println("<< fin audition >>");
    }

    public void lire(Lisible media) {
        System.out.println("<< debut lecture >>");
        media.lire();
        System.out.println("<< fin lecture >>");
    }

   // Override

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[ Nom Utilisateur : ").append(getNom());
        sb.append(" | Solde Utilisateur  : ").append(getSolde());
        sb.append(" | Nombre de media : ").append(medias.size()).append("]\n");

        return sb.toString();
    }
}
