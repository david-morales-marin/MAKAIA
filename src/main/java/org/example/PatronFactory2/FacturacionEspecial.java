package org.example.PatronFactory2;

public class FacturacionEspecial implements  Facturacion {

    private double comprar;

 //   public FacturacionEspecial(double compra) {
   //     this.compra = compra;
   // }

    @Override
    public double facturacionIva(double comprar){
        return comprar * (1+0.08);
    }

}
