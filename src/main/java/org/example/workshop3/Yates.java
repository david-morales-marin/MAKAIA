package org.example.workshop3;
//Existen dos variaciones de embarcaciones
// que alquila MAKAI. Ambas con las
// características que se describieron, pero
// cada una tiene además otras características.
// Los veleros tienen cantidad
//de mástiles y los yates cantidad de camarotes.
public class Yates extends Embarcacion {

    private int cantCamarotes;

    public Yates(String nombre, String apellido, int matriculaNav, double precioBase, double valorAdicional, int anoFabricacion, int eslora, int cantCamarotes) {
        super(nombre, apellido, matriculaNav, precioBase, valorAdicional, anoFabricacion, eslora);
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public double montoAlquilar() {
        return super.montoAlquilar();
    }
}
