package com.nicolasortiz;

public class ConcatenaTexto {
    public static void main(String[] args) {
        String[] nombres = {"Mario","Laura","Javier","Marcela"};
        String resultado = "";

        for(int i=0; i < nombres.length; i++){
            resultado = resultado + " " + nombres[i];
        }

        System.out.println("Nombres concatenados: " + resultado.trim());
    }
}
