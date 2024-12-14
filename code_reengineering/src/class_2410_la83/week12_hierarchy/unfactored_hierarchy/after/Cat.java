package class_2410_la83.week12_hierarchy.unfactored_hierarchy.after;

public class Cat extends Animal {
    // any code here

    @Override
    public void sleep() {
        System.out.println("Cat sleeps anywhere");
    }

    @Override
    public void eat() {
        System.out.println("Cat loves to eat fish");
    }

    @Override
    public void run() {
        System.out.println("Cat can run and jump");
    }
}
