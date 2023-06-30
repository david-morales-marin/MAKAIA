package org.example.taller_Patrones.Ejercicio2;

public class SacarReporte {

    public static TipoReporte sacarReporte(String tipoReporte){
         if(tipoReporte == null ){
             throw new RuntimeException("debe seleccionar un reporte");
         }

         switch (tipoReporte.toLowerCase()){
             case "excel":
                 return new Excel();
             case "pdf":
                 return new Pdf();
             case "word":
                 return new Word();
             case "texto plano":
                 return new TextoPlano();
             default:
                 throw new RuntimeException("debe ingresar un reporte valido");
         }

    }
}
