package class_2410_la83.week02_bloater.long_parameter_list.before;

import java.util.Date;

public class Event {
    private String name;
    private int price;
    private Date start;
    private Date end;

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

    // long parameter list
    public void setParticipant(String name, String email, String phone, String address, String emergency) {
        // any logics here

    }
}
