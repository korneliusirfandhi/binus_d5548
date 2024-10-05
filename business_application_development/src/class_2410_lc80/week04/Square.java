package class_2410_lc80.week04;

// 1 class bisa implements > 1 interface
public class Square implements IGeometry, IBangunDatar {
    private double sisi;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double keliling() {
        return 4 * sisi;
    }

    @Override
    public void information() {
        System.out.println("Info from Square..");
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }
}
