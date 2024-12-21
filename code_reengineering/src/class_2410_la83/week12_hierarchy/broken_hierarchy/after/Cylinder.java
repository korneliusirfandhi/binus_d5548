package class_2410_la83.week12_hierarchy.broken_hierarchy.after;

public class Cylinder implements Shape3D {
    private double radius, height;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double keliling() {
        return 2 * (2 * radius + height);
    }

    @Override
    public double luas() {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
