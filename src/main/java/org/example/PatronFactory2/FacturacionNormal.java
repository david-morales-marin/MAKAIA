package org.example.PatronFactory2;

public class FacturacionNormal implements Facturacion{
    private double comprar;

  //  public FacturacionNormal(double compra) {
    //    this.compra = compra;
//    }

    @Override
    public double facturacionIva(double comprar){
        return comprar * (1+0.19);
    }
}
