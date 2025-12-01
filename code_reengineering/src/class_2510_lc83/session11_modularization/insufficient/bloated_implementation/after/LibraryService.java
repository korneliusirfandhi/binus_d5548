package class_2510_lc83.session11_modularization.insufficient.bloated_implementation.after;

public class LibraryService {
    private final BookService bookService;
    private final UserService userService;
    private static final double FINE_PER_DAY_RATE = 2000.0;
    private static final int OVERDUE_DAYS = 7;

    public LibraryService(BookService bookService, UserService userService) {
        this.bookService = bookService;
        this.userService = userService;
    }

    public void addBook(Book book) {
        bookService.addBook(book);
    }

    public Book getBook(String isbn) {
        return bookService.getBook(isbn);
    }

    public void registerUser(User user) {
        userService.registerUser(user);
    }

    public User findUser(String userId) {
        return userService.findUser(userId);
    }

    public double calculateFine() {
        return OVERDUE_DAYS * FINE_PER_DAY_RATE;
    }

    public void payFine(String userId, double amount) {
        System.out.printf("%s paid fine %.2f\n", userId, amount);
    }

}
