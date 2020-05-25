package Exercices.ex09Pilegeneric;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        Armoire armoire = new Armoire();

        List<Assiette> assiettes = new ArrayList<>();
        for (int i = 5 ; i > 0; i--) {
            assiettes.add(new Assiette("disques", i+10));
        }
        armoire.poserAssiettes(assiettes);

        System.out.println( armoire);

        List<Assiette> retirer = armoire.prendreAssiettes(4);
        System.out.println(armoire);

        retirer = armoire.prendreAssiettes(2);

        System.out.println(armoire);

    }
}
