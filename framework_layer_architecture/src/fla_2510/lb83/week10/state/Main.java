package fla_2510.lb83.week10.state;

public class Main {
    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine();
        atmMachine.insertCard();
        atmMachine.insertPin("123456");
        atmMachine.withdrawMoney(50000);
        System.out.println("--------------------------------------------------------------------");

        atmMachine.insertCard();
        atmMachine.insertPin("123456");
        atmMachine.withdrawMoney(100000);

        System.out.println("--------------------------------------------------------------------");
        atmMachine.insertCard();
        atmMachine.insertPin("123123");

        System.out.println("--------------------------------------------------------------------");
        atmMachine.insertCard();
        atmMachine.insertPin("123456");
        atmMachine.withdrawMoney(20000);

        System.out.println("--------------------------------------------------------------------");
        System.out.println("    NEGATIVE CASE");
        System.out.println("--------------------------------------------------------------------");
        atmMachine.withdrawMoney(10000);
        atmMachine.insertPin("999999");

        System.out.println("--------------------------------------------------------------------");
        System.out.println("    NEGATIVE CASE");
        System.out.println("--------------------------------------------------------------------");
        atmMachine.insertCard();
        atmMachine.withdrawMoney(10000);
        atmMachine.ejectCard();
        atmMachine.insertPin("999999");

        System.out.println("--------------------------------------------------------------------");
        System.out.println("    NEGATIVE CASE");
        System.out.println("--------------------------------------------------------------------");
        atmMachine.insertCard();
        atmMachine.insertPin("123456");
        atmMachine.insertPin("123456");
        atmMachine.withdrawMoney(10000);
        atmMachine.ejectCard();
        atmMachine.insertCard();
        atmMachine.insertPin("123456");
        atmMachine.withdrawMoney(850000);
    }
}
