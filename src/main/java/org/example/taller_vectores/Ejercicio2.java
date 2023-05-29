package org.example.taller_vectores;

import java.util.Scanner;

//Ingresar 10 valores numéricos a un array y
// mostrar cuantos son pares y cuantos son impares.
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Ingrese 10 valores numericos: ");
        for(int i=0; i<10; i++){
            System.out.println("Ingrese el Número " + (i+1) + " : ");
            array[i] = scanner.nextInt();
        }

        int pares = 0;
        int impares = 0;

        for (int i =0; i<10; i++ ){
            if(array[i] % 2 == 0 ){
                pares ++;
            }else{
                impares++;
            }
        }
          System.out.println("La cantidad de números pares es: " + pares);
          System.out.println("La cantidad de números impares es: " + impares);
    }
}
