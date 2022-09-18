package com.nicolasortiz.sesion789;

import java.util.Vector;

public class Vectores {
    public static void main(String[] args) {
        //3 Vectores
        System.out.println("-------------VECTORES---------------------");
        Vector<String> vectorString = new Vector(5);

        vectorString.add("Vec1");
        vectorString.add("Vec2");
        vectorString.add("Vec3");
        vectorString.add("Vec4");
        vectorString.add("Vec5");

        for(int i = 0; i < vectorString.size(); i++){
            if(i == 1 || i == 2){
                vectorString.remove(i);
            }
        }

        System.out.println("RESULTADO VECTOR " + vectorString);

        //4 El problema se presenta ya que al momento de exceder la capacidad por defecto se realiza una copia del mismo con todos sus elementos,
        // para ampliar la capacidad del vector.Esto genera una operación muy costosa
    }
}
