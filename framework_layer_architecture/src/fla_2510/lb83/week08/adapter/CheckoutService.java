package fla_2510.lb83.week08.adapter;

public class CheckoutService {
    private PaymentProcessor paymentProcessor;

    public CheckoutService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void doCheckout(double amount) {
        paymentProcessor.payment(amount);
    }
}
