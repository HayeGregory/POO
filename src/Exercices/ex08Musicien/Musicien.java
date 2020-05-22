package Exercices.ex08Musicien;

import java.util.ArrayList;
import java.util.List;

public class Musicien <T> {
    // Attributes
    private float solde;
    private List<T> instruments;
    private String nom;

    // Getters - Setters
    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public List<T> getInstruments() {
        return instruments;
    }

    public void setInstruments(List<T> instruments) {
        this.instruments = instruments;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Contructors

    public Musicien(float solde, List<T> instruments, String nom) {
        this.solde = solde;
        this.instruments = instruments;
        this.nom = nom;
    }

    public Musicien(float solde, String nom) {
        this(solde, new ArrayList<>(), nom);
    }
    // Methods
    public void acheterInstrument (Instrument instrument) {
        if(getSolde() - instrument.getPrix() >= 0 ) {
            setSolde(getSolde() - instrument.getPrix());
            this.instruments.add((T) instrument);
        } else {
            System.out.println("solde insuffisant ");
        }

    }

    public void joueInstrument(Instrument instrument) {
        if (instruments.contains(instrument)) {
            instrument.faireDuBruit();
        } else {
            System.out.println("impossible de jouer la guitare");
        }
    }
    // Override

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Nom Musicien : ").append(nom).append("\n");
        sb.append("Solde : ").append(solde).append("\n");
        sb.append("Liste d'instruments : ").append("\n");
        if (instruments.size()==0) sb.append("néant\n");
        for (T instrument : instruments) {
            sb.append(instrument).append("\n");
            sb.append("----------------------------\n");
        }
        return sb.toString();
    }
}
