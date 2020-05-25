package Exercices.TestTechniqueAgenceImmo;

public final class Maison extends Bien{
    // Attributes
    private int nbFacade;
    private int nbChambre;
    private boolean possedeJardin;
    private float superficieTotaleTerrain;

    // Getters - Setters

    public int getNbFacade() {
        return nbFacade;
    }

    public void setNbFacade(int nbFacade) {
        this.nbFacade = nbFacade;
    }

    public int getNbChambre() {
        return nbChambre;
    }

    public void setNbChambre(int nbChambre) {
        this.nbChambre = nbChambre;
    }

    public boolean isPossedeJardin() {
        return possedeJardin;
    }

    public void setPossedeJardin(boolean possedeJardin) {
        this.possedeJardin = possedeJardin;
    }

    public float getSuperficieTotaleTerrain() {
        return superficieTotaleTerrain;
    }

    public void setSuperficieTotaleTerrain(float superficieTotaleTerrain) {
        this.superficieTotaleTerrain = superficieTotaleTerrain;
    }

    // Contructors

    public Maison(float prixVente, float surfaceHabitable, String adresse, float revenuCadastral, PEB peb,
                  int anneeConstruction, int nbFacade, int nbChambre, boolean possedeJardin,
                  float superficieTotaleTerrain) {
        super(prixVente, surfaceHabitable, adresse, revenuCadastral, peb, anneeConstruction);
        this.nbFacade = nbFacade;
        this.nbChambre = nbChambre;
        this.possedeJardin = possedeJardin;
        this.superficieTotaleTerrain = superficieTotaleTerrain;
    }


    // Methods
    // Override

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("Informations Maison : \n\t");
        sb.append("- Nombre de facades : ").append(getNbFacade()).append("\n\t");
        sb.append("- Nombre de Chambres : ").append(getNbChambre()).append("\n\t");
        sb.append("- Jardin : ").append(isPossedeJardin()?"Oui":"Non").append("\n\t");
        sb.append("- Superficie totale terrain : ").append(getSuperficieTotaleTerrain()).append("\n");

        return sb.toString();
    }
}
