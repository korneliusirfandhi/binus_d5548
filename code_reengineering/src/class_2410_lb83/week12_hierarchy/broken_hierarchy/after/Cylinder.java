package class_2410_lb83.week12_hierarchy.broken_hierarchy.after;

public class Cylinder implements Shape3D {
    private double jariJari, tinggi;

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }

    @Override
    public double keliling() {
        return 4 * jariJari + 2 * tinggi;
    }

    @Override
    public double volume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }
}
