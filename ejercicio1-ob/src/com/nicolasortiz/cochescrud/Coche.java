package com.nicolasortiz.cochescrud;

public class Coche {
    String cocheId;
    String nombre;
    String modelo;
    String fabricante;

    public Coche(String cocheId, String nombre, String modelo, String fabricante) {
        this.cocheId = cocheId;
        this.nombre = nombre;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }
}
