package Exercices.ex07Pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String nom;
    private List<Ingredient> ingredients;
    private boolean cuite;

    public Pizza(String nom) {
        this.nom = nom;
        this.ingredients = new ArrayList<>();
        this.cuite = false;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public boolean isCuite() {
        return cuite;
    }

    public void setCuite(boolean cuite) {
        this.cuite = cuite;
    }

    public boolean cuire() {
        int qqtIngredient = 0;

        for (Ingredient ingredient : ingredients) {
            qqtIngredient += ingredient.getQqt();
        }

        if ( qqtIngredient > 10 || qqtIngredient < 3) {
            System.out.println("Cuisson échouée :  ");
            System.out.println(qqtIngredient < 3 ? "Ingrédients insuffisant" : "Trop d'ingrédients");
            return false;
        }
        System.out.println("Cuisson réalisée !!");
        this.cuite =  true;
        return true;
    }
}
