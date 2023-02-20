package org.alejandroArias.model;

public class Prisionero implements Cloneable{

    private String nombre;
    private int edad;

    public Prisionero(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public Prisionero clone() {
        try {
            return (Prisionero) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return '\n'+"Prisionero{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}'+'\n';
    }


    public boolean isMore45(int edad) {
        return this.edad > edad;
    }
}
