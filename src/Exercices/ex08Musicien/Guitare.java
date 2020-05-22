package Exercices.ex08Musicien;

public class Guitare extends Instrument {
    public Guitare(String marque, String modele, float prix) {
        super(marque, modele, prix);
    }

    @Override
    public void faireDuBruit() {
        System.out.println("grat grat grat");
    }
}
