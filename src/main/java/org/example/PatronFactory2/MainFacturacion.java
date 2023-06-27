package org.example.PatronFactory2;

public class MainFacturacion {
    public static void main(String[] args) {

        Facturacion facturacion = CalcularFacturacion.calcularValorIva(90);
       facturacion.calcular();

    }
}
