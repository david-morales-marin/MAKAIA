package org.example.ejerciciosClase.clase29062023.ejercicio2;

public class MainImprimir {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("david");
        Empleado empleado1 = new Empleado("ambrosio");

        Imprimir imprimir = Imprimir.getInstance(2);
        System.out.println(imprimir.getImpresiones());

        Imprimir imprimir1 = Imprimir.getInstance(1);
        System.out.println(imprimir1.getImpresiones());
    }
}
