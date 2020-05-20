package Exercices.exRecap01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Intervention {
    // Attributes
    private String nomVeto;
    private Animal animalPatient;
    private LocalDateTime DATE_INTERVENTION;
    private String description;

    // Constructors
    public Intervention(String nomVeto, Animal animalPatient, String description) {
        this.nomVeto = nomVeto;
        this.animalPatient = animalPatient;
        this.description = description;
        this.DATE_INTERVENTION = LocalDateTime.now();
    }

    // Getters - Setters
    public String getNomVeto() {
        return nomVeto;
    }
    public void setNomVeto(String nomVeto) {
        this.nomVeto = nomVeto;
    }
    public Animal getAnimalPatient() {
        return animalPatient;
    }
    public void setAnimalPatient(Animal animalPatient) {
        this.animalPatient = animalPatient;
    }
    public LocalDateTime getDateIntervention() {
        return DATE_INTERVENTION;
    }
    public void setDateIntervention(LocalDateTime dateIntervention) {
        this.DATE_INTERVENTION = dateIntervention;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    // Methods

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("eeee");
        return "Intervention{" +
                "nomVeto='" + nomVeto + '\'' +
                ", animalPatient=" + animalPatient +
                ", dateIntervention=" + DATE_INTERVENTION +
                ", description='" + description + '\'' +
                '}';
    }
}
