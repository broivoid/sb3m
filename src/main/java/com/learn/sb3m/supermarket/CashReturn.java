package com.learn.sb3m.supermarket;

import java.math.BigDecimal;

public class CashReturn extends CashSuper{

    private BigDecimal moneyCondition = BigDecimal.ZERO;
    private BigDecimal moneyReturn = BigDecimal.ZERO;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = new BigDecimal(moneyCondition);
        this.moneyReturn = new BigDecimal(moneyReturn);
    }

    @Override
    BigDecimal acceptCash(BigDecimal money) {
        BigDecimal result = money;
        if (money.compareTo(moneyCondition) > -1) {
            result = money.subtract(moneyReturn);
        }
        return result;
    }
}
