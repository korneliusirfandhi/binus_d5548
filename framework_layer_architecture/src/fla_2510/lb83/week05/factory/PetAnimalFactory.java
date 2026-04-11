package fla_2510.lb83.week05.factory;

import fla_2510.lb83.week05.concrete.PetDog;
import fla_2510.lb83.week05.concrete.PetTiger;
import fla_2510.lb83.week05.interfaces.Dog;
import fla_2510.lb83.week05.interfaces.Tiger;

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
