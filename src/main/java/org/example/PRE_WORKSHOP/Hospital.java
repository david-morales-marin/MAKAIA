package org.example.PRE_WORKSHOP;

import java.util.Date;

public class Hospital extends Especialidad{

    public Hospital(String nombre, int codigo, String especialidad) {
        super(nombre, codigo, especialidad);
    }

    private double valorBasePagar(double valorPagar, Usuario usuario){
        if ( usuario.obtenerTipo().equals("EPS")){
            valorPagar = 30.000;
        }else if(usuario.obtenerTipo().equals("POLIZA")){
            valorPagar = 40.000;
        }else if(usuario.obtenerTipo().equals("PARTICULAR")){
            valorPagar = 70.000;
        }else{
            System.out.println("Ingrese un tipo de usuario valido, para tomar su orden.");
            valorPagar = 00.00;
        }

        return valorPagar;
    };

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

    public String agendarCitas(Especialidad especialidad, Usuario usuario, Date fecha){
        return "prueba"; //System.out.println(especialidad.toString() + usuario.toString() );
    }
}
