package class_2410_la83.week02_bloater.data_clumps.after;

public class Event {
    private String name;
    private int price;
    private DateRange date;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public DateRange getDate() {
        return date;
    }

    public void setDate(DateRange date) {
        this.date = date;
    }

    // long parameter list
    public void setParticipant(Participant participant) {
        // any logics here

    }
}
