package fla_2510.la83.week04.concrete;

import fla_2510.la83.week04.interfaces.Dog;

public class WildDog implements Dog {
    @Override
    public void preferredAction() {
        System.out.println("Wild dogs prefer to hunt in packs.");
    }

    @Override
    public void speak() {
        System.out.println("Wild dogs communicate with a variety of vocalizations, including howls, barks, and whines.");
    }
}
