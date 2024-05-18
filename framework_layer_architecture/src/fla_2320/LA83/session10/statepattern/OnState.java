package fla_2320.LA83.session10.statepattern;

// concrete state
public class OnState implements State {
    @Override
    public void pressOnButton(Television television) {
        System.out.println("TV already ON, do nothing.");
    }

    @Override
    public void pressOffButton(Television television) {
        System.out.println("TV is ON. Switched to OFF.");
        television.setState(new OffState());
    }

    @Override
    public void pressMuteButton(Television television) {
        System.out.println("TV is ON. And being to MUTE.");
        television.setState(new MuteState());
    }
}
