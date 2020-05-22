package Exercices.ex08Musicien;

public class Piano extends Instrument {
    public Piano(String marque, String modele, float prix) {
        super(marque, modele, prix);
    }

    @Override
    public void faireDuBruit() {
        System.out.println("pia pia pia");
    }
}
