package fla_2320.LA83.session10.statepattern;

public class Television {

    private State state;

    public Television() {
        this.state = new OffState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void executeOffButton() {
        state.pressOffButton(this);
    }

    public void executeOnButton() {
        state.pressOnButton(this);
    }

    public void executeMuteButton() {
        state.pressMuteButton(this);
    }

}
