package org.example.PRE_WORKSHOP;

public class MainHospital {
    public static void main(String[] args) {

        Usuario usuario = new UsuarioEps("david","morales",111,"edad");
        usuario.obtenerTipo();
        System.out.println(usuario.obtenerTipo());


    }
}
