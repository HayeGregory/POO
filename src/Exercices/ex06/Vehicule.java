package Exercices.ex06;

public abstract class Vehicule {
    // Attributes
    private float poids;

    // Constructors
    public Vehicule(float poids) {
        this.poids = poids;
    }

    // Getters - Setters
    public float getPoids() {
        return poids;
    }
    public void setPoids(float poids) {
        this.poids = poids;
    }

    // Methods
    abstract public void seDeplacer();
}
