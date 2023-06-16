package org.example.ejerciciosClase.clase14062023;

public class Cuadrado extends Figura {

    double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }

    @Override
    public String getColor(){
        return "amarrillo";
    }

}
