package Exercices.ex08Musicien;

public abstract class Instrument {
    // Attributes
    private String marque;
    private String modele;
    private float prix;

    // Getters - Setters
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    // Contructors
    public Instrument(String marque, String modele, float prix) {
        this.marque = marque;
        this.modele = modele;
        this.prix = prix;
    }

    // Methods
    abstract public void faireDuBruit();

    // Override

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Marque instrument : ").append(marque).append("\n");
        sb.append("Modele instrument : ").append(modele).append("\n");
        sb.append("Prix instrument : ").append(prix).append("\n");

        return sb.toString();
    }
}
