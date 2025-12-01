package class_2510_lc83.session11_modularization.insufficient.bloated_interface.before;

import java.util.List;

// bloated interface
public interface ILibrarySystem {
    // book inventory
    void addBook(Book book);
    void removeBook(String isbn);
    Book findBook(String isbn);
    List<Book> getOverdueBooks();

    // user management
    void registerUser(User user);
    void removeUser(String userId);
    User findUser(User user);
    List<User> getActiveUsers();

    // financial
    double calculateFine(String userId);
    void payFine(String userId, double amount);
}
