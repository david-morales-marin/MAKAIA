package org.example.ejerciciosPooInterfaces.ejercicio1;

public class Computador implements ReproductorMusica {
    private String nombre;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Computador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void reproductorMusica() {
        System.out.println("La musica se esta reproducciendo desde el " + nombre);
    }

    @Override
    public void pausarMusica() {
        System.out.println("La musica se esta pausando desde el " + nombre);
    }

    @Override
    public void detenerMusica() {
        System.out.println("La musica se esta deteniendo desde el " + nombre);
    }


}
