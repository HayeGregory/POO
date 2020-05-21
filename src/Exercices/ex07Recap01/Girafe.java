package Exercices.ex07Recap01;

public class Girafe extends Animal implements Galopant {

    // Attributes
    private Veterinaire<Girafe> vetoDedie;

    // Getters - Setters
    public Veterinaire<Girafe> getVetoDedie() {
        return vetoDedie;
    }

    public void setVetoDedie(Veterinaire<?> vetoDedie) {
        this.vetoDedie = (Veterinaire<Girafe>) vetoDedie;
    }

    // Contructors
    public Girafe(String nom, char sexe,  Veterinaire<Girafe> vetoDedie) {
        super(nom, sexe);
        this.vetoDedie = vetoDedie;
    }

    // Methods

    // Override
    @Override
    public void vivre() throws InterruptedException {
        while (this.getEtatSante() == EtatSante.SAIN)
            galoper();
        System.out.println(getNom() + " est " + getEtatSante());
    }

    @Override
    public void galoper() throws InterruptedException {
        System.out.println(getNom() + " # Galope tel une girafe - 2sec #");
        Thread.sleep(2000);
        this.setEtatSante(eventSante(PC_MALADIE, PC_BLESSURE));
        switch(getEtatSante()) {
            case MALADE:
                System.out.println(getNom() + " tombe malade");
                break;
            case BLESSE:
                System.out.println(getNom() + " se blesse");
            default: break;
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString()).append("\n");
        sb.append("Nom du véto dedié : ").append(getVetoDedie().getNom());
        sb.append("\n-----------------------------------------\n");

        return sb.toString();
    }
}
