package Exercices.exRecap01;

import java.util.ArrayList;

public class Veterinaire <T extends Animal> {
    // Attributes
    private String nom;
    private ArrayList<Intervention> interventions;

    // Constructors
    public Veterinaire(String nom) {
        this.nom = nom;
        this.interventions = new ArrayList<>();
    }
    public Veterinaire() {
        this("nom par defaut");
    }

    // Getters - Setters
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Methods
    public Intervention soigner( T patient) {
        if (patient.getEtatSante() != EtatAnimal.SAIN) {
            System.out.println(nom + " soigne l'animal : " + patient.getNom());
            switch (patient.getEtatSante()) {
                case BLESSE:
                    return new Intervention(getNom(), patient, "Application de pansements");
                case MALADE:
                    return new Intervention(nom, patient, "Ingestion d'une aspirine");
                default:
                    return null;
            }
        }
        System.out.println(" l'animal est deja en bonne sante.");
        return null;
    }
    public void listingInterventions () {
        for (Intervention intervention : interventions) {

        }
    }
    @Override
    public String toString() {
        return "Veterinaire {" +
                "nom='" + nom + '\'' +
                '}';
    }
}
