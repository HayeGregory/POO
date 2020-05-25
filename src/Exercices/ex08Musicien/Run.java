package Exercices.ex08Musicien;

public class Run {
    public static void main(String[] args) {
        Musicien<Guitare> guitariste = new Musicien<>(10000, "Le guitariste");
        Musicien<Flute> flutiste = new Musicien<>(10000, "Le flutiste");
        Musicien<Piano> pianiste = new Musicien<>(10000, "Le pianiste");

        Flute flute = new Flute("xxxxxxxxx", "zzzzzzzz", 500);
        Guitare guitare1 = new Guitare("xxxx", "yyyy", 1000);
        Guitare guitare2 = new Guitare("xxxx", "yyyy", 1000);

        System.out.println(guitariste);
        guitariste.joueInstrument(guitare1);
        guitariste.acheterInstrument(guitare1);
        guitariste.acheterInstrument(guitare2);

        System.out.println(guitariste);

        for (Guitare instrument : guitariste.getInstruments()) {
            guitariste.joueInstrument(instrument);
        }


    }
}
