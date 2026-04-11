package fla_2510.la83.week03.payment;

import java.math.BigDecimal;
import java.util.Date;

public interface IssuerProcessor {
    void notifyPaymentToIssuer(BigDecimal amount);
    void doSettlement(Date settlementData);
}
