package org.example.composicion;

public class Main {
    public static void main(String[] args) {
        Direccion d = new Direccion("bolivariana","cr15","23b","medellin","itagui");
        FechaNacimiento f = new FechaNacimiento(2001,06,12);

        Cliente c = new Cliente("carlos","zoto","guzman",f,d);

        System.out.println(c);
    }
}
