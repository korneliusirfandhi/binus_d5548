package fla_2320.LA83.session03.polymorphism;

// using interface can be more than 1
public class Square implements IShape, ITest {
    private double sisi;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double computeArea() {
        return sisi * sisi;
    }

    @Override
    public void printInfo(double area) {
        System.out.println("Square area = " + area);
    }

    @Override
    public void hello() {
        // do nothing
    }
}
