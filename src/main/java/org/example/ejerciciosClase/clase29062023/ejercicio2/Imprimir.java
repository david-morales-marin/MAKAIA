package org.example.ejerciciosClase.clase29062023.ejercicio2;


public class Imprimir {
    private static Imprimir Conteo;

    private int impresiones;

    private Imprimir( int impresiones){
        this.impresiones = impresiones;
    }

    public int getImpresiones() {
        return impresiones;
    }

    public void setImpresiones(int impresiones) {
        this.impresiones = impresiones;
    }

    public static Imprimir getInstance(Integer impresiones){
        if(Conteo == null){
            Conteo = new Imprimir(impresiones);
            System.out.println("Impresion realizada con exito");
        }
        impresiones++;
        return Conteo;
    }

}
