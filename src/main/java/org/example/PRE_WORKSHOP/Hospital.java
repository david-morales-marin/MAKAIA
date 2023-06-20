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
<<<<<<< HEAD

=======
        return "prueba citas";
>>>>>>> 8e52691cdc2fb724f6687e4972f1e24f161178b0
    }
}
