package Exercices.ex09Pilegeneric;

public final class Verre extends Vaisselle{
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
