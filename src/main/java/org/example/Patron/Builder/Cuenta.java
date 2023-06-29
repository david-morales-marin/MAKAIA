package org.example.Patron.Builder;

public class Cuenta {
    private Long numeroCuenta;
    private String nombreDueno;
    private Double saldo;
    private String tipoCuenta;

    public Cuenta(Long numeroCuenta, String nombreDueno, Double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.nombreDueno = nombreDueno;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public Long getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }
}
