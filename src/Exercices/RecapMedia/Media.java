package Exercices.RecapMedia;

public abstract class Media {
    // Attributes
    private String titre = "Titre par défaut";
    private String nomAuteur = "Auteur par défaut";
    private float prix = 5;

    // Getters - Setters
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        if(!titre.isBlank()) {
            this.titre = titre;
        }
    }
    public String getNomAuteur() {
        return nomAuteur;
    }
    public void setNomAuteur(String nomAuteur) {
        if(!nomAuteur.isBlank()) {
            this.nomAuteur = nomAuteur;
        }
    }
    public float getPrix() {
        return prix;
    }
    public void setPrix(float prix) {
        if (prix > 5) {
            this.prix = prix;
        }
    }

    // Contructors
    public Media(String titre, String nomAuteur, float prix) {
        setTitre(titre);
        setNomAuteur(nomAuteur);
        setPrix(prix);
    }
    public Media() {
        this("Titre par défaut", "Auteur pardefaut", 6);
    }

    // Methods
    // Override

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Titre : ").append(getTitre()).append("\n");
        sb.append("Auteur : ").append(getNomAuteur()).append("\n");
        sb.append("Prix : ").append(getPrix()).append("\n");

        return sb.toString();
    }
}
