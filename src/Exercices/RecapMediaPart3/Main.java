package Exercices.RecapMediaPart3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        LivreAudio livreAudio = new LivreAudio("Livre audio A", "Auteur audio A", 100,
                                            10, "Resume audio A", "Narrateur audio A");

        Utilisateur greg = new Utilisateur("Greg",200);

        Bibliotheque<Album> bibliotheque = new Bibliotheque<>();

//        greg.acheter(livreAudio);
//        greg.acheter(livreAudio);
//        greg.acheter(livreAudio); // achat impossible
//        System.out.println(greg); // solde 0
//
//        greg.vendre(livreAudio); // vene 50%
//        System.out.println(greg); // solde 50
//
//        greg.listingMedias(); // 1 medias pour greg

        // --

//        Utilisateur<LivreAudio> julie = new Utilisateur<>("Julie", 1000);
//        julie.acheter(new LivreAudio("livreAudioX", "nom livreAudiox", 100,
//                10, "Resume audio x", "Narrateur audio x"));
//        julie.acheter(new Album("Album A", "Auteur album A",250,
//                new ArrayList<String>(){{ add("Titre 1"); add("Titre 2"); add("Titre 3"); }} ));
//        julie.acheter(new LivrePapier("Livre papier","Auteur livre papier", 75, 12,
//                "resume livre papier", 333));
//        julie.acheter(new BandeDessinee("BD","auteur BD", 50, "Dessinateur BD"));
//
//        julie.acheter(new LivreAudio("livre trop cher", "nom livreAudiox", 100000,
//                10, "Resume audio x", "Narrateur audio x"));
//
//        System.out.println(julie);
//        julie.listingMedias();
//
//        julie.vendre(julie.recuperer("xxx"), greg );
//        julie.vendre(julie.recuperer("livreAudioXx"), greg );
//
//
//        System.out.println(julie);
//        System.out.println(greg);
//        greg.listingMedias();
//
//        Audible elem = (Audible) greg.recuperer("livreAudioX");
//
//        if (elem == null) {
//            System.out.println("fffffffffffffff");
//        }
//        greg.ecouter(elem);

    }
}
