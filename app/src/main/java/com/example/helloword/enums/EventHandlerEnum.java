package com.example.helloword.enums;

public enum EventHandlerEnum {
    PHONE("Phone"),
    GENDER("Gender"),
    STAR("Star"),
    COUNTRY("Country"),
    SCHOOL("School")
    ;
    private String valua;

    EventHandlerEnum(String valua) {
        this.valua = valua;
    }

    public String getValua() {
        return valua;
    }

    public void setValua(String valua) {
        this.valua = valua;
    }
}
