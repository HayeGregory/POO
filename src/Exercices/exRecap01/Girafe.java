package Exercices.exRecap01;

public class Girafe extends Animal implements Galopant {
    // Attributes
    private Veterinaire<Girafe> vetoDedie;

    // Constructors
    public Girafe(String nom, char sexe, Veterinaire<Girafe> vetoDedie) {
        super(nom, sexe);
        this.vetoDedie = vetoDedie;
    }
    public Girafe(){
        this("Girafe par defaut", '-', new Veterinaire<Girafe>());
    };

    // Getters - Setters
    public Veterinaire<Girafe> getVetoDedie() {
        return vetoDedie;
    }
    public void setVetoDedie(Veterinaire<Girafe> vetoDedie) {
        this.vetoDedie = vetoDedie;
    }

    // Methods
    @Override
    public void vivre() {
        System.out.println(this.getNom() + " est une girafe " + this.getEtatSante());
    }

    @Override
    public String toString() {
        return  "Girafe {" +
                "vetoDedie=" + vetoDedie.getNom() +
                ", " + super.toString() +
                '}';
    }

    @Override
    public void galoper() throws InterruptedException {
        System.out.println("Je galope telle une girafe");
        System.out.println("... 2 sec");
        Thread.sleep(2000);
        this.setEtatSante(super.eventSante());
    }
}
