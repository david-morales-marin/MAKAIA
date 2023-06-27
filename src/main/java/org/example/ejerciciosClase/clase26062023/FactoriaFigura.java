package org.example.ejerciciosClase.clase26062023;

import java.util.Locale;

public class FactoriaFigura {
    public static FiguraGeometrica obteberFiguraGeometrica(String figura){

        if(figura == null){
            throw new IllegalArgumentException("El tipo de dato ingresado no es correcto.");
        }

        switch (figura.toLowerCase()){
            case "circulo":
             return new Circulo();
            case "cuadrado":
                return new Cuadrado();
            case "rectangulo":
                return new Rectangulo();
            default:
                throw new IllegalArgumentException("El tipo de dato " + figura + " No se encuentra en el sistema");
        }

    }
}
