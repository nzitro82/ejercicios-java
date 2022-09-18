package com.nicolasortiz.sesion789;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraysList {
    public static void main(String[] args) {
        //5 Array list tipo String
        ArrayList<String> array4String = new ArrayList<String>();

        array4String.addAll(List.of("Item1","Item2","Item3","Item4"));

        LinkedList<String> linkedList = new LinkedList<>(array4String);

        for(int i=0;i<linkedList.size();i++){
            System.out.println("Array List -> " + array4String.get(i));
            System.out.println("Linked List -> " + linkedList.get(i));
        }

        //6 Array list integer
        ArrayList<Integer> arrayInt = new ArrayList<>();

        for(int i=0;i<10;i++){
            arrayInt.add(i+1);
        }

        for(int i=0;i<arrayInt.size();i++){
            if(arrayInt.get(i)%2 == 0){
                arrayInt.remove(i);
            }
            if(arrayInt.size() > i){
                System.out.println("Valores impares " + arrayInt.get(i));
            }

        }
    }
}
