package Exercices.ex02;

public class Main {
    public static void main(String[] args) {
        Chien idefix = new Chien("Idefix", "macin");
        CarteIdentite greg = new CarteIdentite(
                "Gregory haye",
                "rue de bomel 10/3 5000 Namur",
                "14-06-1979");

        System.out.println(
                "Personne : " + greg.getNom() +
                "\nAdresse" + greg.getAdresse() +
                "\nDate de naissance : " + greg.getDateNaissance() +
                "\nChien : " + greg.getChien().getNom() +
                "\nRace : " + greg.getChien().getRace()


        );

    }
}
