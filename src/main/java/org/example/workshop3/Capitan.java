package org.example.workshop3;
//Una embarcación debe tener si o si un capitán
// y los datos del capitán son: nombre, apellido y
//matricula de navegación ---- Utilizar un
// constructor que permita asignar todos estos atributos al
//momento de crear el objecto capitán.
public  class Capitan extends Embarcacion{
    private String nombre;
    private String apellido;
    private int matriculaNav;

    @Override
    public String toString() {
        return "Capitan{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", matriculaNav=" + matriculaNav +
                '}';
    }
}
