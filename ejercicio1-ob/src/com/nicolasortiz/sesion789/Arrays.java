package com.nicolasortiz.sesion789;

public class Arrays {
    public static void main(String[] args) {
        String[] arrayUnidim = new String[5];

        for(int i=0; i<arrayUnidim.length; i++){
            arrayUnidim[i] = "Item" + (i+1);
        }

        System.out.println("-------------ARRAY UNIDIMENSIONAL---------------------");
        for(String item: arrayUnidim){
            System.out.println(item);
        }

        //2 ARRAY BIDIMENSIONAL
        int[][] biDimString = new int[5][5];

        for(int row=0; row<arrayUnidim.length; row++) {
            for(int col=0; col<arrayUnidim.length; col++){
                biDimString[row][col] = (row + col);
            }
        }

        System.out.println("-------------ARRAY BIDIMENSIONAL---------------------");
        for(int row=0; row<arrayUnidim.length; row++) {
            for(int col=0; col<arrayUnidim.length; col++){
                System.out.println("Fila - Columna " + row + " - " + col + " Valor " + biDimString[row][col]);
            }
        }
    }
}
