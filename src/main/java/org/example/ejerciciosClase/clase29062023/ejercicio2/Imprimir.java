package org.example.ejerciciosClase.clase29062023.ejercicio2;
public class Imprimir {
    private static Imprimir Conteo;
    private int impresiones = 0;

    private Imprimir(){

    }
    public static Imprimir getInstance(){
        if(Conteo == null){
            Conteo = new Imprimir();
            System.out.println("Impresion realizada con exito");
       }
        Conteo.impresiones++;
        return Conteo;
    }
    public int getImpresiones() {
        return impresiones;
    }

    public void setImpresiones(int impresiones) {
        this.impresiones = impresiones;
    }

}
