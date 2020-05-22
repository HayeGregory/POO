package Exercices.ex07Pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    static Ingredient ingredientBase = new Ingredient("Pâte",1);
    private String nom;
    private List<Ingredient> ingredients;
    private boolean cuite;

    public Pizza(String nom) {
        this.nom = nom;
        this.ingredients = new ArrayList<>();
        ajouterIngredient(ingredientBase);
        this.cuite = false;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    private List<Ingredient> getIngredients() {
        return ingredients;
    }

    private void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public boolean isCuite() {
        return cuite;
    }

    public void setCuite(boolean cuite) {
        this.cuite = cuite;
    }

    public void ajouterIngredients (List<Ingredient> ingredients) {
        for (Ingredient ingredient : ingredients) {
            ajouterIngredient(ingredient);
        }
    }
    public void ajouterIngredient(Ingredient ingredient) {
        if (ingredient.getQqt() < 1 || ingredient.getQqt() > 8) {
            System.out.println(ingredient.getNom() + " pas ajouté , quantite requise entre 1 et 8");
        } else {
            this.getIngredients().add(ingredient);
        }
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

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("nom : ").append(this.nom).append("\n");
        sb.append("Ingredients : ").append("\n");
        for (Ingredient ingredient : ingredients) {
            sb.append(ingredient);
        }
        return sb.toString();
    }
}
