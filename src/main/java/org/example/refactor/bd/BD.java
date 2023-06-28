package org.example.refactor.bd;

public class BD {
    public static TipoBD guardarDatos(String bd) {
        if (bd == null) {
            throw new IllegalArgumentException("ingreso una bd no valida");
        }

        if (bd.toLowerCase() == "a") {
            return new MySql();
        } else if (bd.toLowerCase() == "oracle") {
            return new Oracle();
        }
        throw new IllegalArgumentException("bd ingresa no registradaaaaaa");
    }
}
