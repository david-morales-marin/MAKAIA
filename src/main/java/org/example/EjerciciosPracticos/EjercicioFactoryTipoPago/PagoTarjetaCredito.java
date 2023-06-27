package org.example.EjerciciosPracticos.EjercicioFactoryTipoPago;

public class PagoTarjetaCredito implements Pago{
    @Override
    public  void tipoPago(){
        System.out.println("Pago con tarjeta de credito");
    }
}
