package com.learn.sb3m.supermarket.service;

import java.math.BigDecimal;

public abstract class CashSuper {
    abstract BigDecimal acceptCash(BigDecimal money);
}
