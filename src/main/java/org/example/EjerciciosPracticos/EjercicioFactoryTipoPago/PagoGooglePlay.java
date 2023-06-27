package org.example.EjerciciosPracticos.EjercicioFactoryTipoPago;

public class PagoGooglePlay implements  Pago{
    @Override
    public  void tipoPago(){
        System.out.println("Pago por Google play");
    }
}
