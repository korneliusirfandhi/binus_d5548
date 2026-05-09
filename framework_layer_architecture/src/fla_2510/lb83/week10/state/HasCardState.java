package fla_2510.lb83.week10.state;

public class HasCardState implements ATMState {
    ATMMachine atmMachine;

    public HasCardState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void ejectCard() {
        System.out.println("Card is ejected.");
        atmMachine.setCurrentState(atmMachine.getNoCardState());
    }

    @Override
    public void insertCard() {
        System.out.println("Card already inserted.");
    }

    @Override
    public void insertPin(String pinNumber) {
        if ("123456".equals(pinNumber)) {
            System.out.println("PIN is valid. You can do withdrawal.");
            atmMachine.setCurrentState(atmMachine.getCorrectPinState());
        } else {
            System.out.println("PIN is not valid. Card is ejected.");
            atmMachine.setCurrentState(atmMachine.getNoCardState());
        }
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Cannot withdraw money. PIN is not inserted.");
    }
}
