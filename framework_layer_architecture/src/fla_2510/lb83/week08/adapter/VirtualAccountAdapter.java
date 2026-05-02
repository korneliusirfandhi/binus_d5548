package fla_2510.lb83.week08.adapter;

public class VirtualAccountAdapter implements PaymentProcessor {
    private PaymentGatewayOne paymentGatewayOne = new PaymentGatewayOne();
    private String paymentId;

    public VirtualAccountAdapter(String paymentId) {
        this.paymentId = paymentId;
    }

    @Override
    public void payment(double amount) {
        amount += 1000.0;
        paymentGatewayOne.processPayment(amount, paymentId);
    }
}
