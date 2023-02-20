package org.example.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        int[] lista = new int[] {1,2,3,4,5};
        arias(lista, 0);
        System.out.print("[" );
        for (int i=0; i<lista.length; i++){
            if(i != lista.length-1) System.out.print(lista[i]+",");
            else System.out.print(lista[i]);
        }
        System.out.println("]");
    }


    public static int arias(int[] lista, Integer index){
        int numero;
        if(index<lista.length){
            numero = lista[index];
            index = arias(lista, ++index);
        }else return 0;
        lista[index] = numero;
        return ++index;
    }




    public static int addZeroes(ArrayList<Integer> lista, int index, int suma){
        int sum;
        if (index < lista.size()){
            sum = addZeroes(lista, 1+index, suma+lista.get(index));
        }else return suma;

        if(Objects.equals(sum, lista.get(index))){
            lista.add(index+1, 0);
        }

        return sum;
    }





}