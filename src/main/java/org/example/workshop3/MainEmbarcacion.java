package org.example.workshop3;

public class MainEmbarcacion {

    public static void main(String[] args) {

        Capitan capitan = new Capitan("David", "Morales", 3467);
        Capitan capitan1 = new Capitan("Ambrosio", "olivera", 4597);
        Capitan capitan2 = new Capitan("edmundo", "buendia", 9824);

        Embarcacion yate = new Yates(capitan, 10.000, 0, 2018, 5, 4);
        Embarcacion velero = new Veleros(capitan1, 10.000, 0, 2022, 4, 2);

        System.out.println("El valor a pagar por el yate es de: " + yate.montoAlquiler());
        yate.evaluar();
       System.out.println(yate.toString());

        System.out.println("El valor a pagar por el velero es de: " + velero.montoAlquiler());
        velero.evaluar();
        System.out.println(velero.toString());

    }
}