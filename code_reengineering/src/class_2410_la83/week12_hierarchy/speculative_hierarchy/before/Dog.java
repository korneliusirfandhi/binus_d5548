package class_2410_la83.week12_hierarchy.speculative_hierarchy.before;

public class Dog extends Animal {
    // any code here
    @Override
    public void eat() {
        System.out.println("Dog loves eating");
        System.out.println("Dog loves drinking");
    }

    @Override
    public void run() {
        System.out.println("Dog can run faster than another");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps if it wants");
    }
}
