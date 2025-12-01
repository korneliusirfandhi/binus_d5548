package class_2510_lc83.session02_bloater.primitive_obsession.after;

import java.util.Date;

public class Event {
    private String name;
    private Date time;
    private Venue venue;
    private Organizer organizer;

    public Object setEventType(String eventType) {
        if ("seminar".equalsIgnoreCase(eventType)) {
            return new Seminar();
        } else if ("training".equalsIgnoreCase(eventType)) {
            return new Training();
        } else if ("workshop".equalsIgnoreCase(eventType)) {
            return new Workshop();
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }
}
