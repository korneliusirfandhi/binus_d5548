package class_2410_la83.week03_oo_abuser.refused_bequest.after;

public class Square extends Geometry {
    private int sisi;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public int luas() {
        return sisi * sisi;
    }

    @Override
    public int keliling() {
        return 4 * sisi;
    }
}
