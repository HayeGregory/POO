package Exercices.TestTechniqueAgenceImmo;

public final class Studio extends Bien {
    // Attributes
    private boolean cuisineEquipee; // true : equipee, false nonEquipee
    private float chargesCopropriete;

    // Getters - Setters
    public boolean isCuisineEquipee() {
        return cuisineEquipee;
    }

    public void setCuisineEquipee(boolean cuisineEquipee) {
        this.cuisineEquipee = cuisineEquipee;
    }

    public float getChargesCopropriete() {
        return chargesCopropriete;
    }

    public void setChargesCopropriete(float chargesCopropriete) {
        this.chargesCopropriete = chargesCopropriete;
    }

    // Contructors

    public Studio(float prixVente, float surfaceHabitable, String adresse, float revenuCadastral, PEB peb,
                  int anneeConstruction, boolean cuisineEquipee, float chargesCopropriete) {
        super(prixVente, surfaceHabitable, adresse, revenuCadastral, peb, anneeConstruction);
        this.cuisineEquipee = cuisineEquipee;
        this.chargesCopropriete = chargesCopropriete;
    }

    // Methods
    // Override

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("Informations studio : \n\t");
        sb.append("- Cuisine équipée : ").append(isCuisineEquipee()?"Oui":"Non").append("\n\t");
        sb.append("- Charge co-propriété : ").append(getChargesCopropriete()).append("\n");

        return sb.toString();
    }
}
