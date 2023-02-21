package com.example.helloword.enums;

public enum CalculationEnum {
    PLUS("cộng"),
    MINUS("trừ"),
    MULTIPLY("nhân"),
    DIVISION("chia")
    ;
    private String value;

    CalculationEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
