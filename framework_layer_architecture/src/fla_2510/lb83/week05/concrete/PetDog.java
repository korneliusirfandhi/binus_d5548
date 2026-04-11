package fla_2510.lb83.week05.concrete;

import fla_2510.lb83.week05.interfaces.Dog;

public class PetDog implements Dog {
    @Override
    public void speak() {
        System.out.println("Pet Dog: Woof!");
    }

    @Override
    public void preferredAction() {
        System.out.println("Pet Dog: I like to play fetch.");
    }
}
