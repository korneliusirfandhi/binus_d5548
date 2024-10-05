package class_2410_lb83.week03_oo_abuser.switch_statement.after;

public class Rectangle extends Geometry {
    public Rectangle(int sisi) {
        super(sisi);
    }

    @Override
    public int hitungKeliling() {
        return 4 * getSisi();
    }
}
