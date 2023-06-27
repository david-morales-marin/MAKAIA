package org.example.EjerciciosPracticos.EjercicioFactoryTipoPago;

public class PagoBitcoin implements Pago{
    @Override
    public  void tipoPago(){
        System.out.println("Pago por Bitcoin");
    }
}
