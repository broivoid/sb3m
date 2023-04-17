package com.learn.sb3m.supermarket.service;

import java.math.BigDecimal;

public class CashContext {

    CashSuper cs = null;

    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                CashNormal cs0 = new CashNormal();
                cs = cs0;
                break;
            case "满100返10":
                CashReturn cs1 = new CashReturn("100", "10");
                cs = cs1;
                break;
            case "打8折":
                CashRebate cs2 = new CashRebate("0.8");
                cs = cs2;
                break;
        }
    }

    public BigDecimal getResult(BigDecimal money) {
        return cs.acceptCash(money);
    }
}
