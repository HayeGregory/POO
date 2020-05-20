package Exercices.exRecap01;

import java.util.ArrayList;

public class Main {
    public static void printAnimaux (ArrayList<Animal> animaux) {
        for (Animal animal : animaux) {
            System.out.println(animal);
            animal.vivre();
            System.out.println("-----------------");
        }
    }

    public static void deplacer(ArrayList<Animal> animaux) throws InterruptedException {
        for (Animal animal : animaux) {
            if(animal.getEtatSante() == EtatAnimal.SAIN) {
                if(animal instanceof Galopant) {
                    ((Galopant) animal).galoper();
                }
                if(animal instanceof Volant) {
                    ((Volant) animal).voler();
                }
            } else {
                switch(animal.getEtatSante()) {
                    case MALADE:
                        System.out.println("Je ne peux me deplacer je suis " + EtatAnimal.MALADE); break;
                    case BLESSE:
                        System.out.println("Je ne peux me deplacer je suis " + EtatAnimal.BLESSE);  break;
                    default:
                        System.out.println("Etat inconnu"); break;
                }
            }

        }
        printAnimaux(animaux);
    }

    public static void main(String[] args) throws InterruptedException {

        Veterinaire<Zebre> vetoZebre = new Veterinaire<>("Zoé Zébru");
        Veterinaire<Girafe> vetoGirafe = new Veterinaire<>("Gerard Gifu");
        Veterinaire<ChauveSouris> vetoChauveSouris = new Veterinaire<>("Batman Tondu");
        Veterinaire<Perroquet> vetoPerroquet = new Veterinaire<>("Lara Peru");

        System.out.println(vetoZebre);
        System.out.println(vetoGirafe);
        System.out.println(vetoChauveSouris);
        System.out.println(vetoPerroquet);

        ArrayList<Animal> animaux = new ArrayList<>();

        Zebre zebre = new Zebre("Pyjama le Zèbre", 'M',vetoZebre);
        Girafe girafe = new Girafe("Flap la Girafe", 'M',vetoGirafe);
        ChauveSouris chauveSouris = new ChauveSouris("Gnap la chauve-souris",'F', vetoChauveSouris);
        Perroquet perroquet = new Perroquet("Repepete le perroquet", 'M', vetoPerroquet);

        animaux.add(zebre);
        animaux.add(girafe);
        animaux.add(chauveSouris);
        animaux.add(perroquet);

        printAnimaux(animaux);
        deplacer(animaux);


    }
}
