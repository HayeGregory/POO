package Exercices.exRecap01;

import java.time.LocalDateTime;

public class Zebre extends Animal implements Galopant{
    // Attributes
    private Veterinaire<Zebre> vetoDedie;

    // Constructors
    public Zebre(String nom, char sexe, Veterinaire<Zebre> vetoDedie) {
        super(nom, sexe);
        this.vetoDedie = vetoDedie;
    }
    public Zebre(){
        this("Zèbre par defaut", '-', new Veterinaire<Zebre>());
    };

    // Getters - Setters
    public Veterinaire<Zebre> getVetoDedie() {
        return vetoDedie;
    }
    public void setVetoDedie(Veterinaire<Zebre> vetoDedie) {
        this.vetoDedie = vetoDedie;
    }

    // Methods
    @Override
    public void vivre() {
        System.out.println(this.getNom() + " est un zèbre " + this.getEtatSante());
    }

    @Override
    public String toString() {
        return  "Zèbre {" +
                "vetoDedie=" + vetoDedie.getNom() +
                ", " + super.toString() +
                '}';
    }

    @Override
    public void galoper() throws InterruptedException {
        System.out.println("je galope tel un zebre");
        System.out.println("...3 sec");
        Thread.sleep(3000);
        this.setEtatSante(super.eventSante());
    }
}
