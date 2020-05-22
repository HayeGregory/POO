package Exercices.ex07Pizza;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ingredient champignon = new Ingredient("Champignon", 1);
        Ingredient tomate = new Ingredient("Tomate", 1);
        Ingredient lardon = new Ingredient("lardon", 10);

        List<Ingredient> compoPizzaChampignon = new ArrayList<>();
        compoPizzaChampignon.add(champignon);
        compoPizzaChampignon.add(lardon);
        compoPizzaChampignon.add(tomate);

        Pizza pizzaChampi = new Pizza("Pizza Champignons" );



        pizzaChampi.ajouterIngredients(compoPizzaChampignon);

        System.out.println(pizzaChampi);
        System.out.println("----");
        pizzaChampi.cuire();


    }
}
