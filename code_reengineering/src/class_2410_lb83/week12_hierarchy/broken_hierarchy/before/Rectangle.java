package class_2410_lb83.week12_hierarchy.broken_hierarchy.before;

public class Rectangle implements Shape {
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
    public double luas() {
        return panjang * lebar;
    }

    @Override
    public double keliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public double volume() {
        throw new UnsupportedOperationException("Volume is not supported.");
    }
}
