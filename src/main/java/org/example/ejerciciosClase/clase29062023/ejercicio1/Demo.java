package org.example.ejerciciosClase.clase29062023.ejercicio1;

public class Demo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Instancia 1");
       System.out.println(singleton.getValue());

        Singleton singleton1 = Singleton.getInstance("Instancia 2");
        System.out.println(singleton1.getValue());

        singleton1.setValue("singleton 222");
        System.out.println(singleton1.getValue());
        System.out.println(singleton.getValue());
    }
}
