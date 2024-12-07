package class_2410_la83.week11_modularization.insufficient_modularization.before;

import java.time.format.DateTimeFormatter;

// insufficient -> bloated interface (fowler = large class)
// insufficient -> bloated implementation (fowler = long method)
// decompose abstractions to manageable size
// 2 behavior berbeda -> validasi, formatting string
public class Validator {
    public static boolean isValidEmail(String email) {
        // any code here
        if (email.contains("@")) {
            // any code here
        }
        return true;
    }

    public static boolean isValidDate(String date) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // any code here
        return true;
    }

    public static boolean isValidMatched(String word, String regex) {
        // any code here
        return word.matches(regex);
    }

    public static String substring(String word, int start, int end) {
        // any code here
        return word.substring(start, end);
    }

    public static String randomAlphabets(String word, int count) {
        // any code here
        return "HQUIAS";
    }

    public static String formatted(String word, String format) {
        return String.format(format, word);
    }

}
