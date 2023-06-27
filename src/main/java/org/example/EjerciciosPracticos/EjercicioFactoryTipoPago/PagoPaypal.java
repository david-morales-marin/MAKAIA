package org.example.EjerciciosPracticos.EjercicioFactoryTipoPago;

public class PagoPaypal implements Pago{
    @Override
    public  void tipoPago(){
        System.out.println("Pago por Paypal");
    }
}
