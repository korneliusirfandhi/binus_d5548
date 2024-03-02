package fla_2320.LA83.session03.polymorphism;

// extends only to 1 class / 1 abstract
public class Rectangle extends Shape {

    private double width, height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // dynamic polymorphism
    @Override
    public double computeArea() {
        return width * height;
    }
}
