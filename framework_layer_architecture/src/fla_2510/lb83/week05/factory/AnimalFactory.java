package fla_2510.lb83.week05.factory;

import fla_2510.lb83.week05.interfaces.Dog;
import fla_2510.lb83.week05.interfaces.Tiger;

public interface AnimalFactory {
    Dog createDog();
    Tiger createTiger();
}
