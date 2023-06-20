package org.example.PRE_WORKSHOP;

import java.util.Date;

public class Hospital extends Especialidad{

    public Hospital(String nombre, int codigo, String especialidad) {
        super(nombre, codigo, especialidad);
    }

    private double valorBasePagar;

    @Override
    public String espMedicinaGeneral() {
        return "Medicina General";
    }

    @Override
    public String espMedicinaInterna() {
        return "Medicina Interna";
    }

    @Override
    public String espMedicinaDeporte() {
        return "Medicina del Deporte";
    }

    public String agendarCitas(){
        return "prueba citas";
    }
}
