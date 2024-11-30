package class_2410_lb83.week08_abstraction.unnecessary_abstraction.before;

// unnecessary abstraction = YAGNI (You Aren't Gonna Need It)
public class BestSellerBook {
    private String title, author, publisher;

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
