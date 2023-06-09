package org.example.herenciaYpolimorfismo.herenciaEjecicio2;

import java.time.LocalDate;

public class MainTarjetaCredito {
    //Asignar cupo, número de tarjeta, cvv y fecha de vencimiento
    // para cada tipo de tarjeta de crédito.
    //Ejecutar el método imprimir para cada caso.
    public static void main(String[] args) {
        Clasica clasica = new Clasica("visa",400000, "1234567", 345, "2024-08-23");
        LocalDate.parse(clasica.getFechaVencimiento());

        Black black = new Black();
        black.setEmisor("american expres");
        black.setCupo(90000);
        black.setNumeroTarjeta("987654");
        black.setCvv(980);
        black.setFechaVencimiento("2026-09-30");
        LocalDate.parse(black.getFechaVencimiento());

        Dorada dorada = new Dorada();
        dorada.setEmisor("master card");
        dorada.setCupo(450000);
        dorada.setNumeroTarjeta("918273645");
        dorada.setCvv(742);
        dorada.setFechaVencimiento("2029-12-30");
        LocalDate.parse(dorada.getFechaVencimiento());

        Platinum platinum = new Platinum("american gold",750000,"81276345",652,"2030-05-15");
        LocalDate.parse(platinum.getFechaVencimiento());

        clasica.imprimir();
        dorada.imprimir();
        black.imprimir();
        platinum.imprimir();


    }
}
