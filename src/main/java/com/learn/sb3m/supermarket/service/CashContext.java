package com.learn.sb3m.supermarket.service;

import com.learn.sb3m.supermarket.domain.types.SaleTypeEnum;

import java.math.BigDecimal;

public class CashContext {

    CashSuper cs = null;

    public CashContext(String type) {
        switch (SaleTypeEnum.getByType(type)) {
            case NORMAL:
                CashNormal cs0 = new CashNormal();
                cs = cs0;
                break;
            case RETURN:
                CashReturn cs1 = new CashReturn("100", "10");
                cs = cs1;
                break;
            case REBATE:
                CashRebate cs2 = new CashRebate("0.8");
                cs = cs2;
                break;
        }
    }

    public BigDecimal getResult(BigDecimal money) {
        return cs.acceptCash(money);
    }
}
