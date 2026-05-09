package fla_2510.lb83.week10.state;

// insert card -> insert pin -> withdraw money -> eject card
public interface ATMState {
    void insertCard();
    void insertPin(String pinNumber);
    void withdraw(double amount);
    void ejectCard();
}
