package fla_2320.LA83.session10.statepattern;

// state pattern
// create interface State
public interface State {
    void pressOnButton(Television television);
    void pressOffButton(Television television);
    void pressMuteButton(Television television);
}
