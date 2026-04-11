package fla_2510.la83.week04.factory.implementation;

import fla_2510.la83.week04.concrete.WildDog;
import fla_2510.la83.week04.concrete.WildTiger;
import fla_2510.la83.week04.factory.AnimalFactory;
import fla_2510.la83.week04.interfaces.Dog;
import fla_2510.la83.week04.interfaces.Tiger;

public class WildAnimalFactory implements AnimalFactory {
    @Override
    public Dog createDog() {
        return new WildDog();
    }

    @Override
    public Tiger createTiger() {
        return new WildTiger();
    }
}
