package org.example.PRE_WORKSHOP;

public class UsuarioPoliza extends Usuario {

    public UsuarioPoliza(String nombre, String apellido, int cedula, String email) {
        super(nombre, apellido, cedula, email);
    }

    @Override
    public String obtenerTipo() {
        return "POLIZA";
    }
}
