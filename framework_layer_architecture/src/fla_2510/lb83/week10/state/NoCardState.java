package fla_2510.lb83.week10.state;

public class NoCardState implements ATMState {
    ATMMachine atmMachine;

    public NoCardState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void ejectCard() {
        System.out.println("Cannot eject card. Card is not inserted.");
    }

    @Override
    public void insertCard() {
        System.out.println("Card is inserted. Input Your PIN.");
        atmMachine.setCurrentState(atmMachine.getHasCardState());
    }

    @Override
    public void insertPin(String pinNumber) {
        System.out.println("Cannot insert PIN. Card is not inserted.");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Cannot withdraw money. Card is not inserted.");
    }
}
