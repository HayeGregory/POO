package Exercices.ex04;

public class Main {
    public static void main(String[] args) {
        Chien dalma = new Dalmatien("black","1/05/2020", 99d, 45);
        Chien chiwawa = new Chihuahua("kiwi","1/05/2020", 25d, 500);

        chiwawa.aboyer();
        ((Chien)chiwawa).aboyer();


    }
}
