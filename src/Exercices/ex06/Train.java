package Exercices.ex06;

public class Train implements Terrestre {
    // Attributes
    private int nbLocomotive;

    // Constructors
    public Train(int nbLocomotive) {
        this.nbLocomotive = nbLocomotive;
    }

    // Getters - Setters
    public int getNbLocomotive() {
        return nbLocomotive;
    }
    public void setNbLocomotive(int nbLocomotive) {
        this.nbLocomotive = nbLocomotive;
    }

    // Methods
    public void seDeplacer() {
        System.out.println(" se deplace sur les rails !");
    }

}
