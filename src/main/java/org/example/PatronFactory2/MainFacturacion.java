package org.example.PatronFactory2;

public class MainFacturacion {
    public static void main(String[] args) {

        CalcularFacturacion calculo = new CalcularFacturacion(158);
        Facturacion facturacion = calculo.calcular(100);
        System.out.println(facturacion );
       // facturacion.

    }
}
