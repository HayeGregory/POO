package Exercices.RecapMediaPart3;

import java.util.*;

public class Utilisateur <T extends Media> {
    // Attributes
    private String nom = "user default";
    private float solde = 0;

    /* une bibliotheque contient plusieurs bibliotheque de media specifique */
    private Map<TypeMedia, Bibliotheque<? extends Media>> bibliotheque = new HashMap<>() {{
        put(TypeMedia.Album, new Bibliotheque<Album>(TypeMedia.Album));
        put(TypeMedia.LivreAudio, new Bibliotheque<LivreAudio>(TypeMedia.LivreAudio));
        put(TypeMedia.LivrePapier, new Bibliotheque<LivrePapier>(TypeMedia.LivrePapier));
        put(TypeMedia.BandeDessinee, new Bibliotheque<BandeDessinee>(TypeMedia.BandeDessinee));
    }};

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

    public Map<TypeMedia, Bibliotheque<? extends Media>> getBibliotheque() {
        return bibliotheque;
    }

    private void setBibliotheque(Map<TypeMedia, Bibliotheque<? extends Media>> bibliotheque) {
        this.bibliotheque = bibliotheque;
    }
    // Contructors

    public Utilisateur(String nom, float solde) {
        this.nom = nom;
        this.solde = solde;
//        bibliotheque.put("Albums", new Bibliotheque<Album>());
//        bibliotheque.put("Audios", new Bibliotheque<LivreAudio>());
//        bibliotheque.put("Livres", new Bibliotheque<LivrePapier>());
//        bibliotheque.put("BD", new Bibliotheque<BandeDessinee>());
    }

    // Methods

    private TypeMedia mediaUser(T media) {
        for (TypeMedia typeMedia : bibliotheque.keySet()) {
            if (media instanceof Album && typeMedia.equals(TypeMedia.Album)) return TypeMedia.Album;
            if (media instanceof LivreAudio && typeMedia.equals(TypeMedia.LivreAudio)) return TypeMedia.LivreAudio;
            if (media instanceof LivrePapier && typeMedia.equals(TypeMedia.LivrePapier)) return TypeMedia.LivrePapier;
            if (media instanceof BandeDessinee && typeMedia.equals(TypeMedia.BandeDessinee)) return TypeMedia.BandeDessinee;
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    public boolean acheter (T media) {

        if (mediaUser(media) == null) {
            System.out.println(getNom() + "ne possède pas une bibliotheque pouvant accueillir le media : " + media.getTitre());
            return false;
        }

        if ( getSolde() >= media.getPrix()) {
            setSolde(getSolde() - media.getPrix());
            return ((Bibliotheque<T>)bibliotheque.get(mediaUser(media))).ajouter(media);
        }
        System.out.println(getNom() + " ne peut acheter le media '"+ media.getTitre() + "' (prix : " +
                media.getPrix() + "), solde insuffisant : " + getSolde());
        return false;
    }

    @SuppressWarnings("unchecked")
    public boolean vendre (T media) {
        if (media == null) {
            System.out.println("Media inexistant"); return false;
        }

        if (mediaUser(media) == null) {
            System.out.println(getNom() + "ne possède pas une bibliotheque du media : " + media.getTitre());
            return false;
        }

        if (((Bibliotheque<T>)bibliotheque.get(mediaUser(media))).recuperer(media) != null) {
            setSolde(getSolde() + media.getPrix() / 2); // 50% du prix
            return ((Bibliotheque<T>)bibliotheque.get(mediaUser(media))).retirer(media);
        }
        System.out.println(media.getTitre() + "ne fait pas partie de la collection de " + this.getNom());
        return false;
    }

    @SuppressWarnings("unchecked")
    public boolean vendre (T media, Utilisateur<T> acheteur) {

        if (media == null) {
            System.out.println("Media inexistant"); return false;
        }

        if (mediaUser(media) == null) {
            System.out.println(getNom() + "ne possède pas une bibliotheque du media : " + media.getTitre());
            return false;
        }

       if (((Bibliotheque<T>)bibliotheque.get(mediaUser(media))).recuperer(media) != null) {
           if (acheteur.acheter(media)) {
               setSolde(getSolde() + media.getPrix());
               return ((Bibliotheque<T>)bibliotheque.get(mediaUser(media))).retirer(media);
           } else {
               System.out.println("vente annulée , l'acheteur n'as pas l'argent");
               return false;
           }
       }
       System.out.println("ne fait pas partie de la collection de " + getNom());
       return false;
    }

    @SuppressWarnings("unchecked")
    public T recuperer(T media ) {

        if (mediaUser(media) == null) {
            System.out.println(getNom() + "ne possède pas une bibliotheque du media : " + media.getTitre());
            return null;
        }

        return ((Bibliotheque<T>)bibliotheque).recuperer(media);
    }

    public T recuperer(String titre) {
        for (Bibliotheque<? extends Media> value : bibliotheque.values()) {
            if(value.recuperer(titre) != null) return ((Bibliotheque<T>)value).recuperer(titre);
        }
        return null;
    }

    private int totalMedia() {
        int n = 0;
        for (Bibliotheque<? extends Media> value : bibliotheque.values()) {
            n += value.recuperer().size();
        }
        return n;
    }
    public void listingMedias () {
        StringBuilder sb = new StringBuilder();

        sb.append("Liste des medias de ").append(getNom()).append(" : \n");

        for (Bibliotheque<? extends Media> value : bibliotheque.values()) {
            sb.append("[ ").append(value.getTypeMedia()).append(" ]\n");
            if (value.recuperer().size() == 0) sb.append("aucun media\n");
            for (Media media : value.recuperer()) {
                sb.append(media);
                sb.append("-----------------------------------------------------\n");
            }
        }

        System.out.println(sb.toString());
    }


    public void ecouter(Audible media) {

        System.out.println("<< debut audition >> par " + getNom());
        media.ecouter();
        System.out.println("<< fin audition >>");
    }

    public void lire(Lisible media) {
        System.out.println("<< debut lecture >> par " + getNom());
        media.lire();
        System.out.println("<< fin lecture >>");
    }

    // Override

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[ Nom Utilisateur : ").append(getNom());
        sb.append(" | Solde Utilisateur  : ").append(getSolde());
        sb.append(" | Nombre de media : ").append(totalMedia()).append(" ]\n");

        return sb.toString();
    }
}
