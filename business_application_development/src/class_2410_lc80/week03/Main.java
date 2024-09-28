package class_2410_lc80.week03;

import class_2410_lc80.week03.entity.FoldingBike;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {

        // cara 1. construct object subclass
        MountainBike mountainBike = new MountainBike(7, 3, 10);
        System.out.println("Gear = " + mountainBike.getGear());
        mountainBike.protectedInfo();
        mountainBike.noAccessModifier();

        FoldingBike foldingBike = new FoldingBike(3, 5);
        foldingBike.protectedInfo();
//        foldingBike.noAccessModifier();
//      error karena ga bisa access method dengan no access modifier
//        hanya bisa diakses oleh class yg sama atau class lain di package yg sama

        // cara 2. construct object subclass tapi kita menggunakan declaration dari superclass (parent class)
        Bicycle mountain = new MountainBike(3,9,20);
        System.out.println(mountain.getSpeed());
        mountain.move();

        System.out.println(sum(1, 2, 3)); // call overloading method 1
        System.out.printf("%.3f\n", sum(1.1, 2.1, 3.1)); // call overloading method 3
        System.out.println(sum(2, 1)); // call overloading method 2
    }

    // overloading method 1
    public int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // overloading method 2
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    // overloading method 3
    public double sum(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }


}
