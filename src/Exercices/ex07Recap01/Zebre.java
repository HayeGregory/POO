package Exercices.ex07Recap01;

public class Zebre extends Animal implements Galopant{
    // Attributes
    private Veterinaire<Zebre> vetoDedie;

    // Getters - Setters
    public Veterinaire<Zebre> getVetoDedie() {
        return vetoDedie;
    }

    public void setVetoDedie(Veterinaire<?> vetoDedie) {
        this.vetoDedie = (Veterinaire<Zebre>) vetoDedie;
    }

    // Contructors
    public Zebre(String nom, char sexe,  Veterinaire<Zebre> vetoDedie) {
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
        System.out.println(getNom() + " # Galope tel un zebre - 3 sec # ");
        Thread.sleep(3000);
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
