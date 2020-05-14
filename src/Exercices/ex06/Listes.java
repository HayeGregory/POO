package Exercices.ex06;

import Exercices.ex01.Chien;
import Exercices.ex01.Personne;

import java.util.ArrayList;
import java.util.HashMap;

public class Listes {
    static String varA = "XXXX";
    public static void main(String[] args) {

        ArrayList listObject = new ArrayList();

        listObject.add(new Personne("Greg", "14-06-1979"));
        listObject.add(0, new Personne("Julie", "10-10-1989"));

        /* ------------------------- */

        HashMap<String, Personne> map = new HashMap<String, Personne>();
        Personne luc = new Personne("luc", "999999");
        Personne Marie = new Personne("Marie", "8888888");
        map.put(luc.getNom(), luc);
        System.out.println(map.get("luc").getNom());

    }
}
