package week02.example01;

// create class -> access modifier public
public class Circle {
    // encapsulation -> information hiding
    // semua data attribute -> access modifier private
    // bisa get atau set value -> public setter / public getter
    private double radius;

    static {
        System.out.println("Masuk static blocks..");
    }

    // 1~4 data attributes masih ok buat constructor khusus
    public Circle(double radius) {
        this.radius = radius;
    }

    // default constructor
    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    // keyword this -> refer to anything inside of class
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // behavior / method
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public static void info() {
        System.out.println("Masuk Static Info Circle.");
    }
}
