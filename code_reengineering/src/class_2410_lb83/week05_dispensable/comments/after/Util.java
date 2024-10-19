package class_2410_lb83.week05_dispensable.comments.after;

public class Util {
    public static boolean isValidWord(String word, int min, int max) {
        final boolean isNotValidMin = isLessThan(min, 1);
        final boolean isNotValidMax = isLessThan(max, 1);
        final boolean isNotValidMaxMin = isLessThan(max, min);
        final boolean isWordNotEmpty = word != null && !word.equals("");
        final int wordLength = word.length();
        final boolean isValidWordLengthMin = isGreaterThanEquals(wordLength, min);
        final boolean isValidWordLengthMax = isLessThanEquals(wordLength, max);

        if (isNotValidMin || (isNotValidMax && isNotValidMaxMin)) {
            return false;
        }

        if (isWordNotEmpty && isValidWordLengthMin && isValidWordLengthMax) {
            return true;
        }

        return false;
    }

    private static boolean isLessThan(int angka1, int angka2) {
        return angka1 < angka2;
    }

    private static boolean isLessThanEquals(int angka1, int angka2) {
        return angka1 <= angka2;
    }

    private static boolean isGreaterThanEquals(int angka1, int angka2) {
        return angka1 >= angka2;
    }


}
