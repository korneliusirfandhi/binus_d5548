package fla_2510.la83.week10.state;

public class NoMoneyState implements ATMState {
    ATMMachine atmMachine;

    public NoMoneyState(ATMMachine atmMachine) {
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
        System.out.println("Cannot withdraw money. Money in machine is 0.");
        atmMachine.setCurrentState(atmMachine.getNoCardState());
    }
}
