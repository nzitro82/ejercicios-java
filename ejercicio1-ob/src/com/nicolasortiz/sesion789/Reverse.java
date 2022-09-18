package com.nicolasortiz.sesion789;

public class Reverse {

    //1 Cadena al revés
    public static String reverse(String texto) {
        String finalText = "";
        for(int i = texto.length() - 1; i >= 0; i--){
            finalText += texto.charAt(i);
        }
        return finalText;
    }

    public static void main(String[] args) {
        System.out.println(reverse("Nicolas"));
    }
}
