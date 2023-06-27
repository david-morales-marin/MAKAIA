package org.example.EjerciciosPracticos.EjercicioFactoryTipoPago;

public class PagoTransferenciaBancaria implements Pago{
    @Override
    public  void tipoPago(){
        System.out.println("Pago por transferencia bancaria");
    }
}
