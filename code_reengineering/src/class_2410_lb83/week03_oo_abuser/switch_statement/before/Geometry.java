package class_2410_lb83.week03_oo_abuser.switch_statement.before;

public class Geometry {
    public int hitungKeliling(String shape, int sisi) {
        switch (shape) {
            case "Triangle" : return 3 * sisi;
            case "Rectangle" : return 4 * sisi;
            case "Pentagon" : return 5 * sisi;
            default: return 0;
        }
    }
}
