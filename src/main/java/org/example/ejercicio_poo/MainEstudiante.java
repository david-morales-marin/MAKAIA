package org.example.ejercicio_poo;

public class MainEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Ramiro",84,1);
        System.out.println(estudiante.getNombre());
        System.out.println(estudiante.getEdad());
        System.out.println(estudiante.getNota());
        System.out.println(estudiante.aprueba());

        estudiante.setNombre("alfredo");
        estudiante.setEdad(25);
        estudiante.setNota(8);

        System.out.println(estudiante.getNombre());
        System.out.println(estudiante.getEdad());
        System.out.println(estudiante.getNota());
        System.out.println(estudiante.aprueba());
    }
}
