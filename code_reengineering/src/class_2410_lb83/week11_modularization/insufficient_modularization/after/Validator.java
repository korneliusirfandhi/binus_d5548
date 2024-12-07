package class_2410_lb83.week11_modularization.insufficient_modularization.after;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
}
