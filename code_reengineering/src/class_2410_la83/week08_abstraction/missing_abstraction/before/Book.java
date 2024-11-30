package class_2410_la83.week08_abstraction.missing_abstraction.before;

// mirip fowler smell code (primitive obsession)
// refactor dengan extract abstraction baru
public class Book {
    private String title, author, publisher, isbn;

    public boolean checkIsbn() {
        if (isbn.length() == 10) {
            return checkIsbn10(isbn);
        } else if (isbn.length() == 13) {
            return checkIsbn13(isbn);
        }
        throw new IllegalArgumentException("Isbn length is not valid!");
    }

    private boolean checkIsbn10(String isbn) {
        // do any logic here
        // ...
        return true;
    }

    private boolean checkIsbn13(String isbn) {
        // do any logic here
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
