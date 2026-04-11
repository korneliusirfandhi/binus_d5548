package fla_2510.la83.week03.payment;

import java.math.BigDecimal;
import java.util.Date;

public class VirtualAccountProcessor implements PaymentProcessor, IssuerProcessor {

    @Override
    public void pay() {
        System.out.println("Payment using Virtual Account");
    }

    @Override
    public void notifyPaymentToIssuer(BigDecimal amount) {

    }

    @Override
    public void doSettlement(Date settlementData) {

    }
}
