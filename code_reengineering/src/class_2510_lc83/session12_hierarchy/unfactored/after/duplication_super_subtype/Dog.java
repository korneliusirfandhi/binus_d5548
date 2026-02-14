package class_2510_lc83.session12_hierarchy.unfactored.after.duplication_super_subtype;

public class Dog extends Animal {
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }

}
