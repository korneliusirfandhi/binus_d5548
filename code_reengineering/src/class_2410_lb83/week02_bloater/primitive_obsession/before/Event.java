package class_2410_lb83.week02_bloater.primitive_obsession.before;

import java.util.Date;

public class Event {
    private String name;
    private int price;
    private Date start;
    private Date end;
    private String participantName;
    private String participantEmail;
    private String participantPhone;
    private String participantAddress;
    private String participantEmergency;
    private String organizerName;
    private String organizerAddress;
    private String organizerContact;
    private String venue;
    private String location;
    private String city;

    // primitive obsession
    private boolean workshop = false;
    private boolean seminar = false;
    private boolean training = false;

    public String showEventType() {
        if (isWorkshop()) {
            return "This is a workshop.";
        } else if (isTraining()) {
            return "This is a training.";
        } else if (isSeminar()) {
            return "This is a seminar";
        }
        return "Invalid event type.";
    }

    public boolean isWorkshop() {
        return workshop;
    }

    public void setWorkshop(boolean workshop) {
        this.workshop = workshop;
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

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public String getParticipantEmail() {
        return participantEmail;
    }

    public void setParticipantEmail(String participantEmail) {
        this.participantEmail = participantEmail;
    }

    public String getParticipantPhone() {
        return participantPhone;
    }

    public void setParticipantPhone(String participantPhone) {
        this.participantPhone = participantPhone;
    }

    public String getParticipantAddress() {
        return participantAddress;
    }

    public void setParticipantAddress(String participantAddress) {
        this.participantAddress = participantAddress;
    }

    public String getParticipantEmergency() {
        return participantEmergency;
    }

    public void setParticipantEmergency(String participantEmergency) {
        this.participantEmergency = participantEmergency;
    }

    public String getOrganizerName() {
        return organizerName;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }

    public String getOrganizerAddress() {
        return organizerAddress;
    }

    public void setOrganizerAddress(String organizerAddress) {
        this.organizerAddress = organizerAddress;
    }

    public String getOrganizerContact() {
        return organizerContact;
    }

    public void setOrganizerContact(String organizerContact) {
        this.organizerContact = organizerContact;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
