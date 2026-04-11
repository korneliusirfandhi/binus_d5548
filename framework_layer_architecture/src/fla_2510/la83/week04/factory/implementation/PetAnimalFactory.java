package fla_2510.la83.week04.factory.implementation;

import fla_2510.la83.week04.concrete.PetDog;
import fla_2510.la83.week04.concrete.PetTiger;
import fla_2510.la83.week04.factory.AnimalFactory;
import fla_2510.la83.week04.interfaces.Dog;
import fla_2510.la83.week04.interfaces.Tiger;

public class PetAnimalFactory implements AnimalFactory {
    @Override
    public Dog createDog() {
        return new PetDog();
    }

    @Override
    public Tiger createTiger() {
        return new PetTiger();
    }
}
