package class_2510_lc83.session02_bloater.long_parameters.after;

public class Registration {
    private Event event;

    // long parameter list
    // refactor -> introduce new parameter object
    private void setParticipantData(Participant participant) {
        // .....
    }


    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
