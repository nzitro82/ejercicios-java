package com.nicolasortiz.cochescrud;

public class CocheMain {
    public static void main(String[] args) {
        Coche coche = new Coche("123456","Mustang","2020","Ford");
        CocheCRUDImpl cocheCrud = new CocheCRUDImpl();

        cocheCrud.findAll();

        cocheCrud.save(coche);

        cocheCrud.delete("123456");
    }
}
