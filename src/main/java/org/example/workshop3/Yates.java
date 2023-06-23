package org.example.workshop3;
//Existen dos variaciones de embarcaciones
// que alquila MAKAI. Ambas con las
// características que se describieron, pero
// cada una tiene además otras características.
// Los veleros tienen cantidad
//de mástiles y los yates cantidad de camarotes.
public class Yates extends Embarcacion {

    private int cantCamarotes;

    public Yates(Capitan capitan, double precioBase, double valorAdicional, int anoFabricacion, int eslora, int cantCamarotes) {
        super(capitan, precioBase, valorAdicional, anoFabricacion, eslora);
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public double montoAlquiler() {
        return super.montoAlquiler();
    }

    //En el caso de los yates debe ser posible
    // comprarlos. Un yate tiene mayor
    // lujo si tiene mas de 7 camarotes.

    public boolean comprar(boolean x){
        if(x = true ){
            System.out.println("Gracias por comprar");
        }else{
            System.out.println("no quiso realizar la compra");
        }
        return x;
    }

    @Override
    public void evaluar(){
        if(cantCamarotes > 7 ){
            System.out.println("El yate tiene el mayor lujo");
        }else{
            System.out.println("El yate no tiene el mayor lujo");
        }
    }

    @Override
    public String toString() {
        return "Yates{" +
                "cantCamarotes=" + cantCamarotes +
                '}';
    }
}
