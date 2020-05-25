package Exercices.TestTechniqueAgenceImmo;

public final class Appart extends Bien  {
    // Attributes
    private int nbChambre;
    private boolean possedeJardin;
    private boolean jardinPrivate; // true : private , false : collectif
    private float chargesCopropriete;

    // Getters - Setters

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

    public boolean isJardinPrivate() {
        return jardinPrivate;
    }

    public void setJardinPrivate(boolean jardinPrivate) {
        this.jardinPrivate = jardinPrivate;
    }

    public float getChargesCopropriete() {
        return chargesCopropriete;
    }

    public void setChargesCopropriete(float chargesCopropriete) {
        this.chargesCopropriete = chargesCopropriete;
    }

    // Contructors

    public Appart(float prixVente, float surfaceHabitable, String adresse, float revenuCadastral, PEB peb,
                  int anneeConstruction, int nbChambre, boolean possedeJardin, boolean jardinPrivate,
                  float chargesCopropriete) {
        super(prixVente, surfaceHabitable, adresse, revenuCadastral, peb, anneeConstruction);
        this.nbChambre = nbChambre;
        this.possedeJardin = possedeJardin;
        this.jardinPrivate = jardinPrivate;
        this.chargesCopropriete = chargesCopropriete;
    }

    // Methods
    // Override

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("Informations spécifique à l'appartements : \n\t");
        sb.append("- Nombre de Chambres : ").append(getNbChambre()).append("\n\t");
        sb.append("- Jardin : ").append(isPossedeJardin()?"Oui":"Non").append("\n\t");
        sb.append("- Jardin privé : ").append(isJardinPrivate()?"Oui":"Non").append("\n\t");
        sb.append("- Charge co-propriete : ").append(getChargesCopropriete()).append("\n");

        return sb.toString();
    }
}
