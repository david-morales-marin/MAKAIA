package org.example.ejerciciosPooInterfaces.ejercicio2;
//Luego, crea una clase llamada Libro que represente un
// libro y implemente ambas interfaces. La clase debe tener
// atributos para almacenar el
// título, autor y precio del libro, y debe implementar
// los métodos definidos en las interfaces.
public class Libro implements Mostrable, Vendible{

    private String libro;
    private String autor;
    private Double precioLibro;

    public Libro(String libro, String autor, Double precioLibro) {
        this.libro = libro;
        this.autor = autor;
        this.precioLibro = precioLibro;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getPrecioLibro() {
        return precioLibro;
    }

    public void setPrecioLibro(Double precioLibro) {
        this.precioLibro = precioLibro;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Titulo:" + libro + '\'' +
                            "Autor " + autor + '\'' +
                            "precio " + precioLibro + '\'' );
    }

    @Override
    public double obtenerPrecio(double precioLibro) {
        System.out.println("El precio del libro es de: " + precioLibro);
        return precioLibro;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "libro='" + libro + '\'' +
                ", autor='" + autor + '\'' +
                ", precioLibro=" + precioLibro +
                '}';
    }
}
