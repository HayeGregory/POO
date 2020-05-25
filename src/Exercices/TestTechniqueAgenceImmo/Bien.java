package Exercices.TestTechniqueAgenceImmo;

public abstract class Bien {
    // Attributes
    private float prixVente;
    private float surfaceHabitable;
    private String adresse;
    private float revenuCadastral;
    private PEB peb;
    private int anneeConstruction;

    // Getters - Setters
    public float getPrixVente() {
        return prixVente;
    }
    public void setPrixVente(float prixVente) {
        this.prixVente = prixVente;
    }
    public float getSurfaceHabitable() {
        return surfaceHabitable;
    }
    public void setSurfaceHabitable(float surfaceHabitable) {
        this.surfaceHabitable = surfaceHabitable;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public float getRevenuCadastral() {
        return revenuCadastral;
    }
    public void setRevenuCadastral(float revenuCadastral) {
        this.revenuCadastral = revenuCadastral;
    }
    public PEB getPeb() {
        return peb;
    }
    public void setPeb(PEB peb) {
        this.peb = peb;
    }
    public int getAnneeConstruction() {
        return anneeConstruction;
    }
    public void setAnneeConstruction(int anneeConstruction) {
        this.anneeConstruction = anneeConstruction;
    }

    // Contructors
    public Bien(float prixVente, float surfaceHabitable, String adresse,
                float revenuCadastral, PEB peb, int anneeConstruction) {
        setPrixVente(prixVente);
        setSurfaceHabitable(surfaceHabitable);
        setAdresse(adresse);
        setRevenuCadastral(revenuCadastral);
        setPeb(peb);
        setAnneeConstruction(anneeConstruction);
    }

    // Methods
    // Override

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Informations générales : \n");
        sb.append("Prix de Vente : ").append(getPrixVente()).append("\n");
        sb.append("Surface Habitable : ").append(getSurfaceHabitable()).append("\n");
        sb.append("Adresse : ").append(getAdresse()).append("\n");
        sb.append("Revenu Cadastral : ").append(getRevenuCadastral()).append("\n");
        sb.append("PEB : ").append(getPeb()).append("\n");
        sb.append("Annee de construction : ").append(getAnneeConstruction()).append("\n");

        return sb.toString();
    }
}
