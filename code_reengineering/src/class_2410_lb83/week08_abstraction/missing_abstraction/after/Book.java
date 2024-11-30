package class_2410_lb83.week08_abstraction.missing_abstraction.after;

public class Book {
    private String title, author, publisher;
    private Isbn isbn;

    public Isbn getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = IsbnFactory.create(isbn);
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
}
