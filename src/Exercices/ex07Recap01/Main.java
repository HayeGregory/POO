package Exercices.ex07Recap01;

import java.util.ArrayList;

public class Main {

    public static void afficherVetos(ArrayList<Veterinaire<?>> Veterinaires) {
        for (Veterinaire<?> veterinaire : Veterinaires) {
            System.out.println(veterinaire);
        }
    }
    public static void afficherAnimaux(ArrayList<Animal> animaux) {
        for (Animal animal : animaux) {
            System.out.println(animal);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Veterinaire<?>> veterinaires = new ArrayList<>();
        Veterinaire<Zebre> vetoZLuc = new Veterinaire<>("Luc");
        Veterinaire<ChauveSouris> vetoCSGreg = new Veterinaire<>("Greg");
        Veterinaire<ChauveSouris> vetoCSJulie = new Veterinaire<>("Julie");
        Veterinaire<Girafe> vetoGThierry = new Veterinaire<>("Thierry");
        Veterinaire<Perroquet> vetoPBenoit = new Veterinaire<>("Benoit");
        veterinaires.add(vetoZLuc);
        veterinaires.add(vetoCSGreg);
        veterinaires.add(vetoCSJulie);
        veterinaires.add(vetoGThierry);
        veterinaires.add(vetoPBenoit);

        ArrayList<Animal> animaux = new ArrayList<>();
        Zebre zebu = new Zebre("Zebu", 'M', vetoZLuc);
        Girafe girafu = new Girafe("Girafu", 'M', vetoGThierry );
        ChauveSouris batman  = new ChauveSouris("batman", 'F', vetoCSGreg );
        Perroquet perru = new Perroquet("Perru", 'M', vetoPBenoit);
        animaux.add(zebu);
        animaux.add(girafu);
        animaux.add(batman);
        animaux.add(perru);

        batman.vivre();
        vetoCSJulie.soigner(batman);
        vetoCSGreg.soigner(batman);
        batman.vivre();
        vetoCSGreg.soigner(batman);

        vetoCSGreg.deleguerResponsabiliteAnimal(vetoCSJulie, batman);

        batman.vivre();
        vetoCSGreg.soigner(batman);
        vetoCSJulie.soigner(batman);

        afficherVetos(veterinaires);
        afficherAnimaux(animaux);
    }
}
