package org.alejandroArias.application;

import org.alejandroArias.model.Carcel;
import org.alejandroArias.model.Prisionero;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Prisionero prisionero = new Prisionero("Alejandro Arias", (int)(Math.random()*100));


        Carcel carcel = new Carcel();
        ArrayList<Prisionero> prisioneros = new ArrayList<>(64);



        for (int i= 0; i < 64; i++) {
            Prisionero clone = prisionero.clone();
            clone.setNombre("Prisionero " +( i+1 ));
            clone.setEdad((int)(Math.random()*100));
            prisioneros.add(clone);
        }

       System.out.println("prisioneros = " + prisioneros);
        
        carcel.addAll(prisioneros);

        ArrayList<Prisionero> listaPrisionerosMayor45 = carcel.getPrisionerosMayorEdad(45, new ArrayList<>(), 0);

        System.out.println("El total de prisioneros mayores a 45 es: "+listaPrisionerosMayor45.size()+"\n"+"listaPrisionerosMayor45 = " + listaPrisionerosMayor45);


    }
}