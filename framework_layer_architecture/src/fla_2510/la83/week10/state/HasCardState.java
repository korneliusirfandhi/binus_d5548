package fla_2510.la83.week10.state;

public class HasCardState implements ATMState {
    ATMMachine atmMachine;

    public HasCardState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Cannot insert card. Card already inserted.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card already ejected.");
        atmMachine.setCurrentState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(String pinNumber) {
        if ("123456".equals(pinNumber)) {
            System.out.println("PIN is correct.");
            atmMachine.setCurrentState(atmMachine.getHasCorrectPinState());
        } else {
            System.out.println("PIN is incorrect. Card will be ejected.");
            atmMachine.setCurrentState(atmMachine.getNoCardState());
        }
    }

    @Override
    public void withdrawMoney(double amount) {
        System.out.println("Please insert your valid PIN before withdrawal.");
    }
}
