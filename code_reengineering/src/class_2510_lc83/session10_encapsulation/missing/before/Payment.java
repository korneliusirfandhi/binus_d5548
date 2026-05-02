package class_2510_lc83.session10_encapsulation.missing.before;

// missing encapsulation - violates OCP (Open Closed Principle)
public class Payment {
    public double calculateUsingVA(double amount, double discount) {
        return amount - discount - 4000;
    }

    public double calculateUsingCreditCard(double amount, double discount) {
        return amount - discount - (amount * 0.03);
    }

    public double calculateUsingEWallet(double amount, double discount) {
        return amount - discount - 2000;
    }

    public double calculateUsingBankTransfer(double amount, double discount) {
        return amount - discount - 5000;
    }

}
