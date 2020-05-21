package Exercices.ex07Recap01;

import java.util.ArrayList;

public class Veterinaire <T extends Animal > {
    // Attributes
    private String nom;
    private ArrayList<Intervention> interventions;
    private ArrayList<T> animauxResponsable;

    // Constructors
    public Veterinaire(String nom) {
        this.nom = nom;
        this.interventions = new ArrayList<>();
        this.animauxResponsable = new ArrayList<>();
    }
    // Getters - Setters
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public ArrayList<Intervention> getInterventtions() {
        return interventions;
    }
    public void setInterventtions(ArrayList<Intervention> interventtions) {
        this.interventions = interventtions;
    }

    public ArrayList<Intervention> getInterventions() {
        return interventions;
    }

    public void setInterventions(ArrayList<Intervention> interventions) {
        this.interventions = interventions;
    }

    public ArrayList<T> getAnimauxResponsable() {
        return animauxResponsable;
    }

    public void setAnimauxResponsable(ArrayList<T> animauxResponsable) {
        this.animauxResponsable = animauxResponsable;
    }

    // Methods
    public void deleguerResponsabiliteAnimal(Veterinaire<T> nouveauVetodedie, T animal) {
        if (animauxResponsable.contains(animal)) {
            this.animauxResponsable.remove(animal);
        }
        nouveauVetodedie.animauxResponsable.add(animal);
        animal.setVetoDedie(nouveauVetodedie);
    }

    public Intervention soigner (T patient) {
        Intervention intervention = null;

        if (patient.getEtatSante() != EtatSante.SAIN) {
            if ( this.animauxResponsable.contains(patient)){
                switch(patient.getEtatSante()) {
                    case MALADE: intervention = new Intervention(
                            this, patient,
                            "Etat : " + patient.getEtatSante() + " => Ingestion d'aspro500"); break;
                    case BLESSE: intervention = new Intervention(
                            this, patient,
                            "Etat : " + patient.getEtatSante() + " => Cautérisation de la blessure"); break;
                    default: System.out.println("Impossible à soigner : etat inconnu");
                }
                interventions.add(intervention);
                patient.setEtatSante(EtatSante.SAIN);
                System.out.println(patient.getNom() + " a été soigné par " + this.getNom());
            } else {
                System.out.println(nom + " ne peut s'occuper de " + patient.getNom() + ".  Son veto dédié est : " + ((T) patient).getVetoDedie().getNom());
            }
        } else {
            System.out.println("Visite de routine - RAS");
        }
        return intervention;
    }
    public void listingInterventions () {
        System.out.println("Interventions : ");
        for (Intervention intervention : interventions) {
            System.out.println(intervention);
        }
        System.out.println("======================================");
    }

    // Override
   @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Nom du Veto : " ).append(getNom()).append("\n");
        sb.append("Liste des interventions :").append("\n");
        sb.append("-----------------------------------------------------\n");
        if (interventions.size() == 0) sb.append("néant");
        for (Intervention intervention : interventions) {
            sb.append(intervention);
        }
        sb.append("\n======================================================\n");
        return sb.toString();
    }
}
