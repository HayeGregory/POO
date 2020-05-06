package Exercices.ex02;

public class CarteIdentite {
    private String nom;
    private String adresse;
    private String dateNaissance;
    private Chien chien;

    // Constructors
    public CarteIdentite(String nom, String adresse, String dateNaissance, Chien chien) {
        setNom(nom);
        setAdresse(adresse);
        setDateNaissance(dateNaissance);
        setChien(chien);
    }

    // Getters -- Setters
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        if (nom.length() >= 6) this.nom = nom;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        if (! adresse.isEmpty()) this.adresse = adresse;
    }
    public String getDateNaissance() {
        return dateNaissance;
    }
    private void setDateNaissance(String dateNaissance) {
        if (!dateNaissance.isEmpty()) this.dateNaissance = dateNaissance;
    }
    public Chien getChien() {
        return chien;
    }
    public void setChien(Chien chien) {
        this.chien = chien;
    }
}
