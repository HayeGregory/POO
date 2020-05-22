package Exercices.ex08Musicien;

public class Flute extends Instrument {
    public Flute(String marque, String modele, float prix) {
        super(marque, modele, prix);
    }

    @Override
    public void faireDuBruit() {
        System.out.println("flu flu flu");
    }
}
