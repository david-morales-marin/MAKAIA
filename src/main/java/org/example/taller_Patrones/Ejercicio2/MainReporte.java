package org.example.taller_Patrones.Ejercicio2;

public class MainReporte {

    public static void main(String[] args) {
        TipoReporte reporte = SacarReporte.sacarReporte("pdf");
        reporte.tipoReporte();
    }
}
