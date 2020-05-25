package Exercices.ex09Pilegeneric;

public class Verre {
    private float capacite;

    public float getCapacite() {
        return capacite;
    }

    public void setCapacite(float capacite) {
        this.capacite = capacite;
    }

    public Verre(float capacite) {
        if (capacite >= 0) {
            this.capacite = capacite;
        }
    }
}
