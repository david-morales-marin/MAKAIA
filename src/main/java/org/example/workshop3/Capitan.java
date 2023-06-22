package org.example.workshop3;
//Una embarcación debe tener si o si un capitán
// y los datos del capitán son: nombre, apellido y
//matricula de navegación ---- Utilizar un
// constructor que permita asignar todos estos atributos al
//momento de crear el objecto capitán.
public class Capitan {
    private String nombre;
    private String apellido;
    private int matriculaNav;

    public Capitan(String nombre, String apellido, int matriculaNav) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaNav = matriculaNav;
    }
}
