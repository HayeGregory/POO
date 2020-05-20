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

        return qqtIngredient <= 10 && qqtIngredient >= 3;
    }
}
