package Exercices.exRecap01;

public class ChauveSouris extends Animal implements Volant {
    // Attributes
    private Veterinaire<ChauveSouris> vetoDedie;

    // Constructors
    public ChauveSouris(String nom, char sexe, Veterinaire<ChauveSouris> vetoDedie) {
        super(nom, sexe);
        this.vetoDedie = vetoDedie;
    }
    public ChauveSouris(){
        this("Chauve-souris par defaut", '-', new Veterinaire<ChauveSouris>());
    };

    // Getters - Setters
    public Veterinaire<ChauveSouris> getVetoDedie() {
        return vetoDedie;
    }
    public void setVetoDedie(Veterinaire<ChauveSouris> vetoDedie) {
        this.vetoDedie = vetoDedie;
    }

    // Methods
    @Override
    public void vivre() {
        System.out.println(this.getNom() + " est une chauve-souris " + this.getEtatSante());
    }

    @Override
    public String toString() {
        return  "Chauve-souris {" +
                "vetoDedie=" + vetoDedie.getNom() +
                ", " + super.toString() +
                '}';
    }

    @Override
    public void voler() throws InterruptedException {
        System.out.println("Je vole telle une chauve-souris");
        System.out.println("... 3 sec");
        Thread.sleep(2000);
        this.setEtatSante(super.eventSante());
    }
}
