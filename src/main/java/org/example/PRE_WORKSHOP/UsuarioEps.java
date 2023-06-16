package org.example.PRE_WORKSHOP;

public class UsuarioEps extends Usuario {

    public UsuarioEps(String nombre, String apellido, int cedula, String email) {
        super(nombre, apellido, cedula, email);
    }

    @Override
    public String obtenerTipo() {
        return "EPS";
    }
}
