package com.nicolasortiz.sesion789;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculoComisionVta {

    public static void main(String[] args) {

        final double COMISION=0.3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cual es la ruta del archivo de ventas");
        String ruta = scanner.next();
        System.out.println("Cual es el nombre del archivo");
        String nombreArchivo = scanner.next();
        System.out.println("Cual es el nombre del archivo final de comisiones");
        String nombreArchivoComisiones = scanner.next();

        System.out.println(ruta);
        System.out.println(nombreArchivo);

        try {
            InputStream archivoVentas = new FileInputStream(ruta + "\\" + nombreArchivo);
            Scanner ventas = new Scanner(archivoVentas);
            PrintStream archivoComisiones = new PrintStream(ruta + "\\" + nombreArchivoComisiones);
            try {
               HashMap<String,Double> comisionesVentas = new HashMap<>();
                ArrayList registrosVentas = new ArrayList<>();
               while (ventas.hasNextLine()){
                   registrosVentas.add(ventas.nextLine());
               }
               for(int i=1;i<registrosVentas.size();i++){
                   String registroVenta = registrosVentas.get(i).toString();
                   String ejecutivo = registroVenta.split(";")[0];
                   Double importe = Double.parseDouble(registroVenta.split(";")[2]);

                   Double ventaAcumulada = importe;

                  Double ventaEncontrada = comisionesVentas.getOrDefault(ejecutivo,null);
                  if(ventaEncontrada != null){
                      ventaAcumulada = importe + ventaEncontrada;
                  }
                  comisionesVentas.put(ejecutivo, ventaAcumulada);
               }

               for(Map.Entry comisionVenta: comisionesVentas.entrySet() ) {
                   comisionesVentas.put(comisionVenta.getKey().toString(), Double.parseDouble(comisionVenta.getValue().toString()) * COMISION);
                   archivoComisiones.print(comisionVenta.getKey() + ";" + comisionVenta.getValue());
                   archivoComisiones.print("\n");
               }
            } catch (Exception e) {
                System.out.println("No se pudo leer el archivo de ventas " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error de archivo" + e.getLocalizedMessage());
        }



    }
}
