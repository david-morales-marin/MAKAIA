package org.example.PRE_WORKSHOP;

public abstract class Usuario {
    private String nombreUsuario;
    private String apellidoUsuario;
    private int cedulaUsuario;
    private String emailUsuario;

    public Usuario(String nombreUsuario, String apellidoUsuario, int cedulaUsuario, String emailUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.cedulaUsuario = cedulaUsuario;
        this.emailUsuario = emailUsuario;
    }

    public abstract String obtenerTipo();
}