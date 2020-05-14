package Exercices.ex04;

public class Dalmatien extends Chien {

    // Attributes
    private final String NOM_RACE= "Dalmatien";
    private final String DATE_NAISSANCE = "01-01-2010";
    private int nombreDePoints = 0;

    // Constructors
    public Dalmatien(String nom, String dateNaissance, double taille) {
        super(nom, dateNaissance, taille);
        this.setRace(NOM_RACE);
    }

    public Dalmatien(String nom, String dateNaiss, Double taille, int nombreDePoints) {
        super(nom, dateNaiss, taille);
        this.setRace(NOM_RACE);
        setNombreDePoints(nombreDePoints);
    }
    public Dalmatien(String nom, double taille) {
        this(nom, "dateDuJour", taille, 10);
        this.setRace(NOM_RACE);
    }

    //getsetters
    public int getNombreDePoints() {
        return nombreDePoints;
    }
    public void setNombreDePoints(int nombreDePoints) {
        if (nombreDePoints >= 0) {
            this.nombreDePoints = nombreDePoints;
        }
    }


}
