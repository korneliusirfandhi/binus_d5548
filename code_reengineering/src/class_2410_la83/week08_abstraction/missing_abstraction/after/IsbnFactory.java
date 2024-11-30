package class_2410_la83.week08_abstraction.missing_abstraction.after;

public class IsbnFactory {
    public static Isbn create(String isbn) {
        if (isbn.length() == 10) {
            return new Isbn10();
        } else if (isbn.length() == 13) {
            return new Isbn13();
        }
        throw new IllegalArgumentException("Isbn length is not valid!");
    }
}
