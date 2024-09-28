package class_2410_la83.week03_oo_abuser.switch_statement.before;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Geometry geometry = new Geometry();
        int kelilingTriangle = geometry.hitungKeliling("Triangle", 10);
        int kelilingRectangle = geometry.hitungKeliling("Rectangle", 10);
        int kelilingPentagon = geometry.hitungKeliling("Pentagon", 10);
        System.out.println("Data Keliling");
        System.out.println("- Triangle = " + kelilingTriangle);
        System.out.println("- Rectangle = " + kelilingRectangle);
        System.out.println("- Pentagon = " + kelilingPentagon);
    }

}
