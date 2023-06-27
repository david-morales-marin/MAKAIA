package org.example.EjerciciosPracticos.EjercicioFactoryTipoPago;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

public class TipoPago {

    public Pago tipoPagoUsar(Pago pago){
        if(pago == null){
            throw new IllegalArgumentException("El tipo de pago es nulo");
        }
        switch (pago){
            case "applePlay":
                return new PagoApplePlay();
            case "Bitcon":
                return new PagoBitcoin();
            case "Efectivo":
                return new PagoEfectivo();
            case "google play":
                return new PagoGooglePlay();
            case "payplay":
                return new PagoPaypal();
            case "tarjeta credito":
                return new PagoTarjetaCredito();
            case "tarjeta debito":
                return new PagoTarjetaDebito();
            case "transferencia":
                return new PagoTransferenciaBancaria();
            default:
                throw new IllegalArgumentException("El tipo de pago no existe");
        }
    }
}
