package com.learn.sb3m.supermarket.domain.types;

public enum SaleTypeEnum {

    NORMAL("1","正常销售"),
    REBATE("2","打折"),
    RETURN("3","满X减Y");

    private String code;
    private String name;

    SaleTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static SaleTypeEnum getByType(String code) {
        for (SaleTypeEnum saleTypeEnum:SaleTypeEnum.values()){
            if(saleTypeEnum.getCode().equals(code)){
                return saleTypeEnum;
            }
        }
        return null;
    }

}
