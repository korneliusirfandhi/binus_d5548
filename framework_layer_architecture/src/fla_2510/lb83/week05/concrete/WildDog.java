package fla_2510.lb83.week05.concrete;

import fla_2510.lb83.week05.interfaces.Dog;

public class WildDog implements Dog {
    @Override
    public void speak() {
        System.out.println("Wild Dog: Woof!");
    }

    @Override
    public void preferredAction() {
        System.out.println("Wild Dog: I like to roam in the wild.");

    }
}
