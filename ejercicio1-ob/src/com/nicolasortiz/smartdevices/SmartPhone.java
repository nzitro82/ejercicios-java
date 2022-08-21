package com.nicolasortiz.smartdevices;

public class SmartPhone {
    String operativeSystem;
    boolean hasNFC;

    public SmartPhone() {}

    public SmartPhone(String operativeSystem, boolean hasNFC) {
        this.operativeSystem = operativeSystem;
        this.hasNFC = hasNFC;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "operativeSystem='" + operativeSystem + '\'' +
                ", hasNFC=" + hasNFC +
                '}';
    }
}
