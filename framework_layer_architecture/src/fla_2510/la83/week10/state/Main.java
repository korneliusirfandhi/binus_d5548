package fla_2510.la83.week10.state;

public class Main {
    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine();
        System.out.println("-- Simulate Positive Case 1 --");
        // current state = NoCard
        atmMachine.insertCard();
        // current state = HasCard
        atmMachine.insertPin("123456");
        // current state = HasCorrectPin
        atmMachine.withdraw(10000);

        System.out.println("\n-- Simulate Positive Case 2 --");
        atmMachine.insertCard();
        atmMachine.insertPin("123456");
        atmMachine.withdraw(1000000);

        atmMachine.insertCard();
        atmMachine.insertCard(); // Cannot insert card. Card already inserted.
        atmMachine.withdraw(20000); // Please insert your valid PIN before withdrawal.
        atmMachine.insertPin("123455"); // PIN is incorrect. Card will be ejected.
        atmMachine.withdraw(20000); // No card has been inserted.

    }
}
