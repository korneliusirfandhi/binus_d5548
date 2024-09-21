package class_2410_lc80.week02.example01;

public class Main {

    public static void main(String[] args) {
        // construct object -> call constructor
        Circle circle1 = new Circle();
        System.out.println("Radius circle1 = " + circle1.getRadius());
        circle1.setRadius(50.0);
        System.out.println("Radius circle1 = " + circle1.getRadius());
        System.out.println("Area circle1 = " + circle1.getArea());
        System.out.println("Perimeter circle1 = " + circle1.getPerimeter());

        Circle circle2 = new Circle(10.0);
        System.out.println("Radius circle2 = " + circle2.getRadius());
        System.out.println("Area circle2 = " + circle2.getArea());
        System.out.println("Perimeter circle2 = " + circle2.getPerimeter());

        Circle.info(); // call static variable dari class tanpa perlu create object
    }
}
