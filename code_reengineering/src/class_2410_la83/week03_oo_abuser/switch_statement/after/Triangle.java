package class_2410_la83.week03_oo_abuser.switch_statement.after;

public class Triangle extends Geometry {
    public Triangle(int sisi) {
        super(sisi);
    }

    @Override
    public int hitungKeliling() {
        return 3 * getSisi();
    }
}
