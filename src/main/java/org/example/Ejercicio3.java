package org.example;

import java.util.Scanner;

//Escribir un programa que pida al usuario un número e imprima si es
//par o impar.
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        Integer num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println("El número " + num + " es par ");
        }else{
            System.out.println("El número es impar ");
        }
    }
}
