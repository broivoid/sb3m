package com.learn.sb3m.supermarket;

import java.math.BigDecimal;

public class CashNormal extends CashSuper{

    @Override
    BigDecimal acceptCash(BigDecimal money) {
        return money;
    }
}
