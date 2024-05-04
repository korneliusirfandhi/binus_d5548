package fla_2320.LA83.session08.adapterpattern;

public class Triangle implements TriInterface {

    private double baseLength, height;

    public Triangle(double baseLength, double height) {
        this.baseLength = baseLength;
        this.height = height;
    }

    @Override
    public void aboutTriangle() {
        System.out.println("Shape : Triangle");
    }

    @Override
    public double calculateAreaTriangle() {
        return 0.5 * baseLength * height;
    }
}
