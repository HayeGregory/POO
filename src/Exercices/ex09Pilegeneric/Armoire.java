package Exercices.ex09Pilegeneric;

import java.util.ArrayList;
import java.util.List;

public class Armoire implements Pile {
    // Attributes
    private List<Verre> verres;
    private List<Assiette> assiettes;

    // Getters - Setters
    private List<Verre> getVerres() {
        return verres;
    }
    private void setVerres(List<Verre> verres) {
        this.verres = verres;
    }
    private List<Assiette> getAssiettes() {
        return assiettes;
    }
    private void setAssiettes(List<Assiette> assiettes) {
        this.assiettes = assiettes;
    }

    // Contructors
    public Armoire(List<Verre> verres, List<Assiette> assiettes) {
        this.verres = verres;
        this.assiettes = assiettes;
    }
    public Armoire() {
        this.verres = new ArrayList<>();
        this.assiettes = new ArrayList<>();
    }

    List<Verre> prendreVerres(int n) {
        return null;
    }


    @Override
    public void push(Object elem) {

    }

    @Override
    public Object pop() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }


    // Methods

}
