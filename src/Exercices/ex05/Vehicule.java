package Exercices.ex05;

public abstract class Vehicule {
    private float poids;

    public Vehicule(float poids) {
        this.poids = poids;
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    abstract public void seDeplacer();
}
