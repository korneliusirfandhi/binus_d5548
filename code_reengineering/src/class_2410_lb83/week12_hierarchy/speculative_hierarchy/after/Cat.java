package class_2410_lb83.week12_hierarchy.speculative_hierarchy.after;

public class Cat extends Animal {

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
        System.out.println("Cat can run and also run after do jumping");
    }
}