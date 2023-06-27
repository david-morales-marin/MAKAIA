package org.example.EjerciciosPracticos.EjercicioFactoryTipoPago;

public class PagoEfectivo implements Pago{
    @Override
    public  void tipoPago(){
        System.out.println("Pago en efectivo");
    }
}
