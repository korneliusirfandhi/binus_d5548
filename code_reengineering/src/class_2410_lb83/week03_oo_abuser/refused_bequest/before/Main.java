package class_2410_lb83.week03_oo_abuser.refused_bequest.before;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Square square = new Square();
        square.setPanjang(10);
        System.out.println("Luas square = " + square.luas());
        System.out.println("Keliling square = " + square.keliling());

        Square kotak = new Square();
        kotak.setLebar(10);
        System.out.println("Luas kotak = " + kotak.luas());
        System.out.println("Keliling kotak = " + kotak.keliling());

    }
}
