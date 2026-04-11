package fla_2510.lb83.week05.concrete;

import fla_2510.lb83.week05.interfaces.Tiger;

public class PetTiger implements Tiger {
    @Override
    public void speak() {
        System.out.println("Pet Tiger: Meow!");
    }

    @Override
    public void preferredAction() {
        System.out.println("Pet Tiger: I like to play with toys.");
    }
}
