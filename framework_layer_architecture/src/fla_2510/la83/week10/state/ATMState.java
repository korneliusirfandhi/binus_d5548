package fla_2510.la83.week10.state;

public interface ATMState {
    void insertCard();
    void ejectCard();
    void insertPin(String pinNumber);
    void withdrawMoney(double amount);
}
