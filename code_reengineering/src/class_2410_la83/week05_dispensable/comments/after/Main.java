package class_2410_la83.week05_dispensable.comments.after;

public class Main {

    public static void main(String[] args) {
        String word1 = "";
        String word2 = "BINUS";
        String word3 = "University";

        System.out.println("isValidWord1 = " + Util.isValidWord(word1, 0, 10));
        System.out.println("isValidWord1 = " + Util.isValidWord(word1, 2, 1));
        System.out.println("isValidWord2 = " + Util.isValidWord(word2, 2, 10));
        System.out.println("isValidWord3 = " + Util.isValidWord(word3, 5, 9));
    }
}
