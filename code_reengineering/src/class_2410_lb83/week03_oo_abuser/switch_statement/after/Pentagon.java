package class_2410_lb83.week03_oo_abuser.switch_statement.after;

public class Pentagon extends Geometry {
    public Pentagon(int sisi) {
        super(sisi);
    }

    @Override
    public int hitungKeliling() {
        return 5 * getSisi();
    }
}
