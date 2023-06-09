package org.example.herenciaYpolimorfismo.herenciaEjecicio2;

import java.time.LocalDate;

public class Platinum extends TarjetaCredito{
    public Platinum(String emisor, long cupo, String numeroTarjeta, int cvv, String fechaVencimiento) {
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
    }
}
