package fla_2510.lb83.week05.factory;

import fla_2510.lb83.week05.concrete.WildDog;
import fla_2510.lb83.week05.concrete.WildTiger;
import fla_2510.lb83.week05.interfaces.Dog;
import fla_2510.lb83.week05.interfaces.Tiger;

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
