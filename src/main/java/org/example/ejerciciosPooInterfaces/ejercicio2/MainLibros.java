package org.example.ejerciciosPooInterfaces.ejercicio2;
//Finalmente, en el método principal de tu programa,
// crea al menos dos instancias de la clase Libro
// con diferentes títulos, autores y precios. Utiliza los
// métodos de las interfaces para mostrar
// la información y obtener el precio de cada libro.
public class MainLibros {
    public static void main(String[] args) {
        Libro libro1 = new Libro("asi hablo zaratustra", "Nietzsche", 200.000);
        Libro libro2 = new Libro("Crimen y castigo", "dostovkysky", 350.000);

        libro1.mostrarInformacion();
        libro1.obtenerPrecio(libro1.getPrecioLibro());
        libro2.mostrarInformacion();
        libro2.obtenerPrecio(libro2.getPrecioLibro());

    }
}
