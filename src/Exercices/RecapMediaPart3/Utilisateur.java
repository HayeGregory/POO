package Exercices.RecapMediaPart3;

public class Utilisateur <T extends Media> {
    // Attributes
    private String nom = "user default";
    private float solde = 0;

    private Bibliotheque<T> bibliotheque = new Bibliotheque<>();

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

    public Bibliotheque<T> getBibliotheque() {
        return bibliotheque;
    }
    public void setBibliotheque(Bibliotheque<T> bibliotheque) {
        this.bibliotheque = bibliotheque;
    }

    // Contructors

    public Utilisateur (String nom, float solde) {
        setNom(nom);
        setSolde(solde);
     }


    // Methods
    public boolean acheter (T media) {
        if ( getSolde() >= media.getPrix()) {
            setSolde(getSolde() - media.getPrix());
            return bibliotheque.ajouter(media);
        }
        System.out.println(getNom() + " ne peut acheter le media '"+ media.getTitre() + "' (prix : " +
                media.getPrix() + "), solde insuffisant : " + getSolde());
        return false;
    }


     public boolean vendre (T media) {
        if (bibliotheque.recuperer(media) != null) {
            setSolde(getSolde() + media.getPrix() / 2); // 50% du prix
            return bibliotheque.retirer(media);
        }
        System.out.println(media.getTitre() + "ne fait pas partie de la collection de " + this.getNom());
        return false;
    }

    public boolean vendre (T media, Utilisateur<T> acheteur) {

        //TODO

        if (bibliotheque.recuperer(media) != null) {
            if (acheteur.acheter(media)) {
                setSolde(getSolde() + media.getPrix());
                return bibliotheque.retirer(media);
            } else {
                System.out.println("vente annulée , l'acheteur n'as pas l'argent");
                return false;
            }
        }
        System.out.println("ne fait pas partie de la collection de " + getNom());
        return false;
    }

    public T recuperer(T media ) {
        return bibliotheque.recuperer(media);
    }
    public T recuperer(String titre) { return bibliotheque.recuperer(titre);}

    public void listingMedias () {
        StringBuilder sb = new StringBuilder();

        sb.append("Liste des medias de ").append(getNom()).append(" : \n");

        if (bibliotheque.recuperer().size() == 0) sb.append("aucun media\n");
        for (T media : bibliotheque.recuperer()) {
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
        sb.append(" | Nombre de media : ").append(bibliotheque.recuperer().size()).append("]\n");

        return sb.toString();
    }
}
