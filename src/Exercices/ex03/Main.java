package Exercices.ex03;

public class Main {
    public static void main(String[] args) {
        Humain greg = new Humain("Greg", "14-06-1979");

        greg.saluer();
        System.out.println("-----------");
        greg.saluer("mon message");
        System.out.println("-----------");
        greg.saluer(3);
        System.out.println("-----------");
        greg.saluer(3, "xxxxx");
        System.out.println("-----------");
        greg.saluer("yyyyyyyyy", 3);
        System.out.println("-----------");

    }



}
