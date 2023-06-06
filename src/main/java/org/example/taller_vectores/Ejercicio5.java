package org.example.taller_vectores;
//Haz un vector numerico de 10 posiciones dados por el usuario
// y muestre los elementos que son mayores al numero dado por el usuario.

import java.awt.*;
import java.util.Scanner;

//Solicitarle los 10 datos al usuario y a parte solicitar un numero
//Y solo mostrar los números del vector que sean mayores a ese número que ingresó
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // System.out.println("Ingrese el numero mayor");
        int mayor; //= scanner.nextInt();
        int[] arreglo = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese 10 numeros:" + "Numero: " + (i + 1));
            arreglo[i] = scanner.nextInt();

            for (int j = 0; j < 3; j++) {
                if (arreglo[i]>arreglo[j]){
                    mayor = arreglo[j];
                    System.out.println("Los numeros mayores son: " + mayor);
                }
            }
        }

    }
}
