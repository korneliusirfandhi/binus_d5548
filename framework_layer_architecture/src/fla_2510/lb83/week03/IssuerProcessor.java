package fla_2510.lb83.week03;

import java.math.BigDecimal;

public interface IssuerProcessor {
    void settlement(BigDecimal amount);
    void doNotify();
}
