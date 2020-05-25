package Exercices.ex07Recap01;

public class ChauveSouris extends Animal implements Volant{
    // Attributes
    private Veterinaire<ChauveSouris> vetoDedie;

    // Getters - Setters
    @Override
    public Veterinaire<ChauveSouris> getVetoDedie() {
        return vetoDedie;
    }
    @Override
    public void setVetoDedie(Veterinaire<?> vetoDedie) {
        this.vetoDedie = (Veterinaire<ChauveSouris>) vetoDedie;
    }

    // Contructors
    public ChauveSouris(String nom, char sexe,  Veterinaire<ChauveSouris> vetoDedie) {
        super(nom, sexe);
        this.vetoDedie = vetoDedie;
        vetoDedie.getAnimauxResponsable().add(this);
    }

    // Methods

    // Override
    @Override
    public void vivre() throws InterruptedException {
        while (this.getEtatSante() == EtatSante.SAIN)
            voler();
    }

    @Override
    public void voler() throws InterruptedException {
        System.out.println(getNom() + " # vole tel une chauve-souris - 4sec #");
        Thread.sleep(1000);
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
