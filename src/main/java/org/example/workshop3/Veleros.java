package org.example.workshop3;
//Existen dos variaciones de embarcaciones
// que alquila MAKAI. Ambas con las
// características que se describieron, pero
// cada una tiene además otras características.
// Los veleros tienen cantidad
//de mástiles y los yates cantidad de camarotes.
public class Veleros ex Embarcacion{

    private int cantMastiles;
    private double compraVelero;


    @Override
    public double getPrecioBase() {
        return getPrecioBase();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double montoAlquilar() {
        return getPrecioBase();
    }

    //Es importante poder evaluar en un velero si
    // es grande, los velos grandes son aquellos que
    //superan los 4 mastiles.

    @Override
    public boolean comprar(){
        if(cantMastiles > 5){
            System.out.println("Es un velero grande ");
            return true;
        }else {
            System.out.println("Es un velero pequeño");
            return false;
        }
    }

}
