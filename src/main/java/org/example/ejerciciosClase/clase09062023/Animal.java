package org.example.ejerciciosClase.clase09062023;

public class Animal implements InterfazGeneral{

    private String raza;

    public void cazar(){
            System.out.println("El animal de raza " + raza + " Esta cazando desde la clase animal ");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void desplazarse() {
       System.out.println("El animal de raza " + raza + " Se esta desplazando desde la clase animal ");
    }

    @Override
    public void hablar() {

    }

    @Override
    public void jugar() {
        System.out.println("El animal de raza " + raza + " esta jugando desde la clase animal ");
    }

    @Override
    public void alimentarse() {
       System.out.println("El animal de Raza " + raza + " Se esta alimentando desde la clase animal");
    }

    @Override
    public void dormir() {

    }
}
