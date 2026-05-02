package fla_2510.lb83.week08.adapter;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor virtualAccount = new VirtualAccountAdapter("8201239032");
        PaymentProcessor creditCard = new CardAdapter("api_key_12345");

        CheckoutService checkoutVA = new CheckoutService(virtualAccount);
        CheckoutService checkoutCC = new CheckoutService(creditCard);
        checkoutVA.doCheckout(50000.0);
        checkoutCC.doCheckout(50000.0);
    }
}
