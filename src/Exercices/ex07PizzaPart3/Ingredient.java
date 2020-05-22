package Exercices.ex07PizzaPart3;

public class Ingredient {

    private String nom = "nom par défaut";
    private int qtt;

    public Ingredient(String nom, int qtt) {
        this.setNom(nom);
        this.setQtt(qtt);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if( !nom.isBlank() )
            this.nom = nom;
    }

    public int getQtt() {
        return qtt;
    }

    public void setQtt(int qtt) {
        if( qtt >= 0 )
            this.qtt = qtt;
    }
}
