package org.example.PRE_WORKSHOP;

public abstract class Usuario {
    private String nombre;
    private String apellido;
    private int cedula;
    private String email;

    public Usuario(String nombre, String apellido, int cedula, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.email = email;
    }

    public abstract String obtenerTipo();
}