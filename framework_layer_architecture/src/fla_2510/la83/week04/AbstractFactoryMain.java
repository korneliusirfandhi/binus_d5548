package fla_2510.la83.week04;

import fla_2510.la83.week04.factory.AnimalFactory;
import fla_2510.la83.week04.factory.implementation.PetAnimalFactory;
import fla_2510.la83.week04.factory.implementation.WildAnimalFactory;
import fla_2510.la83.week04.interfaces.Dog;
import fla_2510.la83.week04.interfaces.Tiger;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        // Create a factory for pet animals
        AnimalFactory petFactory = new PetAnimalFactory();

        // Create a factory for wild animals
        AnimalFactory wildFactory = new WildAnimalFactory();

        // Create a dog and a tiger using the pet factory
        Dog petDog = petFactory.createDog(); // This will create a PetDog
        Tiger petTiger = petFactory.createTiger(); // This will create a PetTiger

        // Use the dog and tiger
        System.out.println("Pet Dog:");
        petDog.speak();
        petDog.preferredAction();

        System.out.println("\nPet Tiger:");
        petTiger.speak();
        petTiger.preferredAction();

        Dog wildDog = wildFactory.createDog(); // This will create a WildDog
        Tiger wildTiger = wildFactory.createTiger(); // This will create a WildTiger

        System.out.println("\nWild Dog:");
        wildDog.speak();
        wildDog.preferredAction();

        System.out.println("\nWild Tiger:");
        wildTiger.speak();
        wildTiger.preferredAction();

    }
}
