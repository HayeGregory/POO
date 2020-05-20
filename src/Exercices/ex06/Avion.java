package Exercices.ex06;

public class Avion extends Vehicule {

    // Attributes

    // Constructors
    public Avion(float poids) {
        super(poids);
    }
    // Getters - Setters

    // Methods
    @Override
    public void seDeplacer() {
        System.out.println(" vole dans les airs !");
    }
}
