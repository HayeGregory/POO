package Exercices.RecapMediaPart3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        LivreAudio livreAudio = new LivreAudio("Livre audio A", "Auteur audio A", 100,
                                            10, "Resume audio A", "Narrateur audio A");

        Utilisateur<Media> greg = new Utilisateur<>("Greg",200);

        greg.acheter(livreAudio);
        greg.acheter(livreAudio);

        System.out.println(greg);   // solde de greg 0
        greg.listingMedias();       // 2 media audio

        greg.acheter(livreAudio);   // achat impossible
        System.out.println(greg);   // solde 0 - 2 media

        greg.vendre(livreAudio);    // vendre 50%
        System.out.println(greg);   // solde 50 - 1 media
        greg.listingMedias();       // 1 medias pour greg

        // --

        Utilisateur<Media> julie = new Utilisateur<>("Julie", 1000);
        System.out.println(julie);  // julie solde 1000 - 0 media

        julie.acheter(new LivreAudio("livreAudioX", "nom livreAudiox", 100,
                10, "Resume audio x", "Narrateur audio x"));
        julie.acheter(new Album("Album A", "Auteur album A",250,
                new ArrayList<String>(){{ add("Titre 1"); add("Titre 2"); add("Titre 3"); }} ));
        julie.acheter(new LivrePapier("Livre papier","Auteur livre papier", 75, 12,
                "resume livre papier", 333));
        julie.acheter(new BandeDessinee("BD","auteur BD", 50, "Dessinateur BD"));
        System.out.println(julie);  // julie solde 525 - 4 media


        // Achat d'un media trop cher
        julie.acheter(new LivreAudio("livre trop cher", "nom livreAudiox", 100000,
                10, "Resume audio x", "Narrateur audio x"));

        System.out.println(julie);          // solde - 4 media un de chaque
        julie.listingMedias();

        greg.vendre(livreAudio, julie);
        System.out.println(greg); greg.listingMedias();     // Greg : solde 150 - 0 media
        System.out.println(julie); julie.listingMedias();   // Julie : solde 425 - 5 media

        julie.vendre(julie.recuperer("livreAudioX"), greg ); // vente  d'un audio a greg
        System.out.println(greg); greg.listingMedias();             // Greg : solde 50 - 1 media
        System.out.println(julie); julie.listingMedias();           // Julie : solde 525 - 4 media

        julie.vendre(julie.recuperer("xxx"), greg );        // media inexistant


        Lisible elem = (Lisible) julie.recuperer("Livre papier"); // recuperer un lisible de chez julie

        if (elem == null) {
            System.out.println("fffffffffffffff");
        }
        greg.lire(elem);                                        // et greg le lit

    }
}
