package Exercices.ex07Recap01;

public class Perroquet extends Animal implements Volant{
    // Attributes
    private Veterinaire<Perroquet> vetoDedie;

    // Getters - Setters
    public Veterinaire<Perroquet> getVetoDedie() {
        return vetoDedie;
    }

    public void setVetoDedie(Veterinaire<?> vetoDedie) {
        this.vetoDedie = (Veterinaire<Perroquet>) vetoDedie;
    }

    // Contructors
    public Perroquet(String nom, char sexe,  Veterinaire<Perroquet> vetoDedie) {
        super(nom, sexe);
        this.vetoDedie = vetoDedie;
    }

    // Methods

    // Override
    @Override
    public void vivre() throws InterruptedException {
        while (this.getEtatSante() == EtatSante.SAIN)
            voler();
        System.out.println(getNom() + " est " + getEtatSante());
    }

    @Override
    public void voler() throws InterruptedException {
        System.out.println(getNom() + " # vole tel un perroquet - 5sec #");
        Thread.sleep(5000);
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
