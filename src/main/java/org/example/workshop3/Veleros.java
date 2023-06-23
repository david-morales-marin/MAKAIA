package org.example.workshop3;
//Existen dos variaciones de embarcaciones
// que alquila MAKAI. Ambas con las
// características que se describieron, pero
// cada una tiene además otras características.
// Los veleros tienen cantidad
//de mástiles y los yates cantidad de camarotes.
public class Veleros extends Embarcacion {

    private int cantMastiles;

    public Veleros(Capitan capitan, double precioBase, double valorAdicional, int anoFabricacion, int eslora, int cantMastiles) {
        super(capitan, precioBase, valorAdicional, anoFabricacion, eslora);
        this.cantMastiles = cantMastiles;
    }

    @Override
    public double montoAlquiler() {
        return super.montoAlquiler();
    }

    //Es importante poder evaluar en un velero
    // si es grande, los velos grandes son
    // aquellos que superan los 4 mastiles

    @Override
    public void evaluar(){
        if(cantMastiles > 4 ){
            System.out.println("El velero es grande");
        }else{
            System.out.println("El velero no es grande");
        }
    }

    @Override
    public String toString() {
        return "Veleros{" +
                "cantMastiles=" + cantMastiles +
                '}';
    }
}
