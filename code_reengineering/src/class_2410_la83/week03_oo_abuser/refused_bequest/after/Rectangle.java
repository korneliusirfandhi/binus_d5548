package class_2410_la83.week03_oo_abuser.refused_bequest.after;

public class Rectangle extends Geometry {
    private int panjang, lebar;

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    @Override
    public int luas() {
        return panjang * lebar;
    }

    @Override
    public int keliling() {
        return 2 * (panjang + lebar);
    }
}
