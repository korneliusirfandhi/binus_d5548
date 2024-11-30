package class_2410_lb83.week08_abstraction.missing_abstraction.before;

// mirip dengan primitive obsession (fowler)
// extract abstraction yg baru (class, abstract class)
public class Book {
    private String title, author, publisher;
    private String isbn;

    public boolean checkIsbn(String isbn) {
        if (isbn.length() == 10) {
            return checkIsbn10();
        } else if (isbn.length() == 13) {
            return checkIsbn13();
        }
        throw new IllegalArgumentException("Isbn length is not valid!");
    }

    private boolean checkIsbn10() {
        // do any code here
        // ...
        return true;
    }

    private boolean checkIsbn13() {
        // do any code here
        // ...
        return true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
