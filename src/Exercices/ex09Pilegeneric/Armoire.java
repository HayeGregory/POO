package Exercices.ex09Pilegeneric;

import java.util.ArrayList;
import java.util.List;

public class Armoire implements Pile<Assiette> {

    private List<Assiette> vaisselle = new ArrayList<>();

    public Armoire() { }

    private List<Assiette> getVaisselle() {
        return vaisselle;
    }
    private void setVaisselle(List<Assiette> vaisselle) {
        this.vaisselle = vaisselle;
    }

    @Override
    public Assiette peek() {
        return vaisselle.get(this.vaisselle.size() - 1);
    }

    @Override
    public Assiette pop() {
        Assiette assiette = peek();
        this.vaisselle.remove(assiette);
        return assiette;
    }

    @Override
    public void push(Assiette toPush) {
        vaisselle.add(toPush);
    }

    public List<Assiette> prendreAssiettes(int nb) {
        List<Assiette> aRecup = new ArrayList<>();

        if(nb > this.vaisselle.size()) return null;

        for (int i = 0; i < nb; i++) {
            aRecup.add( pop() );
        }

        System.out.println("vous recuperez " + nb + " assiette(s)") ;

        return aRecup;
    }

    public void poserAssiettes(List<Assiette> assiettesAPoser) {
        this.vaisselle.addAll(assiettesAPoser);
    }

    @Override
    public String toString() {
        StringBuilder strngified = new StringBuilder("l'armoire contient " + vaisselle.size() + " assiettes.\n");

        for (Assiette assiette : vaisselle) {
            strngified.append("Assiette de forme : ").append(assiette.getForme()).append(" et diametre : ").append(assiette.getDiametre()).append("\n");
        }

        return strngified.toString();
    }
}
