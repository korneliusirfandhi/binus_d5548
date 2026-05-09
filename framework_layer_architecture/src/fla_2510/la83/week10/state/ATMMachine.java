package fla_2510.la83.week10.state;

public class ATMMachine {
    ATMState hasCardState;
    ATMState noCardState;
    ATMState hasCorrectPinState;
    ATMState noMoneyState;

    ATMState currentState;

    double machineCash = 1000000.0;

    public ATMMachine() {
        this.hasCardState = new HasCardState(this);
        this.hasCorrectPinState = new HasCorrectPinState(this);
        this.noCardState = new NoCardState(this);
        this.noMoneyState = new NoMoneyState(this);
        this.currentState = noCardState;
    }

    public ATMState getHasCardState() {
        return hasCardState;
    }

    public ATMState getHasCorrectPinState() {
        return hasCorrectPinState;
    }

    public ATMState getNoMoneyState() {
        return noMoneyState;
    }

    public ATMState getNoCardState() {
        return noCardState;
    }

    public void setCurrentState(ATMState currentState) {
        this.currentState = currentState;
    }

    public ATMState getCurrentState() {
        return currentState;
    }

    public void insertCard() {
        currentState.insertCard();
    }

    public void insertPin(String pin) {
        currentState.insertPin(pin);
    }

    public void ejectCard() {
        currentState.ejectCard();
    }

    public void withdraw(double amount) {
        currentState.withdrawMoney(amount);
    }
}
