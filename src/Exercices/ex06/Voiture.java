package Exercices.ex06;

public class Voiture extends Vehicule implements Terrestre{

    // Attributes

    // Constructors
    public Voiture(float poids) {
        super(poids);
    }
    // Getters - Setters

    // Methods
    @Override
    public void seDeplacer() {
        System.out.println(" roule sur la route !");
    }
}
