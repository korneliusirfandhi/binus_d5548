package fla_2320.LA83.session10.statepattern;

// concrete state
public class OffState implements State {
    @Override
    public void pressOnButton(Television television) {
        System.out.println("TV is OFF. Switched to ON.");
        television.setState(new OnState());
    }

    @Override
    public void pressOffButton(Television television) {
        System.out.println("TV already OFF, do nothing.");
    }

    @Override
    public void pressMuteButton(Television television) {
        System.out.println("TV already OFF, cannot mute.");
    }
}
