package org.example.ejerciciosAgregacionComposicion;
//En una universidad llamada "Universidad XYZ", se desea gestionar la información
// de sus estudiantes. Cada estudiante tiene un nombre,
// edad y número de estudiante. La universidad puede tener un máximo de 100 estudiantes.
public class Estudiante {
    private String nombreEstudiante;
    private int edad;
    private int numEstudiante;

    public Estudiante() {
    }

    public Estudiante(String nombreEstudiante, int edad) {
        this.nombreEstudiante = nombreEstudiante;
        this.edad = edad;
        this.numEstudiante++;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumEstudiante() {
        return numEstudiante;
    }

    public void setNumEstudiante(int numEstudiante) {
        this.numEstudiante = numEstudiante;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombreEstudiante='" + nombreEstudiante + '\'' +
                ", edad=" + edad +
                ", numEstudiante=" + numEstudiante +
                '}';
    }
}
