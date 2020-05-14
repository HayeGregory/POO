package Exercices.ex06;

public enum RaceChienEnumObject {
    LABRADOR (100) ,
    DALMATIEN (150) ,
    CHIHUAHUA (80);

    private float tailleMoyenne;

    private RaceChienEnumObject(float tailleMoyenne) {
        this.tailleMoyenne = tailleMoyenne;
    }

    public float getTailleMoyenne() {
        return tailleMoyenne;
    }

    private void setTailleMoyenne(float tailleMoyenne) {
        this.tailleMoyenne = tailleMoyenne;
    }
}
