package fla_2510.la83.week08.adapter;

public class CreditCardAdapter implements PaymentProcessor {
    private GatewayTwo gatewayTwo = new GatewayTwo();
    private String apiKey;

    public CreditCardAdapter(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public void payment(double amount) {
        double totalAmount = amount + (0.2 * amount);
        gatewayTwo.doPayment(totalAmount, apiKey);
    }

}
