package org.example.workshop3;
//Existen dos variaciones de embarcaciones
// que alquila MAKAI. Ambas con las
// características que se describieron, pero
// cada una tiene además otras características.
// Los veleros tienen cantidad
//de mástiles y los yates cantidad de camarotes.
public class Yates extends Embarcacion {

    private int cantCamarotes;

    public Yates(String nombre, String apellido, int matriculaNav, double precioBase, double valorAdicional, int anoFabricacion, int eslora, int cantCamarotes) {
        super(nombre, apellido, matriculaNav, precioBase, valorAdicional, anoFabricacion, eslora);
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public double montoAlquilar() {
        return super.montoAlquilar();
    }

    //En el caso de los yates debe ser posible
    // comprarlos. Un yate tiene mayor
    // lujo si tiene mas de 7 camarotes.

    public double comprarYate(){
        if(cantCamarotes > 7){
            System.out.println("El yate tiene mayor lujo, ¿desea comprarlo?");
            return getPrecioBase();
        }else{
            System.out.println("el yate no tiene el mayor lujo, ¿desea comprarlo?");
            return super.montoAlquilar() + 1;
        }
    }

}
