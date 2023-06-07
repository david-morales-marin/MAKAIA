package org.example.ejercicio_poo;

import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private int edad;
    private long nota;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, long nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    public boolean aprueba(){
        if(nota>= 5){
            System.out.println("El estudiante aprobo la materia");
            return true;
        }else{
            System.out.println("El estudiante reprobo la materia");
            return  false;
        }
          //  return true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getNota() {
        return nota;
    }

    public void setNota(long nota) {
        this.nota = nota;
    }
}
