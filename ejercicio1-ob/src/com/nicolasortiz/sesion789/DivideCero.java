package com.nicolasortiz.sesion789;

public class DivideCero {
    //7 Divide por cero
    public static int dividePorCero(int a, int b){
        try {
            return a / b;
        }
        catch (ArithmeticException e){
            throw new ArithmeticException();
        }

    }

    public static void main(String[] args) {
        //7 Divide por cero
        try{
            dividePorCero(3,0);
            System.out.println("Demo de código");
        }
        catch (Exception e) {
            System.out.println("Esto no puede hacerse");
        }
    }
}
