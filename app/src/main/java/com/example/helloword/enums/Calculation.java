package com.example.helloword.enums;

public enum Calculation {
    PLUS("cộng"),
    MINUS("trừ"),
    MULTIPLY("nhân"),
    DIVISION("chia")
    ;
    private String value;

    Calculation(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
