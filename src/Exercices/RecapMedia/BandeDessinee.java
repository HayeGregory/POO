package Exercices.RecapMedia;

public class BandeDessinee extends Livre implements Lisible{
    // Attributes
    private String nomDessinateur = "nom dessinateur defaut";

    // Getters - Setters

    public String getNomDessinateur() {
        return nomDessinateur;
    }
    public void setNomDessinateur(String nomDessinateur) {
        if (!nomDessinateur.isBlank()) {
            this.nomDessinateur = nomDessinateur;
        }
    }

    // Contructors
    public BandeDessinee(String titre, String nomAuteur, float prix, int nbChapitre, String resume, String nomDessinateur) {
        super(titre, nomAuteur, prix, nbChapitre, resume);
        setNomDessinateur(nomDessinateur);
    }

    // Methods
    // Override

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("Informations spécifique bande dessinée :\n");
        sb.append("Nom déssinateur : ").append(getNomDessinateur()).append("\n");

        return sb.toString();
    }

    @Override
    public void raconter() {
        System.out.println(getResume() + " + (nb chapitre  : " + getNbChapitre() + ")");
    }

    @Override
    public void lire() {
        System.out.println("lire bd");
    }
}
