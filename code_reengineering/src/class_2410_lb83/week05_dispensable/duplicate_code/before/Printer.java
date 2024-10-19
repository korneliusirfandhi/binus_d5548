package class_2410_lb83.week05_dispensable.duplicate_code.before;

public class Printer {
    public void printTenStars() {
        System.out.println("Print Ten Stars");
        for (int i=0; i<10; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void printFiveStars() {
        System.out.println("Print Five Stars");
        for (int i=0; i<5; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void printTwentyStars() {
        System.out.println("Print Twenty Stars");
        for (int i=0; i<20; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void printAnything(String word) {
        if (word.contains("Binus")) {
            System.out.println(word);
            System.out.println("Jackpot WORD..");
        } else {
            System.out.println(word);
        }
    }


}
