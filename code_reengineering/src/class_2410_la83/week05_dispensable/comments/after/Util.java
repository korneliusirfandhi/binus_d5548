package class_2410_la83.week05_dispensable.comments.after;

public class Util {

    public static boolean isValidWord(String word, int min, int max) {
        final boolean isNotValidMin = isLessThan(min, 1);
        final boolean isNotValidMax = isLessThan(max, 1);
        final boolean isNotValidMaxMin = isLessThan(max, min);
        final boolean isValidWords = word != null && !word.equals("");
        final int wordLength = word.length();
        final boolean isValidWordsLength = isLessThanEquals(min, wordLength) && isGreaterThanEquals(max, wordLength);

        if (isNotValidMin || (isNotValidMax && isNotValidMaxMin)) {
            return false;
        }

        if (isValidWords && isValidWordsLength) {
            return true;
        }

        return false;
    }

    private static boolean isLessThan(int number1, int number2) {
        return number1 < number2;
    }

    private static boolean isGreaterThan(int number1, int number2) {
        return number1 > number2;
    }

    private static boolean isLessThanEquals(int number1, int number2) {
        return number1 <= number2;
    }

    private static boolean isGreaterThanEquals(int number1, int number2) {
        return number1 >= number2;
    }

}
