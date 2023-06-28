package org.example.refactor.bd;

public class Oracle extends TipoBD{


    @Override
    public String tipoBD(String nombre, String apellido) {
        return super.tipoBD(nombre, apellido);
    }

    @Override
    public void tipoBd() {
        System.out.println("Utilizando la bd Oracle");
    }
}
