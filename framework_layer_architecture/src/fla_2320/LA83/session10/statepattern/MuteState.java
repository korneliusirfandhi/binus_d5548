package fla_2320.LA83.session10.statepattern;

// concrete state
public class MuteState implements State {
    @Override
    public void pressOnButton(Television television) {
        System.out.println("UNMUTE TV.");
        television.setState(new OnState());
    }

    @Override
    public void pressOffButton(Television television) {
        System.out.println("TV will be OFF.");
        television.setState(new OffState());
    }

    @Override
    public void pressMuteButton(Television television) {
        System.out.println("TV Mute. Do nothing.");
    }
}
