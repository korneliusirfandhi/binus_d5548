package class_2410_la83.week05_dispensable.comments.before;

public class Util {
    public static boolean isValidWord(String word, int min, int max) {
        // invalid word, because word must contain at least 1 chars
        if (min < 1) {
            return false;
        }

        // invalid word, because max chars less than 1, and max less than min
        if (max < 1 && max < min) {
            return false;
        }

        // valid words : not null, not empty string, word's length between min and max
        if (word != null
            && !word.equals("")
            && word.length() >= min
            && word.length() <= max) {

            return true;
        }

        return false;
    }
}
