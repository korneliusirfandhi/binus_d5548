package class_2410_lc80.week04;

public class Circle extends Geometry {
    private double radius;
    private final double PI = Math.PI;
    // final = constant

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double luas() {
        return PI * radius * radius;
    }

    @Override
    public double keliling() {
        return 2 * PI * radius;
    }
}
