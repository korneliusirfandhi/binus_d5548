package class_2510_lc83.session12_hierarchy.unfactored.before.duplication_super_subtype;

public class Dog extends Animal {
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public void eat() {
        System.out.println("Dog is eating");
    }

    public void sound() {
        System.out.println("Dog barks");
    }

    public void run() {
        System.out.println("Dog is running");
    }

    public void breathe() {
        System.out.println("Animal is breathing");
    }

}
