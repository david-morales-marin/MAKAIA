package org.example.workshop3;
//La embarcación además de tener asociado
// un capitán, tiene un precio base, un
// valor adicional, un año de fabricación y
// la longitud en metros que se denomina eslora.
public class Embarcacion extends Capitan {

  //  private Capitan capitan;
    private double precioBase;
    private double valorAdicional;
    private String anoFabricacion;
    private int eslora;

    public Embarcacion(String nombre, String apellido, int matriculaNav, double precioBase, double valorAdicional, String anoFabricacion, int eslora) {
        super(nombre, apellido, matriculaNav);
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anoFabricacion = anoFabricacion;
        this.eslora = eslora;
    }

}
