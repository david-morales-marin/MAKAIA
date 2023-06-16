package org.example.PRE_WORKSHOP;

public abstract class Especialidad {

    private String nombre;
    private int codigo;
    private String especialidad;

    public abstract String espMedicinaGeneral();

    public abstract String espMedicinaInterna();

    public abstract String espMedicinaDeporte();

    public Especialidad(String nombre, int codigo, String especialidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.especialidad = especialidad;
    }
}
