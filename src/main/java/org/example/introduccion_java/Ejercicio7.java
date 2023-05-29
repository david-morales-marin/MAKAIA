package org.example.introduccion_java;

import java.util.Scanner;

//Escribir un programa que pregunte al usuario su edad y muestre por
//pantalla todos los años que ha cumplido (desde 1 hasta su edad).
public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        Integer edad = scanner.nextInt();
        Integer i = 0;

        while(edad != i){
            i++;
            System.out.println("Sus años cumplidos son: " + i);
        }

      //  for (int i = 0; i >= edad; i++){
        //    System.out.println( "sus años cumplidos son: " + i );
       // }
        //preguntar porque con el for no me ingresa. !!!
    }
}