package fla_2510.la83.week04.concrete;

import fla_2510.la83.week04.interfaces.Tiger;

public class PetTiger implements Tiger {
    @Override
    public void speak() {
        System.out.println("Pet tigers can be trained to respond to commands and may have a softer roar compared to their wild counterparts.");
    }

    @Override
    public void preferredAction() {
        System.out.println("Pet tigers may enjoy playing with toys, interacting with their owners, and engaging in enrichment activities to keep them mentally stimulated.");
    }
}
