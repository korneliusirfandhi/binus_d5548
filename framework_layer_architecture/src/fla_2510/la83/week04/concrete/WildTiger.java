package fla_2510.la83.week04.concrete;

import fla_2510.la83.week04.interfaces.Tiger;

public class WildTiger implements Tiger {
    @Override
    public void speak() {
        System.out.println("Wild tigers are known for their powerful roar, which can be heard up to 3 kilometers away.");
    }

    @Override
    public void preferredAction() {
        System.out.println("Wild tigers prefer to hunt alone, relying on their stealth and strength to catch prey.");
    }
}
