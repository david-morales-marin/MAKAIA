package org.example.workshop3;
//La embarcación además de tener asociado
// un capitán, tiene un precio base, un
// valor adicional, un año de fabricación y
// la longitud en metros que se denomina eslora.
public class Embarcacion extends Capitan {

  //  private Capitan capitan;
    private double precioBase;
    private double valorAdicional;
    private int anoFabricacion;
    private int eslora;

    public double getPrecioBase() {
        return precioBase;
    }

    public Embarcacion(String nombre, String apellido, int matriculaNav, double precioBase, double valorAdicional, int anoFabricacion, int eslora) {
        super(nombre, apellido, matriculaNav);
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anoFabricacion = anoFabricacion;
        this.eslora = eslora;
    }

    //Dada cualquier embarcación el sistema debe
    // permitir calcular el monto del alquiler.
    // El monto monto del alquiler es el valor
    // base y si el año de fabricación es mayor
    // al 2020, se le suma un valor adicional de 20.000.

    public double montoAlquilar(){

        if(anoFabricacion > 2020 ){
            return precioBase + 20000;
        }else{
            return precioBase;
        }

    }

}
