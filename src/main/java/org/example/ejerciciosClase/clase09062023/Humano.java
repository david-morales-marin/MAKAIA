package org.example.ejerciciosClase.clase09062023;

public class Humano implements InterfazGeneral , InterfazAccionesHumanas{

    public int cedula;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void razonar(){
        System.out.println("El humano esta razonando, desde la clase Humano");
    }

    @Override
    public void desplazarse() {

    }

    @Override
    public void hablar() {

    }

    @Override
    public void jugar() {

    }

    @Override
    public void alimentarse() {

    }

    @Override
    public void dormir() {

    }

    @Override
    public void bailar() {
        System.out.println(nombre + " esta bailando");
    }

    @Override
    public void trabajar(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        System.out.println(nombre + " esta trabajando" + cedula);
    }

    @Override
    public void estudiar() {
        System.out.println(nombre + " esta estudiando");
    }
}
