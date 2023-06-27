package org.example.EjerciciosPracticos.EjercicioFactoryTipoPago;

public class PagoTarjetaDebito implements  Pago{
    @Override
    public  void tipoPago(){
        System.out.println("Pago con tarjeta debito");
    }
}
