package org.example.EjerciciosPracticos.EjercicioFactoryTipoPago;

import org.example.EjerciciosPracticos.EjercicioFactoryTipoPago.Pago;

public class PagoApplePlay implements Pago {
    @Override
    public  void tipoPago(){
        System.out.println("Pago por apple play");
    }
}
