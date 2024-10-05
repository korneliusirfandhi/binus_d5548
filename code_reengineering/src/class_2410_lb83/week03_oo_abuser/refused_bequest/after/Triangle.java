package class_2410_lb83.week03_oo_abuser.refused_bequest.after;

public class Triangle extends Geometry {
    private int alas, tinggi;

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public int luas() {
        return alas * tinggi / 2;
    }

    @Override
    public int keliling() {
        return 3 * alas; // segitiga sama sisi
    }
}
