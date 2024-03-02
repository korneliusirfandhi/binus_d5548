package fla_2320.LA83.session03.factorymethodpattern;

public class Main {

    public static void main(String[] args) {
        AnimalFactory animalFactoryDog = new DogFactory();
        Animal dog = animalFactoryDog.createAnimal();
        dog.speak();
        dog.preferredAction();

        AnimalFactory animalFactoryTiger = new TigerFactory();
        Animal tiger = animalFactoryTiger.createAnimal();
        tiger.speak();
        tiger.preferredAction();
    }
}
