package class_2410_la83.week12_hierarchy.broken_hierarchy.after;

public class Rectangle implements Shape2D {
    private double panjang, lebar;

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public double keliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public double luas() {
        return panjang * lebar;
    }

}
