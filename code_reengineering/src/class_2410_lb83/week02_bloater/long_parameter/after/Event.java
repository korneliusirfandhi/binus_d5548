package class_2410_lb83.week02_bloater.long_parameter.after;

import class_2410_lb83.week02_bloater.large_class.after.Organizer;
import class_2410_lb83.week02_bloater.large_class.after.Venue;

import java.util.Date;

public class Event {
    private String name;
    private int price;
    private Date start;
    private Date end;

    public void setParticipant(Participant participant) {
        // do any logic here
    }

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

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
