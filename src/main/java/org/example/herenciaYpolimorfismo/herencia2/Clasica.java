package org.example.herenciaYpolimorfismo.herencia2;

public class Clasica extends TarjetaCredito{
    public Clasica(String emisor, long cupo, String numeroTarjeta, int cvv, String fechaVencimiento) {
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
    }
}
