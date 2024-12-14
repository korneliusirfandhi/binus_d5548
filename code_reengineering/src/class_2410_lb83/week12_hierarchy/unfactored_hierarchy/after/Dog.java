package class_2410_lb83.week12_hierarchy.unfactored_hierarchy.after;

public class Dog extends Animal {

    @Override
    public void sleep() {
        System.out.println("Dog sleep if it wants");
    }

    @Override
    public void eat() {
        System.out.println("Dog loves to eat any meats");
        System.out.println("Dog loves to eat with its friends");
    }

    @Override
    public void run() {
        System.out.println("Dog can run fast");
    }
}
