package fla_2320.LA83.session08.adapterpattern;

public class Rectangle implements RectInterface {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void aboutMe() {
        System.out.println("Shape : Rectangle");
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
