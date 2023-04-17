package com.learn.sb3m.supermarket.service;

import java.math.BigDecimal;

public class CashRebate extends CashSuper {

    private BigDecimal moneyRebate = new BigDecimal(1);

    public CashRebate(String moneyRebate) {
        this.moneyRebate = new BigDecimal(moneyRebate);
    }

    @Override
    BigDecimal acceptCash(BigDecimal money) {
        return money.multiply(moneyRebate);
    }
}
