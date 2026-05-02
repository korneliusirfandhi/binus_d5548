package fla_2510.la83.week08.adapter;

public class Main {

    public static void main(String[] args) {
        PaymentProcessor virtualAccount = new VirtualAccountAdapter("8010200100"); // GatewayOne
        PaymentProcessor creditCard = new CreditCardAdapter("apiKey-123"); // GatewayTwo

        CheckoutService virtualAccountCheckout = new CheckoutService(virtualAccount);
        CheckoutService creditCardCheckout = new CheckoutService(creditCard);

        virtualAccountCheckout.checkout(10);
        creditCardCheckout.checkout(10);

    }
}
