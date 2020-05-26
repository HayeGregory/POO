package Exercices.TestTechniqueAgenceImmo;

import java.util.ArrayList;
import java.util.List;

public class Agence {

    // Attributes
    private String nom;
    private List<Bien> biens;

    // Getters - Setters
    private String getNom() {
        return nom;
    }

    private void setNom(String nom) {
        this.nom = nom;
    }

    private List<Bien> getBiens() {
        return biens;
    }

    private void setBiens(List<Bien> biens) {
        this.biens = biens;
    }

    // Contructors
    public Agence(String nom) {
        setNom( nom );
        setBiens( new ArrayList<>() );
    }

    public void finalize()
    {
        System.out.println("Objet nettoyé de la mémoire");
    }

    // Methods
    public void listingBiens () {
        StringBuilder sb = new StringBuilder();
        int n = 0;
        sb.append("Nom agence : ").append(getNom()).append("\n");

        if (getBiens().size() == 0) System.out.println("Aucun biens");
        for (Bien bien : getBiens()) {
            sb.append("Biens n° : ").append(++n).append("\n");
            sb.append(bien);
            sb.append("-----------------------------------------\n");
        }

        System.out.println(sb);
    }
    public boolean ajouterBien ( Bien bien ) {
        if (!getBiens().contains(bien)) {
            return getBiens().add(bien);
        }
        System.out.println("erreur lors de l'ajout");
        return false;
    }
    public boolean supprimerBien ( Bien bien ) {
        if (getBiens().contains(bien)) {
            return getBiens().remove(bien);
        }
        System.out.println("Erreur a la suppression ");
        return false;
    }

    // Override

}
