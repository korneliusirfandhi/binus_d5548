package fla_2510.la83.week10.state;

public class HasCorrectPinState implements ATMState {
    ATMMachine atmMachine;

    public HasCorrectPinState(ATMMachine atmMachine) {
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
        System.out.println("PIN already inserted.");
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount > atmMachine.machineCash) {
            System.out.println("Cannot withdraw money. Amount exceeds machine cash.");
            atmMachine.setCurrentState(atmMachine.getNoCardState());
        } else {
            atmMachine.machineCash -= amount;
            System.out.println("Money has been withdrawn. Money in ATM Machine : " + atmMachine.machineCash);
            atmMachine.setCurrentState(atmMachine.getNoCardState());
            if (atmMachine.machineCash <= 0) {
                atmMachine.setCurrentState(atmMachine.getNoMoneyState());
            }
        }
    }
}
