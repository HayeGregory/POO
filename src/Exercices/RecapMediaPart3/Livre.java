package Exercices.RecapMediaPart3;

public abstract class Livre extends Media {
    // Attributes
    private int nbChapitre = 1;
    private String resume;

    // Getters - Setters
    public int getNbChapitre() {
        return nbChapitre;
    }
    public void setNbChapitre(int nbChapitre) {
        if (nbChapitre > 0) {
            this.nbChapitre = nbChapitre;
        }
    }
    public String getResume() {
        return resume;
    }
    public void setResume(String resume) {
        this.resume = resume;
    }

    // Contructors
    public Livre(String titre, String nomAuteur, float prix, int nbChapitre, String resume) {
        super(titre, nomAuteur, prix);
        setNbChapitre(nbChapitre);
        setResume(resume);
    }
    public Livre() {
        this("titre defaut livrepapier", "Auteur defaut livrepapier", 0,0,"");
    }

    // Methods
    public abstract void raconter();

    // Override
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("Informations spécifique livre :\n");
        sb.append("Nombre de chapitre : ").append(getNbChapitre()).append("\n");
        sb.append("Résumé : ").append(getResume().length()==0? "Aucun" : getResume()).append("\n");

        return sb.toString();
    }


}
