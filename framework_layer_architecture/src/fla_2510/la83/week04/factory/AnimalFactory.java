package fla_2510.la83.week04.factory;

import fla_2510.la83.week04.interfaces.Dog;
import fla_2510.la83.week04.interfaces.Tiger;

public interface AnimalFactory {
    Dog createDog();
    Tiger createTiger();
}
