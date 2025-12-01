package class_2510_lc83.session02_bloater.primitive_obsession.before;

import java.util.Date;

public class Event {
    private String name;
    private Date time;
    private Venue venue;
    private Organizer organizer;

    // primitive obsession
    private boolean seminar = false;
    private boolean training = false;
    private boolean workshop = false;
    public String toString() {
        if (isSeminar()) {
            return "SEMINAR";
        } else if (isTraining()) {
            return "TRAINING";
        } else {
            return "WORKSHOP";
        }
    }
    public void setEventType(String eventType) {
        if ("seminar".equalsIgnoreCase(eventType)) {
            this.setSeminar(true);
        } else if ("training".equalsIgnoreCase(eventType)) {
            this.setTraining(true);
        } else if ("workshop".equalsIgnoreCase(eventType)) {
            this.setWorkshop(true);
        }
    }

    public boolean isSeminar() {
        return seminar;
    }

    public void setSeminar(boolean seminar) {
        this.seminar = seminar;
    }

    public boolean isTraining() {
        return training;
    }

    public void setTraining(boolean training) {
        this.training = training;
    }

    public boolean isWorkshop() {
        return workshop;
    }

    public void setWorkshop(boolean workshop) {
        this.workshop = workshop;
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
