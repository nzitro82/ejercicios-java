package com.nicolasortiz.smartdevices;

public class SmartDeviceMain {
    public static void main(String[] args) {
        SmartDevice smart = new SmartDevice();

        SmartDevice smart2 = new SmartDevice("black",
                "Galaxy",
                "Samsung",
                10.50,
                250.00,
                true,
                "1.3 (33mm), Circular Super AMOLED (360 x 360)",
                "Exynos 9110 Dual core 1.15GHz",
                "4 GB Memoria interna",
                "472 mAh");

    SmartPhone smartPhone = new SmartPhone("Android 7.1.1", true);

        System.out.println("Smart Device " + smart.toString());

        System.out.println("Smart Device 2 " + smart2.toString());

        System.out.println("Smart Phone " + smartPhone.toString());
    }
}
