package Exercices.RecapMediaPart3;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque <T extends Media> {
    // Attributes
    private TypeMedia typeMedia;
    private List<T> medias = new ArrayList<>();

    // Getters - Setters
    public TypeMedia getTypeMedia() {
        return typeMedia;
    }
    private void setTypeMedia(TypeMedia typeMedia) {
        this.typeMedia = typeMedia;
    }
    // -
    private List<T> getMedia() {
        return medias;
    }
    private void setMedia(List<T> media) {
        this.medias = media;
    }

    // Contructors
    public Bibliotheque(TypeMedia typeMedia) {
        this.typeMedia = typeMedia;
    }

    // Methods
    public boolean ajouter(T media) {
        return medias.add(media);
    }
    public boolean retirer (T media) {
        if (medias.contains(media)) {
            return medias.remove(media);
        }
        return false;
    }
    public T recuperer(T media) {
        if (medias.contains(media)) {
            return medias.get(medias.indexOf(media));
        }
        return null;
    }
    public T recuperer(String titre) {
        for (T media : medias) {
            if (media.getTitre().equals(titre)) return media;
        }
        return null;
    }
    public List<T> recuperer() {
        return this.getMedia();
    }


    // Override

}
