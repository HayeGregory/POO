package Exercices.RecapMediaPart2;

public final class LivrePapier extends Livre implements Lisible {
    // Attributes
    private int nbPage = 1;

    // Getters - Setters
    public int getNbPage() {
        return nbPage;
    }
    public void setNbPage(int nbPage) {
        if (nbPage > 0) {
            this.nbPage = nbPage;
        }
    }

    // Contructors
    public LivrePapier(String titre, String nomAuteur, float prix, int nbChapitre, String resume, int nbPage) {
        super(titre, nomAuteur, prix, nbChapitre, resume);
        setNbPage(nbPage);
    }

    // Methods
    // Override

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("Informations spécifique livre papier :\n");
        sb.append("Nombre de page : ").append(getNbPage()).append("\n");

        return sb.toString();
    }

    @Override
    public void raconter() {
        System.out.println(getResume() + " + (nb page : " + getNbPage() + ")");
    }

    @Override
    public void lire() {
        System.out.println("lire le livre papier");
    }
}
