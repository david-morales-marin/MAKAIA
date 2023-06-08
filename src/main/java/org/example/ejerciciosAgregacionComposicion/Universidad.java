package org.example.ejerciciosAgregacionComposicion;
//Define una clase llamada "Universidad" que tenga los siguientes atributos:
//a. Un nombre de tipo String.
//b. Un vector de estudiantes de tipo Estudiante.
//c. Un contador de cantidad de estudiantes.
public class Universidad {
    private String nombre;
    private Estudiante estudiantes;

    private int conEstudiantes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstudiantes(Estudiante estudiantes) {
        this.estudiantes = estudiantes;
    }

    public int getConEstudiantes() {
        return conEstudiantes;
    }

    public void setConEstudiantes(int conEstudiantes) {
        this.conEstudiantes = conEstudiantes;
    }

    //d. Un constructor que reciba el nombre de la universidad y que
    // inicialice el vector de estudiantes y el contador.


    public Universidad(String nombre, Estudiante estudiantes, int conEstudiantes) {
        this.nombre = nombre;
        this.estudiantes = estudiantes;
        this.conEstudiantes = conEstudiantes;
    }

    //e. Un método llamado "agregarEstudiante" que reciba un objeto de tipo Estudiante y
    // lo agregue al vector de estudiantes si hay capacidad disponible.

    public void  agregarEstudiante(Estudiante estudiante){

        if(conEstudiantes <= 100){
            Estudiante estudiante1 = new Estudiante();
            System.out.println("Estudiante agregado con exito");
        }else{
            System.out.println("No puede agregar al estudiante, la universidad ya llego al limite");
        }
      //  return estudiante;
    }

    //f. Un método llamado "getEstudiantes" que retorne el vector de estudiantes.

    public Estudiante getEstudiantes() {
        return estudiantes;
    }


    //g. Un método llamado "getCantidadEstudiantes" que retorne la
    // cantidad actual de estudiantes en la universidad.


    public int getCantidadEstudiantes() {
         System.out.println("La cantidad actual de estudiantes es de: " + conEstudiantes);
        return conEstudiantes;
    }

    @Override
    public String toString() {
        return "Universidad{" +
                "nombre='" + nombre + '\'' +
                ", estudiantes=" + estudiantes +
                ", conEstudiantes=" + conEstudiantes +
                '}';
    }
}
