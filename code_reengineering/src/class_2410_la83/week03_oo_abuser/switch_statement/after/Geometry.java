package class_2410_la83.week03_oo_abuser.switch_statement.after;

public abstract class Geometry {
    private int sisi;

    public int getSisi() {
        return sisi;
    }

    public Geometry(int sisi) {
        this.sisi = sisi;
    }

    public abstract int hitungKeliling();
}
