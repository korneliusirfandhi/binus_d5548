package class_2410_la83.week03_oo_abuser.refused_bequest.before;

public class Square extends Rectangle {

    // refused bequest
    @Override
    public void setPanjang(int sisi) {
        super.setPanjang(sisi);
        super.setLebar(sisi);
    }

    @Override
    public void setLebar(int sisi) {
        super.setPanjang(sisi);
        super.setLebar(sisi);
    }

}
