package org.example.EjerciciosPracticos.EjercicioFactoryTipoPago;

public class MainPago {
    public static void main(String[] args) {
        Pago pago = TipoPago.tipoPagoUsar("Tarjeta credito");
        pago.tipoPago();
    }
}
