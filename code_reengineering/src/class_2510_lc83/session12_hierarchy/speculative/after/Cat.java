package class_2510_lc83.session12_hierarchy.speculative.after;

public class Cat extends Animal {
    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    @Override
    public void run() {
        System.out.println("Cat is running");
    }

}
