package class_2410_la83.week03_oo_abuser.switch_statement.after;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Triangle triangle = new Triangle(10);
        Rectangle rectangle = new Rectangle(10);
        Pentagon pentagon = new Pentagon(10);
        System.out.println("Data Keliling");
        System.out.println("- Triangle = " + triangle.hitungKeliling());
        System.out.println("- Rectangle = " + rectangle.hitungKeliling());
        System.out.println("- Pentagon = " + pentagon.hitungKeliling());
    }

}
