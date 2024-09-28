package class_2410_la83.week03_oo_abuser.refused_bequest.before;

public class Rectangle {
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

    public int luas() {
        return panjang * lebar;
    }

    public int keliling() {
        return 2 * (panjang + lebar);
    }
}
