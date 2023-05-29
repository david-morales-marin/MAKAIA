package org.example.taller_vectores;

import java.util.Scanner;

//Crear un arreglo con n numeros, ingresados por
// teclado y mostrar sus valores elevados al cuadrado.
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo: ");
        int tamano = scanner.nextInt();

        int[] arreglo = new int[tamano];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();

        }
        int elevado = 0;
        for (int j = 0; j<tamano; j++){
            elevado = arreglo[j] * arreglo[j];
            System.out.println("El número de los elemenos al cuadrado es: " + elevado);
        }

    }
}