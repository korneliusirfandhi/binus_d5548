package fla_2320.LA83.session10.statepattern;

public class Main {

    public static void main(String[] args) {
        Television television = new Television();
        television.executeOnButton();
        System.out.println("Current state = " + television.getState());
        television.executeMuteButton();
        System.out.println("Current state = " + television.getState());
        television.executeOnButton();
        System.out.println("Current state = " + television.getState());
        television.executeMuteButton();
        System.out.println("Current state = " + television.getState());
        television.executeMuteButton();
        System.out.println("Current state = " + television.getState());
        television.executeOffButton();
        System.out.println("Current state = " + television.getState());

    }
}
