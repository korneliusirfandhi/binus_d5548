package class_2410_la83.week11_modularization.insufficient_modularization.after;

import java.time.format.DateTimeFormatter;

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
}
