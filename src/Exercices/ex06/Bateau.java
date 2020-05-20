package Exercices.ex06;

public class Bateau extends Vehicule {

    // Attributes

    // Constructors
    public Bateau(float poids) {
        super(poids);
    }
    // Getters - Setters

    // Methods
    @Override
    public void seDeplacer() {
        System.out.println(" navigue sur l'eau !");
    }
}
