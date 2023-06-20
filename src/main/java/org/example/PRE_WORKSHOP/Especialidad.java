package org.example.PRE_WORKSHOP;

public abstract class Especialidad {

    private String nombreEspcialidad;
    private int codigoEspecialidad;
    private String especialidad;

    public abstract String espMedicinaGeneral();

    public abstract String espMedicinaInterna();

    public abstract String espMedicinaDeporte();

    public Especialidad(String nombreEspcialidad, int codigoEspecialidad, String especialidad) {
        this.nombreEspcialidad = nombreEspcialidad;
        this.codigoEspecialidad = codigoEspecialidad;
        this.especialidad = especialidad;
    }
}
