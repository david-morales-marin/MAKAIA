package org.example.ejerciciosClase.clase14062023;

public abstract class Figura {

    private String color;

    public Figura(String color){
        this.color = color;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public  void calculadoraPrueba(){
        System.out.println("clase no abstracta. ");
    };

    public String getColor() {
        return color;
    }
}
