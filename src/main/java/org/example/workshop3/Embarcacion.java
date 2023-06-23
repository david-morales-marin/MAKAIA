package org.example.workshop3;
//La embarcación además de tener asociado
// un capitán, tiene un precio base, un
// valor adicional, un año de fabricación y
// la longitud en metros que se denomina eslora.
public abstract class Embarcacion {

    private Capitan capitan;
    private double precioBase;
    private double valorAdicional;
    private int anoFabricacion;
    private int eslora;

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, int anoFabricacion, int eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anoFabricacion = anoFabricacion;
        this.eslora = eslora;
    }

    //Dada cualquier embarcación el sistema debe
    // permitir calcular el monto del alquiler.
    // El monto del alquiler es el valor base y si
    // el año de fabricación es mayor al 2020, se
    // le suma un valor adicional de 20.000.

    public double montoAlquiler(){

        if(anoFabricacion > 2020){
            return precioBase + 20.000;
        }else{
            return precioBase;
        }
    }

    public abstract void evaluar();

}
