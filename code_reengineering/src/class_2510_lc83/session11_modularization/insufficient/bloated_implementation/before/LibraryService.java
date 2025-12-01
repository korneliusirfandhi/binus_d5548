package class_2510_lc83.session11_modularization.insufficient.bloated_implementation.before;

import java.util.HashMap;
import java.util.Map;

public class LibraryService {
    private Map<String, Book> books = new HashMap<>();
    private Map<String, User> users = new HashMap<>();
    private static final double FINE_PER_DAY_RATE = 2000.0;
    private static final int OVERDUE_DAYS = 7;

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public Book getBook(String isbn) {
        return books.get(isbn);
    }

    public void registerUser(User user) {
        users.put(user.getUserId(), user);
    }

    public User findUser(String userId) {
        return users.get(userId);
    }

    public double calculateFine() {
        return OVERDUE_DAYS * FINE_PER_DAY_RATE;
    }

    public void payFine(String userId, double amount) {
        System.out.printf("%s paid fine %.2f\n", userId, amount);
    }

}
