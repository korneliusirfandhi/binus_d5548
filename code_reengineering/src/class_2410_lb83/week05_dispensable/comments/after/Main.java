package class_2410_lb83.week05_dispensable.comments.after;

public class Main {
    public static void main(String[] args) {
        String word1 = "";
        String word2 = "BINUS";
        String word3 = "University";
        System.out.println("IsValidWord1 = " + Util.isValidWord(word1, 1, 3));
        System.out.println("IsValidWord2 = " + Util.isValidWord(word2, 1, 3));
        System.out.println("IsValidWord2 = " + Util.isValidWord(word2, 1, 10));
        System.out.println("IsValidWord3 = " + Util.isValidWord(word3, 11, 10));
    }
}
