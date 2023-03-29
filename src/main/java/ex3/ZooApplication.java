package ex3;

public class ZooApplication {

    public static void main(String[] args) {
        Zoo zoo = new Zoo("Thoiry");

        zoo.addAnimal("Gazelle", TypeAnimal.MAMIFERE, Comportement.HERBIVORE);
        zoo.addAnimal("Zèbre", TypeAnimal.MAMIFERE, Comportement.HERBIVORE);
        zoo.addAnimal("Lion", TypeAnimal.MAMIFERE, Comportement.HERBIVORE);
        zoo.addAnimal("Panthère", TypeAnimal.MAMIFERE, Comportement.CARNIVORE);
        zoo.addAnimal("Requin blanc", TypeAnimal.POISSON, Comportement.HERBIVORE);
        zoo.addAnimal("Truite dorée", TypeAnimal.POISSON, Comportement.HERBIVORE);
        zoo.addAnimal("Boa constrictor", TypeAnimal.SERPENT, Comportement.CARNIVORE);
        zoo.addAnimal("Python", TypeAnimal.SERPENT, Comportement.CARNIVORE);
    }

}