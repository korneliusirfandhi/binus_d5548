package fla_2510.lb83.week10.state;

public class CorrectPinState implements ATMState {
    ATMMachine atmMachine;

    public CorrectPinState(ATMMachine atmMachine) {
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
        System.out.println("Pin is inserted.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount > atmMachine.getMachineAmount()) {
            System.out.println("Insufficient ATM funds. Card will be ejected.");
            atmMachine.setCurrentState(atmMachine.getNoCardState());
        } else {
            System.out.println("Withdrawing Money : " + amount);
            atmMachine.setMachineAmount(atmMachine.getMachineAmount() - amount);
            System.out.println("ATM Machine Balance : " + atmMachine.getMachineAmount());
            System.out.println("Card will be ejected. Please get your money. Thank you.");
            atmMachine.setCurrentState(atmMachine.getNoCardState());
        }
    }

}
