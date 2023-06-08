package org.example.ejerciciosAgregacionComposicion;

public class MainUniversidad {
    //l. Crea una instancia de la clase "Universidad" llamada
    // "universidad" con el nombre "Universidad XYZ".

    //m. Crea al menos dos instancias de la clase "Estudiante" con datos ficticios.

    //n. Agrega los estudiantes creados a la universidad utilizando el
    // método "agregarEstudiante" de la clase "Universidad".

    //o. Imprime en la consola el nombre de la universidad.

    //p. Recorre el vector de estudiantes utilizando un bucle y muestra en
    // la consola la información de cada estudiante (nombre, edad y número de estudiante).
    public static void main(String[] args) {
        //punto L
        Estudiante estudiante = new Estudiante("ambrosio",88);
        Universidad universidad = new Universidad("universidadxyz", estudiante,1);

        //punto M
        Estudiante estudiante1 = new Estudiante("ramiro",48);
        Estudiante estudiante2 = new Estudiante("edmundo",68);

        //punto N
        universidad.agregarEstudiante(estudiante1);
        universidad.agregarEstudiante(estudiante2);

        //punto O
        System.out.println(universidad.getNombre());
        System.out.println(universidad.agregarEstudiante(););

        //punto p


    }
}
