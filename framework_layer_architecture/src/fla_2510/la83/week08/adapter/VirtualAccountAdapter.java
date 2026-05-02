package fla_2510.la83.week08.adapter;

public class VirtualAccountAdapter implements PaymentProcessor {
    private GatewayOne gatewayOne = new GatewayOne();
    private String id;

    public VirtualAccountAdapter(String id) {
        this.id = id;
    }

    @Override
    public void payment(double amount) {
        gatewayOne.processPayment(amount, id);
    }
}
