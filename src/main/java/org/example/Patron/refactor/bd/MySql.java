package org.example.Patron.refactor.bd;

public class MySql extends TipoBD{

    @Override
    public String tipoBD(String nombre, String apellido) {
        return super.tipoBD(nombre, apellido);
    }

    @Override
    public void tipoBd() {
        System.out.println("Utilizando la bd MySql");
    }
}
