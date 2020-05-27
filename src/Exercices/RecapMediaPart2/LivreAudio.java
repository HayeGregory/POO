package Exercices.RecapMediaPart2;

public final class LivreAudio extends Livre implements Audible {
    // Attributes
    private String nomNarrateur = "narrateur par defaut";

    // Getters - Setters
    public String getNomNarrateur() {
        return nomNarrateur;
    }
    public void setNomNarrateur(String nomNarrateur) {
        if (!nomNarrateur.isBlank()) {
            this.nomNarrateur = nomNarrateur;
        }
    }

    // Contructors
    public LivreAudio(String titre, String nomAuteur, float prix, int nbChapitre, String resume, String nomNarrateur) {
        super(titre, nomAuteur, prix, nbChapitre, resume);
        setNomNarrateur(nomNarrateur);
    }

    // Methods
    // Override
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("Informations spécifique livre audio :\n");
        sb.append("Narrateur : ").append(getNomNarrateur()).append("\n");

        return sb.toString();
    }

    @Override
    public void raconter() {
        System.out.println(getNomNarrateur() + " narre : \n<< " + getResume() + " >>");
    }

    @Override
    public void ecouter() {
        System.out.println("ecoute du livre audio");
    }
}
