package org.example;

import java.util.Scanner;

//Para tributar un determinado impuesto se debe ser mayor de 16 años y
//tener unos ingresos iguales o superiores a $5,000.000 mensuales.
//Escribir un programa que pregunte al usuario su edad y sus ingresos
//mensuales y muestre por pantalla si el usuario tiene que tributar o no.
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        Integer edad = scanner.nextInt();
        System.out.println("Ingrese sus ingresos mensuales: ");
        Double ingresos = scanner.nextDouble();

        if(edad > 16 && ingresos >= 5000000){
            System.out.println("El usuario tiene que tributar");
        }else{
            System.out.println("El usuario no tiene que tributar");
        }
    }
}
