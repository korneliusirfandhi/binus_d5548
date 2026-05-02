package class_2510_lc83.session10_encapsulation.missing.after;

public class CreditCard implements Payment {
    @Override
    public double calculate(double amount, double discount) {
        return amount - discount - (amount * 0.03);
    }
}
