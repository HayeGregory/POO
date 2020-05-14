package Exercices.ex04;

public class Chihuahua extends Chien {

    // Attributes
    private int decibel;

    // Constructors
    public Chihuahua(String nom, String dateNaiss, Double taille, int decibel) {
        super(nom, dateNaiss, taille);
        super.setRace("Chihuahua");
        setDecibel(decibel);
    }

    // Getsetters
    public int getDecibel() {
        return decibel;
    }
    public void setDecibel(int decibel) {
        this.decibel = decibel;
    }



    public void aboyer() {
        System.out.println(this.getNom() + " aboie à " + decibel  );
    }
    public void aboyer(String nom) {
        aboyer();
        System.out.println(" sur " + nom );
    }
}
