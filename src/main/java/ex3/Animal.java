package ex3;

public class Animal {
    private TypeAnimal types;
    private String noms;
    private Comportement comportements;

    public Animal(TypeAnimal types, String noms, Comportement comportements) {
        this.types = types;
        this.noms = noms;
        this.comportements = comportements;
    }

    @Override
    public String toString() {

        return "types=" + types +
                ", noms='" + noms + '\'' +
                ", comportements=" + comportements;
    }

    public TypeAnimal getTypes() {
        return types;
    }

    public void setTypes(TypeAnimal types) {
        this.types = types;
    }

    public String getNoms() {
        return noms;
    }

    public void setNoms(String noms) {
        this.noms = noms;
    }

    public Comportement getComportements() {
        return comportements;
    }

    public void setComportements(Comportement comportements) {
        this.comportements = comportements;
    }
}