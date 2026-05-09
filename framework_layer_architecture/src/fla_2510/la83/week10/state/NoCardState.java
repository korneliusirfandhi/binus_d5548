package fla_2510.la83.week10.state;

public class NoCardState implements ATMState {
    ATMMachine atmMachine;

    public NoCardState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card has been inserted. Please input your PIN.");
        atmMachine.setCurrentState(atmMachine.getHasCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("No card has been inserted.");
    }

    @Override
    public void insertPin(String pinNumber) {
        System.out.println("No card has been inserted before inserting PIN.");
    }

    @Override
    public void withdrawMoney(double amount) {
        System.out.println("No card has been inserted before withdrawing.");
    }
}
