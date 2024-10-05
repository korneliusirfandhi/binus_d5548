package class_2410_lb83.week03_oo_abuser.refused_bequest.before;

public class Triangle extends Rectangle {
    private int tinggi;

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public void setPanjang(int alas) {
        super.setPanjang(alas);
        super.setLebar(alas);
    }

    @Override
    public void setLebar(int alas) {
        super.setLebar(alas);
        super.setPanjang(alas);
    }

    @Override
    public int luas() {
        return getPanjang() * tinggi / 2;
    }

    @Override
    public int keliling() {
        return 3 * getLebar();
    }
}
