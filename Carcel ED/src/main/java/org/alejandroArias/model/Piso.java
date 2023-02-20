package org.alejandroArias.model;

import java.util.ArrayList;
import java.util.Collection;

public class Piso {

    private ArrayList<Pasillo> celdas;

    public Piso() {
        celdas = new ArrayList<>(4);
    }

    public ArrayList<Pasillo> getCeldas() {
        return celdas;
    }

    public void setCeldas(ArrayList<Pasillo> celdas) {
        this.celdas = celdas;
    }

    public void addCelda(Pasillo celda) {
        celdas.add(celda);
    }

    public void removeCelda(Pasillo celda) {
        celdas.remove(celda);
    }

    public void removeCelda(int index) {
        celdas.remove(index);
    }

    @Override
    public String toString() {
        return "Piso{" +'\n'+
                "celdas=" + celdas +
                '}'+'\n';
    }

    public ArrayList<Prisionero> getPrisionerosMayotEdad(int edad, ArrayList<Prisionero> prisioneros, int index) {

        if(index == celdas.size() ) return prisioneros;
        prisioneros.addAll(celdas.get(index).getPrisionerosMayorEdad(edad, new ArrayList<>(), 0));
        return getPrisionerosMayotEdad(edad, prisioneros, index+1);

    }
}
