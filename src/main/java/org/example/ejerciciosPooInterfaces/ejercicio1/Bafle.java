package org.example.ejerciciosPooInterfaces.ejercicio1;

//Además, debes crear al menos dos clases que implementen
// la interfaz "ReproductorMusica" y representen diferentes
// tipos de reproductores de música. Cada clase debe tener
// un atributo para almacenar el nombre del reproductor
// y debe implementar los métodos definidos en la interfaz.
public class Bafle implements ReproductorMusica {

    private String nombre;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Bafle(String nombre) {
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

    @Override
    public String toString() {
        return "El reproductor es: " + nombre  ;
    }
}
