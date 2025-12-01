package class_2510_lc83.session11_modularization.insufficient.bloated_implementation.after;

import java.util.HashMap;
import java.util.Map;

public class BookService {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public Book getBook(String isbn) {
        return books.get(isbn);
    }

}
