package Exercices.ex07Pizza;

public class Ingredient {
    private String nom;
    private int qqt;

    public Ingredient(String nom, int qqt) {
        this.nom = nom;
        this.qqt = qqt;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom.length() > 0) {
            this.nom = nom;
        }
    }

    public int getQqt() {
        return qqt;
    }

    public void setQqt(int qqt) {
        if(qqt >= 0) {
            this.qqt = qqt;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("- ").append(getNom()).append(" qqt : ").append(getQqt()).append("\n");

        return sb.toString();
    }
}
