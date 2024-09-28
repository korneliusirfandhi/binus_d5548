package class_2410_la83.week03_oo_abuser.refused_bequest.before;

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
        super.setPanjang(alas);
        super.setLebar(alas);
    }
}
