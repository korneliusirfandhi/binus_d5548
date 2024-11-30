package class_2410_la83.week08_abstraction.unnecessary_abstraction.before;

// unnecessary -> YAGNI (You Aren't Gonna Need It)
// kasih flagging di class Book (isBestSeller)
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
