package org.example.Patron.Builder;

public class CuentaBuilder implements Builder{

    private long numeroCuenta;
    private String nombreDueno;
    private Double saldo;
    private String tipoCuenta;

    public CuentaBuilder conDueno(String nombreDueno){
        this.nombreDueno = nombreDueno;
        return this;
    }

    public CuentaBuilder coTipoCuenta(String tipoCuenta){
        this.tipoCuenta = tipoCuenta;
        return this;
    }

    public CuentaBuilder coNumeroCuenta(long numeroCuenta){
        this.numeroCuenta = numeroCuenta;
        return this;
    }

    public CuentaBuilder coSaldo(double saldo){
        this.saldo = saldo;
        return this;
    }
    @Override
    public Cuenta build() {
        return null;
    }
}
