package fla_2510.lb83.week08.adapter;

public class CardAdapter implements PaymentProcessor {
    private PaymentGatewayTwo paymentGatewayTwo = new PaymentGatewayTwo();
    private String apiKey;

    public CardAdapter(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public void payment(double amount) {
        amount += 0.1 * amount;
        paymentGatewayTwo.doPayment(amount, apiKey);
    }
}
