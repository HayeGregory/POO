package Exercices.ex07Recap01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Intervention {
    // Attributes
    private String nomVeto;
    private Animal patientAnimal;
    private LocalDateTime dateIntervention;
    private String description;

    // Constructors
    public Intervention(String nomVeto, Animal patientAnimal, String description) {
        this.nomVeto = nomVeto;
        this.patientAnimal = patientAnimal;
        this.description = description;
        this.dateIntervention = LocalDateTime.now();
    }
    public Intervention(Veterinaire<?> veto, Animal patientAnimal, String description) {
        this(veto.getNom(),patientAnimal,description);
    }

    // Getters - Setters
    public String getNomVeto() {
        return nomVeto;
    }
    public void setNomVeto(String nomVeto) {
        this.nomVeto = nomVeto;
    }
    public Animal getPatientAnimal() {
        return patientAnimal;
    }
    public void setPatientAnimal(Animal patientAnimal) {
        this.patientAnimal = patientAnimal;
    }
    public LocalDateTime getDateIntervention() {
        return dateIntervention;
    }
    public void setDateIntervention(LocalDateTime dateIntervention) {
        this.dateIntervention = dateIntervention;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    // Methods
    // Override

    @Override
    public String toString() {
        DateTimeFormatter patternDate = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
        StringBuilder sb = new StringBuilder();

        sb.append("Nom du Veto intervenant : " ).append(nomVeto).append("\n");
        sb.append("Nom de l'animal patient : ").append(patientAnimal.getNom()).append("\n");
        sb.append("Date de l'intervention : ").append(patternDate.format(getDateIntervention())).append("\n");
        sb.append("Description : ").append(getDescription()).append("\n");
        sb.append("-----------------------------------------------------\n");

        return sb.toString();
    }
}
