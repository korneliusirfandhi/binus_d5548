package class_2510_lc83.session11_modularization.insufficient.bloated_interface.before;

import java.util.List;

public class FinanceReport implements ILibrarySystem {

    @Override
    public void addBook(Book book) {

    }

    @Override
    public void removeBook(String isbn) {

    }

    @Override
    public Book findBook(String isbn) {
        return null;
    }

    @Override
    public List<Book> getOverdueBooks() {
        return List.of();
    }

    @Override
    public void registerUser(User user) {

    }

    @Override
    public void removeUser(String userId) {

    }

    @Override
    public User findUser(User user) {
        return null;
    }

    @Override
    public List<User> getActiveUsers() {
        return List.of();
    }

    @Override
    public double calculateFine(String userId) {
        return 0;
    }

    @Override
    public void payFine(String userId, double amount) {

    }
}
