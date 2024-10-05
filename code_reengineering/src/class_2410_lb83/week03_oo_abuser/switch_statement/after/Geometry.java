package class_2410_lb83.week03_oo_abuser.switch_statement.after;

public abstract class Geometry {
    private int sisi;

    public Geometry(int sisi) {
        this.sisi = sisi;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public abstract int hitungKeliling();
}
