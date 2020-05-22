package Exercices.ex08Musicien;

public class Run {
    public static void main(String[] args) {
        Musicien<Guitare> guitariste = new Musicien<Guitare>(10000,"Le guitariste");
        Musicien<Flute> flutiste = new Musicien<Flute>(10000,"Le flutiste");
        Musicien<Piano> pianiste = new Musicien<Piano>(10000,"Le pianiste");

        Guitare guitare = new Guitare("xxxx", "yyyy", 1000);

        System.out.println(guitariste);
        guitariste.joueInstrument(guitare);
        guitariste.acheterInstrument(guitare);

        System.out.println(guitariste);

        guitariste.joueInstrument(guitare);

    }
}
