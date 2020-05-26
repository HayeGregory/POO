package Exercices.ex09Pilegeneric;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Armoire <T1, T2> implements Pile<T1, T2> {

    private List<T1> Vaisselle_A = new ArrayList<>(); // verre
    private List<T2> Vaisselle_B = new ArrayList<>(); // assiette



    private Stack<T1> f;
    // getter - setter
    public List<T1> getVaisselle_A() {
        return Vaisselle_A;
    }

    public void setVaisselle_A(List<T1> vaisselle_A) {
        Vaisselle_A = vaisselle_A;
    }

    public List<T2> getVaisselle_B() {
        return Vaisselle_B;
    }

    public void setVaisselle_B(List<T2> vaisselle_B) {
        Vaisselle_B = vaisselle_B;
    }

    // Constructors
    public Armoire(List<T1> vaisselle_A, List<T2> vaisselle_B) {
        Vaisselle_A = vaisselle_A;
        Vaisselle_B = vaisselle_B;
    }

    public Armoire() {

    }




    public List<Assiette> prendreAssiettes(int nb) {
        List<Assiette> aRecup = new ArrayList<>();

        if(nb > this.vaisselle.size()) return null;

        for (int i = 0; i < nb; i++) {
            //aRecup.add( pop() );
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


    @Override
    public peek() {
        return null;
    }

    @Override
    public T1 pop() {
        return null;
    }

    @Override
    public void push(T1 toPush) {

    }
}
