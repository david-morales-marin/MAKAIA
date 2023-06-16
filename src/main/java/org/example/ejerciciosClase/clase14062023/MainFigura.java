package org.example.ejerciciosClase.clase14062023;

public class MainFigura {
    public static void main(String[] args) {
        Figura triangulo1 = new Triangulo("rojo", 4.0,5.0);
        Figura cuadrado1 = new Cuadrado("verde", 4.0);

        System.out.println(triangulo1.calcularArea());
        System.out.println(triangulo1.getColor());

        System.out.println(cuadrado1.calcularArea());
        System.out.println(cuadrado1.getColor());

    }
}
