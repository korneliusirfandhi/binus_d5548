package fla_2510.lb83.week08.adapter;

public class PaymentGatewayOne {
    public void processPayment(double amount, String paymentId) {
        System.out.println("Processing payment of " + amount + " with PaymentGatewayOne. Payment ID: " + paymentId);
    }
}
