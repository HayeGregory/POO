package Exercices.ex07Pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String nom;
    private List<Ingredient> ingredients;
    private boolean cuite;

    public Pizza(String nom, Ingredient ingredient) {
        this.nom = nom;
        this.ingredients = new ArrayList<>();
        for (int i = 0; i < ingredient.getQqt(); i++) {
            ingredients.add(ingredient);
        }
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
        if (ingredients.size() <= 10 && ingredients.size() > 0) {
            System.out.println("cuite reussie");
        } else {
            System.out.println("cuisson ratée");
        }

        return ingredients.size() <= 10 && ingredients.size() >= 3;
    }
}
