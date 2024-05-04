package fla_2320.LA83.session08.adapterpattern;

// adapter untuk kalkulasi luas segitiga tapi melalui rectangle
public class Adapter implements RectInterface {

    private TriInterface triangle;

    public Adapter(TriInterface triangle) {
        this.triangle = triangle;
    }

    @Override
    public void aboutMe() {
        triangle.aboutTriangle();
    }

    @Override
    public double calculateArea() {
        return triangle.calculateAreaTriangle();
    }
}
