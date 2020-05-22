package Exercices.ex07PizzaPart3;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {

        Ingredient oignon = new Ingredient("oignon", 5);
        Ingredient fromage = new Ingredient("fromage", 10);
        Ingredient poivron = new Ingredient("poivron", 5);
        Ingredient olive = new Ingredient("olive", 5);
        Ingredient concombre = new Ingredient("concombre", 5);
        Ingredient ananas = new Ingredient("ananas", 5);
        Ingredient tomate = new Ingredient("tomate", 1);
        Ingredient pate = new Ingredient("pate", 1 );


        List<String> IB = new ArrayList<>();
        IB.add("olive");
        Pizza p1 = new Pizza("p1", IB);
        p1.voirIng();

        // Attendu: pas d'ajout
        if( p1.addIngredient(olive) )
            System.out.println("ajouté");
        else
            System.out.println("non ajouté");

        p1.voirIng();

        // Attendu: ajout de tomate
        if( p1.addIngredient(tomate) )
            System.out.println("ajouté");
        else
            System.out.println("non ajouté");

        if( p1.addIngredient(tomate) )
            System.out.println("ajouté");
        else
            System.out.println("non ajouté");

        p1.voirIng();

        p1.cuire();
    }
}
