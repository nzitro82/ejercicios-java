package com.nicolasortiz.sesion789;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class CopiaArchivos {

    public static void copiaArchivos(InputStream fileIn, PrintStream fileOut) {
        try {
            byte[] datos = fileIn.readAllBytes();
            fileOut.write(datos);
        } catch (Exception e){
            System.out.println("Error al copiar fichero " + e.getMessage());
        }

    }

    public static void main(String[] args) {

        //8 Copia de archivos
        try {
            InputStream fileIn = new FileInputStream("C:\\Users\\nzsol\\Documents\\Origen.txt");
            PrintStream fileOut = new PrintStream("C:\\Users\\nzsol\\Documents\\Destino.txt");
            copiaArchivos(fileIn,fileOut);
        } catch (Exception e){
            System.out.println("Error al crear archivos " + e.getMessage());
        }
    }
}
