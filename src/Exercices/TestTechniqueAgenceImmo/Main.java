package Exercices.TestTechniqueAgenceImmo;

public class Main {
    public static void main(String[] args) {

        Agence monAgence = new Agence("Immo");

        Appart appartA = new Appart(100000, 60,"rue xxxxxx 4 9999 yyyyy",
                2500, PEB.A, 2015, 4, true,
                true, 750);

        Maison maisonA = new Maison(250000, 150, "rue xxxxxxxxx 5 8888 yyyy",
                5000, PEB.B, 2000, 4, 4,
                true, 200);

        Studio studioA = new Studio(75000, 25,"rue xxxxxx 1 7777 yyyy",
                1000, PEB.D, 2020,true,100);

        // ---
        System.out.println("Encodage des biens");
        monAgence.ajouterBien(appartA);
        monAgence.ajouterBien(maisonA);
        monAgence.ajouterBien(studioA);

        monAgence.listingBiens();

        // ---
        System.out.println("--- suppression bien ----- ");
        monAgence.supprimerBien(maisonA);
        monAgence.listingBiens();


    }
}
