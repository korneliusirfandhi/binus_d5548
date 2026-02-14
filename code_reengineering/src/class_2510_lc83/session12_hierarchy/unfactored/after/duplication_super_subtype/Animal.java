package class_2510_lc83.session12_hierarchy.unfactored.after.duplication_super_subtype;

public abstract class Animal {
    // any logical properties or methods common to all animals can be added here
    public void breathe() {
        System.out.println("Animal is breathing");
    }

    public abstract void eat();
    public abstract void sleep();
    public abstract void sound();
    public abstract void run();
}
