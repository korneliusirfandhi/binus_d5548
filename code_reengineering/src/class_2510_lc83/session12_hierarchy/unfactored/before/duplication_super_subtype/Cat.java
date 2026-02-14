package class_2510_lc83.session12_hierarchy.unfactored.before.duplication_super_subtype;

public class Cat extends Animal {
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    public void eat() {
        System.out.println("Cat is eating");
    }

    public void sound() {
        System.out.println("Cat meows");
    }

    public void run() {
        System.out.println("Cat is running");
    }

    public void breathe() {
        System.out.println("Animal is breathing");
    }

}
