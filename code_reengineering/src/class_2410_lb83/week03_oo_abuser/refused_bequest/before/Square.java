package class_2410_lb83.week03_oo_abuser.refused_bequest.before;

public class Square extends Rectangle {
    @Override
    public void setPanjang(int sisi) {
        super.setPanjang(sisi);
        super.setLebar(sisi);
    }

    @Override
    public void setLebar(int sisi) {
        super.setLebar(sisi);
        super.setPanjang(sisi);
    }
}
