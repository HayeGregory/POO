package Exercices.TestTechniqueAgenceImmo;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Bien> biens = new ArrayList<>();

        Appart appartA = new Appart(100000, 60,"rue xxxxxx 4 9999 yyyyy",
                2500, PEB.A, 2015, 4, true,
                true, 750);

        biens.add(appartA);

        Maison maisonA = new Maison(250000, 150, "rue xxxxxxxxx 5 8888 yyyy",
                5000, PEB.B, 2000, 4, 4,
                true, 200);

        biens.add(maisonA);

        Studio studioA = new Studio(75000, 25,"rue xxxxxx 1 7777 yyyy",
                1000, PEB.D, 2020,true,100);

        biens.add(studioA);

        for (Bien bien : biens) {
            System.out.println(bien);
        }
    }
}
