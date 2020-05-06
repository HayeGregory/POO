package Exercices.ex02;

public class CarteIdentite {
    private String nom;
    private String adresse;
    private final String dateNaissance;
    private Chien chien;

    // Constructors
    public CarteIdentite(String nom, String adresse, String dateNaissance) {
        setNom(nom);
        setAdresse(adresse);

        if (dateNaissance.isEmpty())
            this.dateNaissance = "default date";
        else
            this.dateNaissance = dateNaissance;
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
    public Chien getChien() {
        return chien;
    }
    public void setChien(Chien chien) {
        //if (chien.getNom().length() < 8 && !chien.getRace().equals("shiba"))
            this.chien = chien;
    }
}
