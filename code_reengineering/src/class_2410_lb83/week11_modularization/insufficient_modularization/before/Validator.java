package class_2410_lb83.week11_modularization.insufficient_modularization.before;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// 2 behavior -> validator, string manipulator
// insufficient modularization
// - bloated interface (fowler = large class) -> extract class
// - bloated implementation (fowler = long method) -> extract method
public class Validator {
    public static boolean isValidEmail(String email) {
        // any code here
        return true;
    }

    public static boolean isValidDate(String date) {
        // any code here
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            // any code here
            LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);
            // any code here
            return true;
        } catch (Exception e) {
            System.out.println("Error parsing.");
            return false;
        }
    }

    public static boolean isValidMatched(String word, String regexp) {
        // any code here
        return word.matches(regexp);
    }

    public static String substring(String word, int start, int end) {
        // any code here
        return word.substring(start, end);
    }

    // bloated implementation
    public static String randomAlphaNumerics(int count) {
        // any code here
        String randomAlphaNumerics = "";
        // any code here (line 100)
        // ...
        // any code here (line 250)
        return randomAlphaNumerics;
    }

    public static String format(String word, String format) {
        // any code here
        return String.format(format, word);
    }
}
