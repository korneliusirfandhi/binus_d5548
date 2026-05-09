package fla_2510.lb83.week10.state;

public class ATMMachine {
    private ATMState currentState;
    private ATMState noCardState;
    private ATMState hasCardState;
    private ATMState correctPinState;

    private double machineAmount = 1000000.0;

    public ATMMachine() {
        this.noCardState = new NoCardState(this);
        this.hasCardState = new HasCardState(this);
        this.correctPinState = new CorrectPinState(this);
        this.currentState = noCardState; // initial state
    }

    public void insertCard() {
        this.currentState.insertCard();
    }

    public void insertPin(String pin) {
        this.currentState.insertPin(pin);
    }

    public void withdrawMoney(double amount) {
        this.currentState.withdraw(amount);
    }

    public void ejectCard() {
        this.currentState.ejectCard();
    }

    // provide getter for each state

    public ATMState getCorrectPinState() {
        return correctPinState;
    }

    public ATMState getHasCardState() {
        return hasCardState;
    }

    public ATMState getNoCardState() {
        return noCardState;
    }

    // setter for current state

    public void setCurrentState(ATMState currentState) {
        this.currentState = currentState;
    }

    public double getMachineAmount() {
        return machineAmount;
    }

    public void setMachineAmount(double machineAmount) {
        this.machineAmount = machineAmount;
    }
}
