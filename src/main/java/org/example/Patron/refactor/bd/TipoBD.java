package org.example.Patron.refactor.bd;

public abstract class TipoBD {
    private String nombre;
    private String apellido;

    public String tipoBD(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        return nombre + apellido;
    }

    public abstract void tipoBd();
}
