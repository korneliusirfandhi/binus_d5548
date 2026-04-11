package fla_2510.lb83.week05.concrete;

import fla_2510.lb83.week05.interfaces.Tiger;

public class WildTiger implements Tiger {
    @Override
    public void speak() {
        System.out.println("Wild Tiger: Roar!");
    }

    @Override
    public void preferredAction() {
        System.out.println("Wild Tiger: I like to hunt in the jungle.");
    }
}
