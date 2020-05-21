package Exercices.ex07Recap01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public abstract class Animal {
    final Random rand = new Random();
    // Attributes
    private String nom;
    private char sexe;
    private LocalDateTime dateNaissance;
    private EtatSante etatSante;

    // Constructors
    public Animal(String nom, char sexe, LocalDateTime dateNaissance, EtatSante etatSante) {
        this.nom = nom;
        this.sexe = sexe;
        this.dateNaissance = dateNaissance;
        this.etatSante = etatSante;
    }
    public Animal(String nom, char sexe) {
        this(nom, sexe, LocalDateTime.now(), EtatSante.SAIN);
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
    public EtatSante getEtatSante() {
        return etatSante;
    }
    public void setEtatSante(EtatSante etatSante) {
        this.etatSante = etatSante;
    }

    // Methods
    public abstract void vivre() throws InterruptedException;
    // faire check par Alexandre
    protected EtatSante eventSante(int pcMaladie, int pcBlessure) {
        int pc = rand.nextInt(100);

        if (pc < pcMaladie)
            return EtatSante.MALADE;
        else if (pc < pcMaladie + pcBlessure)
            return EtatSante.BLESSE;

        return EtatSante.SAIN;
    }
    protected abstract Veterinaire<?> getVetoDedie();
    protected abstract void setVetoDedie(Veterinaire<?> vetoDedie);
    // override

    @Override
    public String toString() {
        DateTimeFormatter patternDate = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
        StringBuilder sb = new StringBuilder();

        sb.append("Nom de l'animal : " ).append(nom).append("\n");
        sb.append("Sexe : ").append(getSexe() == 'M' ? "Masculin" : "Féminin").append("\n");
        sb.append("Date de naissance : ").append(patternDate.format(getDateNaissance())).append("\n");
        sb.append("Santé : ").append(getEtatSante()).append("\n");

        return sb.toString();
    }

}
