package org.example.Patron.Builder;

public class MainBuilder {
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaBuilder()
                .coNumeroCuenta(879456L)
                .coSaldo(200)
             //   .conDueno("David")
                .coTipoCuenta("Corriente")
                .build();
        System.out.println(cuenta.getNumeroCuenta());
        System.out.println(cuenta.getNombreDueno());
    }
}
