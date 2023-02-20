package org.alejandroArias.model;

import java.util.ArrayList;
import java.util.Collection;

public class Pasillo {

    private ArrayList<Prisionero> prisioneros;

    public Pasillo() {
        prisioneros = new ArrayList<>(4);
    }

    public ArrayList<Prisionero> getPrisioneros() {
        return prisioneros;
    }

    public void setPrisioneros(ArrayList<Prisionero> prisioneros) {
        this.prisioneros = prisioneros;
    }

    public void addPrisionero(Prisionero prisionero) {
        prisioneros.add(prisionero);
    }

    public void removePrisionero(Prisionero prisionero) {
        prisioneros.remove(prisionero);
    }

    public void removePrisionero(int index) {
        prisioneros.remove(index);
    }

    @Override
    public String toString() {
        return '\n'+ "Pasillo{" +
                '\n'+"prisioneros=" + prisioneros +
                '}'+'\n';
    }

    public ArrayList<Prisionero> getPrisionerosMayorEdad(int edad, ArrayList<Prisionero> Prisioneros, int index) {

        if(index == prisioneros.size()) return Prisioneros;

        if(prisioneros.get(index).isMore45(edad)) Prisioneros.add(prisioneros.get(index));

        return getPrisionerosMayorEdad(edad, Prisioneros, index+1);
    }
}
