package Exercices.exRecap01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public abstract class Animal {
    // Attributes
    private String nom;
    private char sexe;
    private LocalDateTime dateNaissance;
    private EtatAnimal etatSante;

    // Constructors

    public Animal(String nom, char sexe, LocalDateTime dateNaissance, EtatAnimal etatSante) {
        this.nom = nom;
        this.sexe = sexe;
        this.dateNaissance = dateNaissance;
        this.etatSante = etatSante;
    }

    public Animal(String nom, char sexe, EtatAnimal etatSante) {
        this.nom = nom;
        this.sexe = sexe;
        this.dateNaissance =  LocalDateTime.now();
    }

    // full : moment present et en bonte sante d'office
    public Animal(String nom, char sexe) {
        this.nom = nom;
        this.sexe = sexe;
        this.dateNaissance = LocalDateTime.now();
        this.etatSante = EtatAnimal.SAIN;
    }
    // par defaut
    public Animal () {
        this("Animal X", '-' );
    }

    // Getters - Setters
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public char getSexe() {
        return sexe;
    }
    public void setSexe(char sexe) {
        this.sexe = sexe;
    }
    public LocalDateTime getDateNaissance() {
        return dateNaissance;
    }
    public void setDateNaissance(LocalDateTime dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    public EtatAnimal getEtatSante() {
        return etatSante;
    }
    public void setEtatSante(EtatAnimal etatSante) {
        this.etatSante = etatSante;
    }

    // Methods
    public abstract void vivre();
    public EtatAnimal eventSante() {
        int rand = new Random().nextInt(100);
        if (rand < 10 ) return EtatAnimal.BLESSE;
        if (rand < 30 ) return EtatAnimal.MALADE;
        return EtatAnimal.SAIN;
     }
    @Override
    public String toString() {
        DateTimeFormatter patternDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return "Animal {" +
                "nom='" + nom + '\'' +
                ", sexe=" + sexe +
                ", dateNaissance=" + dateNaissance.format(patternDate) +
                ", etatSante=" + etatSante +
                '}';
    }

}
