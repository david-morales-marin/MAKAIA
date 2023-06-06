package org.example.ejercicio_poo;

public class MainAlumno {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno("josue","ramirez",123);

        System.out.println(alumno2.getNombre());
        System.out.println(alumno2.getApellido());
        System.out.println(alumno2.getId());

        System.out.println("cambiar valores utilizando seters");

        alumno2.setId(6);
        alumno2.setNombre("edmundo");
        alumno2.setApellido("da costa");

        System.out.println(alumno2.getNombre());
        System.out.println(alumno2.getApellido());
        System.out.println(alumno2.getId());

    }
}
