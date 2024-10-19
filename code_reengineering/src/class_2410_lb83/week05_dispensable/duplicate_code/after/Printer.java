package class_2410_lb83.week05_dispensable.duplicate_code.after;

public class Printer {

    // printStars("Print Ten Message", 10)
    // printStars("Print Five Message", 5)
    // ....
    public void printStars(String message, int star) {
        System.out.println(message);
        for (int i=0; i<star; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void printAnything(String word) {
        System.out.println(word);
        if (word.contains("Binus")) {
            System.out.println("Jackpot WORD..");
        }
    }
}
