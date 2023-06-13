package org.example.herenciaYpolimorfismo.herencia3;

public class MainFigurasGeometricas {
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo();
        System.out.println("el area del triangulo es: " + triangulo.calcularAreaTriangulo(3,10));

        Cuadrado cuadrado = new Cuadrado();
        System.out.println("el areal del cuadrado es: " + cuadrado.calcularAreaCuadrado(8));

    }
}
