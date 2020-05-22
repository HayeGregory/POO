package Exercices.ex07PizzaPart3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pizza {

    public static List<Ingredient> ingredientsBase = new ArrayList<>();

    private String nom;
    private List<Ingredient> ingredientList = new ArrayList<>();
    private List<String> ingredientsBanni = new ArrayList<>();
    private boolean cuite = false;

    // Constructors

    public Pizza(String nom, List<Ingredient> ingredientList, List<String> ingredientsBanni) {
        this.nom = nom;

        this.ingredientsBanni = ingredientsBanni;

        for ( Ingredient ing : ingredientList ) {
            this.addIngredient( ing );
        }

        ajoutIngBase();
    }

    public Pizza(String nom , List<String> ingredientsBanni) {
        this.nom = nom;
        this.ingredientsBanni = ingredientsBanni;
        ajoutIngBase();
    }
    public Pizza(String nom) {
        this.nom = nom;
        ajoutIngBase();
    }

    // Methods
    public static void ajoutIngBase () {
        ingredientsBase.add(new Ingredient("Pate", 1));
        ingredientsBase.add(new Ingredient("Coulis tomate", 1));
        ingredientsBase.add(new Ingredient("Mozzarella", 1));
    }
    public boolean cuire(){
        if (this.cuite) {
            System.out.println("Cette pizza est deja cuite");
            return false;
        }
        if( this.ingredientList.size() < 3 || this.ingredientList.size() > 10 )
        {
            System.out.println("La cuisson est raté " + ingredientList.size());
            return false;
        }

        System.out.println("La cuisson est réussie");
        this.setCuite(true);
        return true;
    }

    public boolean addIngredient(Ingredient ing){

        if (this.cuite) {
            System.out.println("Cette pizza est cuite, plus possible d'ajouter des ingredients");
            return false;
        }

        if (ingredientsBanni.contains(ing.getNom())) {
            System.out.println(ing.getNom() + " est un ingredient banni ");
            return false;
        }

        if (ingredientList.contains(ing)) {
            int idx = ingredientList.indexOf(ing);
            ingredientList.get(idx).setQtt(Math.min(ingredientList.get(idx).getQtt() + ing.getQtt(), 8));
            System.out.println("on a rajouter " + Math.min(ingredientList.get(idx).getQtt() + ing.getQtt(), 8) );
        }

        if( ing.getQtt() >= 1 && ing.getQtt() <= 8 )
        {
            System.out.println("L'ingrédient " + ing.getNom() + " a été ajouté.");
            this.ingredientList.add(ing);
            return true;
        }

        System.out.println("L'ingrédient " + ing.getNom() + " n'a pas été ajouté.");
        return false;
    }

    public void voirIng(){
        for (Ingredient commejeveux: ingredientList) {
            System.out.println(commejeveux.getNom());
        }
    }

    // Get/Set

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    private List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    private void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public boolean isCuite() {
        return cuite;
    }

    public void setCuite(boolean cuite) {
        this.cuite = cuite;
    }

}