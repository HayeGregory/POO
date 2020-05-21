package Exercices.ex07Pizza;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ingredient champignon = new Ingredient("Champignon", 1);
        Ingredient lardon = new Ingredient("lardon", 22);

        List<Ingredient> compoPizzaChampignon = new ArrayList<>();
        compoPizzaChampignon.add(champignon);
        compoPizzaChampignon.add(lardon);

        Pizza pizzaChampi = new Pizza("Pizza Champignons" );

        pizzaChampi.setIngredients(compoPizzaChampignon);

        pizzaChampi.cuire();

    }
}
