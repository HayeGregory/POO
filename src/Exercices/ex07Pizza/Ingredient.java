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
        this.nom = nom;
    }

    public int getQqt() {
        return qqt;
    }

    public void setQqt(int qqt) {
        this.qqt = qqt;
    }
}
