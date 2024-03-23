package fla_2320.LA83.session06.builderpattern;

import java.util.LinkedList;

public abstract class Vehicle {
    private LinkedList<String> parts;
    public Vehicle() {
        parts = new LinkedList<>();
    }
    public void add(String part) {
        parts.addLast(part);
    }

    public void showProduct() {
        System.out.println("These are the construction sequences:");
        for (String part : parts) {
            System.out.println(part);
        }
    }

}
