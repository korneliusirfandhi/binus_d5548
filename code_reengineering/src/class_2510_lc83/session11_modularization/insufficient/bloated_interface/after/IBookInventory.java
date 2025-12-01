package class_2510_lc83.session11_modularization.insufficient.bloated_interface.after;

import class_2510_lc83.session11_modularization.insufficient.bloated_interface.before.Book;

import java.util.List;

public interface IBookInventory {
    void addBook(Book book);
    void removeBook(String isbn);
    Book findBook(String isbn);
    List<Book> getOverdueBooks();
}
