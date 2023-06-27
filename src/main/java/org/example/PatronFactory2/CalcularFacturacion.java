package org.example.PatronFactory2;

public class CalcularFacturacion {

    public static Facturacion calcularValorIva(double compra){
           double x;
       if( compra > 100){

          x = compra * (1 + 0.19);
            System.out.println("La compra total es de: " + x);
           return new FacturacionEspecial();
       }else{
           x = compra * (1 + 0.08);
           System.out.println("La compra total es de: " + x);
           return new FacturacionNormal();
        }

    }
}
