package Exercices.ex07PizzaPart3;

public class Run {
    public static void main(String[] args) {

        Ingredient oignon = new Ingredient("oignon", 5);
        Ingredient fromage = new Ingredient("fromage", 10);
        Ingredient poivron = new Ingredient("poivron", 5);
        Ingredient olive = new Ingredient("olive", 5);
        Ingredient concombre = new Ingredient("concombre", 5);
        Ingredient ananas = new Ingredient("ananas", 5);
        Ingredient tomate = new Ingredient("tomate", 5);
        Ingredient pate = new Ingredient("pate", 1 );


        Pizza p1 = new Pizza("p1");
        p1.voirIng();

        // Attendu: pas d'ajout
        if( p1.addIngredient(fromage) )
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
    }
}
