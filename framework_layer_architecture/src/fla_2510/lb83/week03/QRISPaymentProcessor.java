package fla_2510.lb83.week03;

import java.math.BigDecimal;

// java support implement > 1 interface
public class QRISPaymentProcessor implements PaymentProcessor, IssuerProcessor {
    @Override
    public void process() {
        System.out.println("QRIS Payment.");
    }

    @Override
    public void settlement(BigDecimal amount) {

    }

    @Override
    public void doNotify() {

    }
}
