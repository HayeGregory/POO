package Exercices.exRecap01;

public class Perroquet extends  Animal implements Volant{
    // Attributes
    private Veterinaire<Perroquet> vetoDedie;

    // Constructors
    public Perroquet(String nom, char sexe, Veterinaire<Perroquet> vetoDedie) {
        super(nom, sexe);
        this.vetoDedie = vetoDedie;
    }
    public Perroquet(){
        this("Perroquet par defaut", '-', new Veterinaire<Perroquet>());
    };

    // Getters - Setters
    public Veterinaire<Perroquet> getVetoDedie() {
        return vetoDedie;
    }
    public void setVetoDedie(Veterinaire<Perroquet> vetoDedie) {
        this.vetoDedie = vetoDedie;
    }

    // Methods
    @Override
    public void vivre() {
        System.out.println(this.getNom() + " est un perroquet " + this.getEtatSante());
    }

    @Override
    public String toString() {
        return  "Perroquet {" +
                "vetoDedie=" + vetoDedie.getNom() +
                ", " + super.toString() +
                '}';
    }

    @Override
    public void voler() throws InterruptedException {
        System.out.println("Je vole tel un perroquet");
        System.out.println("... 2 sec");
        Thread.sleep(2000);
        this.setEtatSante(super.eventSante());
    }
}
