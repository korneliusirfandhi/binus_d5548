package fla_2510.lb83.week05;

import fla_2510.lb83.week05.factory.AnimalFactory;
import fla_2510.lb83.week05.factory.PetAnimalFactory;
import fla_2510.lb83.week05.factory.WildAnimalFactory;
import fla_2510.lb83.week05.interfaces.Dog;
import fla_2510.lb83.week05.interfaces.Tiger;

public class AbstractFactoryMainExample {
    public static void main(String[] args) {
        AnimalFactory petAnimalFactory = new PetAnimalFactory();
        AnimalFactory wildAnimalFactory = new WildAnimalFactory();

        Dog petDog = petAnimalFactory.createDog();
        Tiger petTiger = petAnimalFactory.createTiger();

        System.out.println("PET ANIMAL FACTORY EXAMPLE\n");
        petDog.speak();
        petDog.preferredAction();
        petTiger.speak();
        petTiger.preferredAction();

        Dog wildDog = wildAnimalFactory.createDog();
        Tiger wildTiger = wildAnimalFactory.createTiger();

        System.out.println("\nWILD ANIMAL FACTORY EXAMPLE\n");
        wildDog.speak();
        wildDog.preferredAction();
        wildTiger.speak();
        wildTiger.preferredAction();

    }
}
