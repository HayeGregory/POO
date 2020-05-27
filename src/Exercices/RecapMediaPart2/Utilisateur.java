package Exercices.RecapMediaPart2;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
    // Attributes
    private String nom = "user default";
    private float solde = 0;
    private List<Album> albums = new ArrayList<>();
    private List<LivreAudio> audios = new ArrayList<>();
    private List<LivrePapier> livres = new ArrayList<>();
    private List<BandeDessinee> bedes = new ArrayList<>();

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

    public List<Album> getAlbums() {
        return albums;
    }
    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }
    public List<LivreAudio> getAudios() {
        return audios;
    }
    public void setAudios(List<LivreAudio> audios) {
        this.audios = audios;
    }
    public List<LivrePapier> getLivres() {
        return livres;
    }
    public void setLivres(List<LivrePapier> livres) {
        this.livres = livres;
    }
    public List<BandeDessinee> getBedes() {
        return bedes;
    }
    public void setBedes(List<BandeDessinee> bedes) {
        this.bedes = bedes;
    }

    // Contructors

    public Utilisateur(String nom, float solde,
                       List<Album> albums, List<LivreAudio> audios,
                       List<LivrePapier> livres, List<BandeDessinee> bedes) {
        setNom(nom);
        setSolde(solde);
        setAlbums(albums);
        setAudios(audios);
        setLivres(livres);
        setBedes(bedes);
    }

    public Utilisateur(String nom, float solde) {
        this(nom, solde, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
    }

    // Methods
    public boolean acheter (Album media) {
        if ( getSolde() >= media.getPrix()) {
            setSolde(getSolde() - media.getPrix());
            return albums.add(media);
        }
        System.out.println(getNom() + " ne peut acheter le media '"+ media.getTitre() + "' (prix : " +
                media.getPrix() + "), solde insuffisant : " + getSolde());
        return false;
    }
    public boolean acheter (LivrePapier media) {
        if ( getSolde() >= media.getPrix()) {
            setSolde(getSolde() - media.getPrix());
            return livres.add(media);
        }
        System.out.println(getNom() + " ne peut acheter le media '"+ media.getTitre() + "' (prix : " +
                media.getPrix() + "), solde insuffisant : " + getSolde());
        return false;
    }
    public boolean acheter (LivreAudio media) {
        if ( getSolde() >= media.getPrix()) {
            setSolde(getSolde() - media.getPrix());
            return audios.add(media);
        }
        System.out.println(getNom() + " ne peut acheter le media '"+ media.getTitre() + "' (prix : " +
                media.getPrix() + "), solde insuffisant : " + getSolde());
        return false;
    }
    public boolean acheter (BandeDessinee media) {
        if ( getSolde() >= media.getPrix()) {
            setSolde(getSolde() - media.getPrix());
            return bedes.add( media );
        }
        System.out.println(getNom() + " ne peut acheter le media '"+ media.getTitre() + "' (prix : " +
                media.getPrix() + "), solde insuffisant : " + getSolde());
        return false;
    }

    public boolean vendre (Album media) {
        if (albums.contains(media)) {
            setSolde(getSolde() + media.getPrix() / 2); // 50% du prix
            return albums.remove(media);
        }
        System.out.println(media.getTitre() + "ne fait pas partie de la collection de " + getNom());
        return false;
    }
    public boolean vendre (LivreAudio media) {
        if (audios.contains(media)) {
            setSolde(getSolde() + media.getPrix() / 2); // 50% du prix
            return audios.remove(media);
        }
        System.out.println(media.getTitre() + "ne fait pas partie de la collection de " + getNom());
        return false;
    }
    public boolean vendre (LivrePapier media) {
        if (livres.contains(media)) {
            setSolde(getSolde() + media.getPrix() / 2); // 50% du prix
            return livres.remove(media);
        }
        System.out.println(media.getTitre() + "ne fait pas partie de la collection de " + getNom());
        return false;
    }
    public boolean vendre (BandeDessinee media) {
        if (bedes.contains(media)) {
            setSolde(getSolde() + media.getPrix() / 2); // 50% du prix
            return bedes.remove(media);
        }
        System.out.println(media.getTitre() + "ne fait pas partie de la collection de " + getNom());
        return false;
    }

    public boolean vendre (Album media, Utilisateur acheteur) {
        if (albums.contains(media)) {
            if (acheteur.acheter(media)) {
                setSolde(getSolde() + media.getPrix());
                return albums.remove(media);
            } else {
                System.out.println("vente annulée , l'acheteur n'as pas l'argent");
                return false;
            }
        }
        System.out.println(media.getTitre() + "ne fait pas partie de la collection de " + getNom());
        return false;
    }
    public boolean vendre (LivrePapier media, Utilisateur acheteur) {
        if (livres.contains(media)) {
            if (acheteur.acheter(media)) {
                setSolde(getSolde() + media.getPrix());
                return livres.remove(media);
            } else {
                System.out.println("vente annulée , l'acheteur n'as pas l'argent");
                return false;
            }
        }
        System.out.println(media.getTitre() + "ne fait pas partie de la collection de " + getNom());
        return false;
    }
    public boolean vendre (LivreAudio media, Utilisateur acheteur) {
        if (audios.contains(media)) {
            if (acheteur.acheter(media)) {
                setSolde(getSolde() + media.getPrix());
                return audios.remove(media);
            } else {
                System.out.println("vente annulée , l'acheteur n'as pas l'argent");
                return false;
            }
        }
        System.out.println(media.getTitre() + "ne fait pas partie de la collection de " + getNom());
        return false;
    }
    public boolean vendre (BandeDessinee media, Utilisateur acheteur) {
        if (bedes.contains(media)) {
            if (acheteur.acheter(media)) {
                setSolde(getSolde() + media.getPrix());
                return bedes.remove(media);
            } else {
                System.out.println("vente annulée , l'acheteur n'as pas l'argent");
                return false;
            }
        }
        System.out.println(media.getTitre() + "ne fait pas partie de la collection de " + getNom());
        return false;
    }

    public Album recupererAlbum(int index ) {
        return albums.get(index);
    }
    public LivrePapier recupererLivre(int index ) {
        return livres.get(index);
    }
    public LivreAudio recupererAudio(int index ) {
        return audios.get(index);
    }
    public BandeDessinee recupererBD(int index ) {
        return bedes.get(index);
    }

    public void listingMedias () {
        StringBuilder sb = new StringBuilder();

        sb.append("Liste des medias de ").append(getNom()).append(" : \n");

        sb.append("Liste des albums ").append(getNom()).append(" : \n");
        if (albums.size() == 0) sb.append("aucun media\n");
        for (Album media : albums) {
            sb.append(media);
            sb.append("-----------------------------------------------------\n");
        }
        sb.append("Liste des audios ").append(getNom()).append(" : \n");
        if (audios.size() == 0) sb.append("aucun media\n");
        for (LivreAudio media : audios) {
            sb.append(media);
            sb.append("-----------------------------------------------------\n");
        }
        sb.append("Liste des livres ").append(getNom()).append(" : \n");
        if (livres.size() == 0) sb.append("aucun media\n");
        for (LivrePapier media : livres) {
            sb.append(media);
            sb.append("-----------------------------------------------------\n");
        }
        sb.append("Liste des BD ").append(getNom()).append(" : \n");
        if (bedes.size() == 0) sb.append("aucun media\n");
        for (BandeDessinee media : bedes) {
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
        sb.append(" | Nombre de media : ").append(
                albums.size() + audios.size() + livres.size() + bedes.size()).append("]\n");

        return sb.toString();
    }
}
