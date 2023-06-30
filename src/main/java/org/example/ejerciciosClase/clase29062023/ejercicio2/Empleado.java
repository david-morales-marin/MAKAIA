package org.example.ejerciciosClase.clase29062023.ejercicio2;

public class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void imprimir(Imprimir imprimir){

        System.out.println("El empleado " + nombre + "realizo la impresión número " + Imprimir.getInstance(imprimir.getImpresiones()));
    }
}
