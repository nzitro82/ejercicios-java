package com.nicolasortiz;

public class Precios {
    public static void main(String[] args) {
        System.out.println("Precio con IVA incluido: " + getPrice(150.55, 21));
    }

    static double getPrice(double price, double iva) {
        return price * (1 + (iva / 100));
    }
}
