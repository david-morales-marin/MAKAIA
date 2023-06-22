package org.example.workshop3;

public class MainEmbarcacion {
    public static void main(String[] args) {
        Capitan capitan = new Capitan("david","morales", 2534);
        Capitan capitan1 = new Capitan("ambrosio","urrego", 8937);
        Capitan capitan2 = new Capitan("Edmundo", "montesacro", 8730);

        Embarcacion yate = new Yates("david", "morales", 7629, 10,20,2018,4,3);
        Embarcacion velero = new Veleros("ambrosio","roldan", 2789, 10,20,2025,4,5);

        System.out.println("el total a pagar por el alquiler es de: " + yate.montoAlquilar());
        System.out.println("el total a pagar por el alquiler es de: " + velero.montoAlquilar());

    }
}
