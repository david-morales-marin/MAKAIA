package org.example.ejerciciosClase.clase09062023;

public class MainAnimalHumano {
    public static void main(String[] args) {
        Animal perro = new Animal();
        perro.setRaza("doberman");
        perro.cazar();
        perro.desplazarse();
        perro.alimentarse();
        perro.jugar();

        System.out.println();

        Humano persona = new Humano();
        persona.setCedula(115448789);
        persona.alimentarse();
        persona.desplazarse();
        persona.jugar();
        persona.razonar();

        System.out.println();

        Hombre camilo = new Hombre();
        camilo.setNombre("camilo andres");
        camilo.setCedula(1009345688);
        camilo.razonar();
        camilo.desplazarse();
        camilo.jugar();
        camilo.trabajar();
    }
}
