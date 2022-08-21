package com.nicolasortiz.smartdevices;

public class SmartDevice {
    String color;
    String model;
    String maker;
    double large;
    double weigth;
    boolean hasBluetooth;
    String screen;
    String processor;
    String memory;
    String battery;

    public SmartDevice() {}

    public SmartDevice(String color, String model, String maker, double large, double weigth, boolean hasBluetooth, String screen, String processor, String memory, String battery) {
        this.color = color;
        this.model = model;
        this.maker = maker;
        this.large = large;
        this.weigth = weigth;
        this.hasBluetooth = hasBluetooth;
        this.screen = screen;
        this.processor = processor;
        this.memory = memory;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", maker='" + maker + '\'' +
                ", large=" + large +
                ", weigth=" + weigth +
                ", hasBluetooth=" + hasBluetooth +
                ", screen='" + screen + '\'' +
                ", processor='" + processor + '\'' +
                ", memory='" + memory + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }
}
