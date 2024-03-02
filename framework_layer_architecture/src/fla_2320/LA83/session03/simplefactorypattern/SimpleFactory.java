package fla_2320.LA83.session03.simplefactorypattern;

import java.util.Scanner;

public class SimpleFactory {

    public Animal createAnimal() {
        System.out.println("1. Dog");
        System.out.println("2. Tiger");

        Scanner in = new Scanner(System.in);
        int input = 0;
        System.out.print("Choose Animal [1..2] : ");
        input = in.nextInt();

        Animal animal = null;
        if (input == 1) {
            animal = new Dog();
        } else if (input == 2) {
            animal = new Tiger();
        } else {
            System.out.println("INVALID!");
            throw new IllegalArgumentException("Invalid animal...");
        }
        return animal;
    }
}
