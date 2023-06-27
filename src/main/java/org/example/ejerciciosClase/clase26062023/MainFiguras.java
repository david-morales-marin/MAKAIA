package org.example.ejerciciosClase.clase26062023;

public class MainFiguras {
    public static void main(String[] args) {

      /*  Circulo circulo = new Circulo();
        Cuadrado cuadrado = new Cuadrado();
        Rectangulo rectangulo = new Rectangulo();

        System.out.println(circulo.dibujar());
        System.out.println(cuadrado.dibujar());
        System.out.println(rectangulo.dibujar()); */

        FiguraGeometrica figura = FactoriaFigura.obteberFiguraGeometrica("rectangulo");
        System.out.println(figura.dibujar());

    }
}
