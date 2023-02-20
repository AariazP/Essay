package org.alejandroArias.model;

import java.util.ArrayList;

public class Carcel {


    private ArrayList<Piso> pisos;

    public Carcel() {
        pisos = new ArrayList<>(4);
    }

    public ArrayList<Piso> getpisos() {
        return pisos;
    }

    public void setpisos(ArrayList<Piso> pisos) {
        this.pisos = pisos;
    }

    public void addPiso(Piso piso) {
        pisos.add(piso);
    }

    public void removePiso(Piso piso) {
        pisos.remove(piso);
    }

    public void removePiso(int index) {
        pisos.remove(index);
    }


    public void addAll(ArrayList<Prisionero> prisioneros) {
        int index = 0;
        for (int i = 0; i < 4; i++) {
            Piso piso = new Piso();
            for (int j = 0; j < 4; j++) {
                Pasillo pasillo = new Pasillo();
                for (int k = 0; k < 4; k++) {
                    pasillo.addPrisionero(prisioneros.get(index));
                    index++;
                }
                piso.addCelda(pasillo);
            }
            pisos.add(piso);
        }
    }

    @Override
    public String toString() {
        return "Carcel{" +
                "pisos=" + pisos +
                '}';
    }

    public ArrayList<Prisionero> getPrisionerosMayorEdad(int edad, ArrayList<Prisionero> lista, int index) {

        if(index == pisos.size()) return lista;
        lista.addAll(pisos.get(index).getPrisionerosMayotEdad(edad, new ArrayList<>(), 0));
        return getPrisionerosMayorEdad(edad, lista, index+1);

    }
}
