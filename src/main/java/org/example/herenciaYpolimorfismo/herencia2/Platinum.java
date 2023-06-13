package org.example.herenciaYpolimorfismo.herencia2;

public class Platinum extends TarjetaCredito{
    public Platinum(String emisor, long cupo, String numeroTarjeta, int cvv, String fechaVencimiento) {
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
    }
}
