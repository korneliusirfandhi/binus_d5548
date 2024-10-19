package class_2410_lb83.week05_dispensable.comments.before;

public class Util {
    public static boolean isValidWord(String word, int min, int max) {
        // not valid min, jika < 1
        if (min < 1) {
            return false;
        }
        // not valid max, jika max < 1, max < min
        if (max < 1 && max < min) {
            return false;
        }
        // word is valid, word nya harus ada isinya (ga bisa null / empty string)
        if (word != null
            && !word.equals("")
            && word.length() >= min
            && word.length() <= max) {

            return true;
        }

        return false;
    }
}
