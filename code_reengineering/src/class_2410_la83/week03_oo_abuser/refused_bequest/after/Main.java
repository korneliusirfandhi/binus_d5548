package class_2410_la83.week03_oo_abuser.refused_bequest.after;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Square square = new Square();
        square.setSisi(10);
        System.out.println("Square - Luas = " + square.luas());
        System.out.println("Square - Keliling = " + square.keliling());

        Rectangle rectangle = new Rectangle();
        rectangle.setPanjang(10);
        rectangle.setLebar(5);
        System.out.println("Rectangle - Luas = " + rectangle.luas());
        System.out.println("Rectangle - Keliling = " + rectangle.keliling());

    }
}
