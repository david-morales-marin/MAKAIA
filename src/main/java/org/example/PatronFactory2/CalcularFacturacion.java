package org.example.PatronFactory2;

public class CalcularFacturacion {

    private double comprar;

    public CalcularFacturacion(double comprar) {
        this.comprar = comprar;
    }

    public Facturacion calcular(double comprar ){

        if(calcular(1000).facturacionIva(1000) > 10000 ){
            return new FacturacionEspecial();
        }else{
            return new FacturacionNormal();
        }
       // return new
    }
}
