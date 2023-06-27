package org.example.PatronFactory2;

public class FacturacionEspecial implements  Facturacion {


    @Override
    public void calcular(){
        System.out.println( "el iva fue del 8: ");
    }

}
