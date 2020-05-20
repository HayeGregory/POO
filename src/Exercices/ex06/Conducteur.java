package Exercices.ex06;

public class Conducteur<T extends Vehicule>   {
    // Attributes
    private String nom;
    private T vehiculeFavori;

    // Constructors

    public Conducteur(String nom,T vehiculeFavori) {
        this.nom = nom;
        this.vehiculeFavori = vehiculeFavori;

    }

    // Getters - Setters
    public T getVehiculeFavori() {
        return vehiculeFavori;
    }
    public void setVehiculeFavori(T vehiculeFavori) {
        this.vehiculeFavori = vehiculeFavori;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Methods
    public void conduire() {
        System.out.print(getNom());
        this.vehiculeFavori.seDeplacer();
    }
}
