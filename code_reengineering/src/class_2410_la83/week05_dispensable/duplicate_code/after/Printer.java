package class_2410_la83.week05_dispensable.duplicate_code.after;

public class Printer {

    // print("Print 10", 10)
    // print("Print 20", 20)
    // ....
    public void print(String info, int n) {
        System.out.println(info);
        for (int i=0; i<n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
