package org.example.workshop3;
//Existen dos variaciones de embarcaciones
// que alquila MAKAI. Ambas con las
// características que se describieron, pero
// cada una tiene además otras características.
// Los veleros tienen cantidad
//de mástiles y los yates cantidad de camarotes.
public class Veleros extends Embarcacion {

    private int cantMastiles;

    public Veleros(String nombre, String apellido, int matriculaNav, double precioBase, double valorAdicional, String anoFabricacion, int eslora, int cantMastiles) {
        super(nombre, apellido, matriculaNav, precioBase, valorAdicional, anoFabricacion, eslora);
        this.cantMastiles = cantMastiles;
    }
}
