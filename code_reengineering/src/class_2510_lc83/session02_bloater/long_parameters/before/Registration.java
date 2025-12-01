package class_2510_lc83.session02_bloater.long_parameters.before;

public class Registration {
    private Event event;

    // long parameter list
    // refactor -> introduce new parameter object
    private void setParticipantData(String name,
                                    String email,
                                    String phone,
                                    String address,
                                    String emergency,
                                    String job,
                                    String specialRequest) {
        // .....
    }


    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
