package Exercices.ex07Pizza;

public class Main {
    public static void main(String[] args) {
        Ingredient champignon = new Ingredient("Champignon", 11);
        Pizza pizzaChampi = new Pizza("Pizza Champignons", champignon );

        pizzaChampi.cuire();
    }
}
