package org.example.ejerciciosClase.clase29062023.ejercicio1;

public class Singleton {
    private static Singleton IntanciaSingleton;
    public String value;

    private Singleton(String value){
        this.value = value;
    }

    public static Singleton getInstance(String value){
        if(IntanciaSingleton == null){
            IntanciaSingleton = new Singleton(value);
            System.out.println("Instancia creada por primera vez");
        }
        return IntanciaSingleton;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
