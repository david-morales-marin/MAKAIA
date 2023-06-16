package org.example.PRE_WORKSHOP;

public class UsuarioParticular extends Usuario{
    public UsuarioParticular(String nombre, String apellido, int cedula, String email) {
        super(nombre, apellido, cedula, email);
    }

    @Override
    public String obtenerTipo() {
        return "PARTICULAR";
    }
}
