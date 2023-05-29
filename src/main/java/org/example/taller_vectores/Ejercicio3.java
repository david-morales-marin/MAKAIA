package org.example.taller_vectores;

import java.util.Scanner;

//Hacer un programa que permita
// ingresar 10 valores a un array seguido muestre cuantos son positivos,
// cuantos negativos y cuantos son nulos.
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Ingrese 10 valores numericos: ");
        for(int i=0; i<10; i++){
            System.out.println("Ingrese el Número " + (i+1) + " : ");
            array[i] = scanner.nextInt();
        }

        int positivos = 0;
        int negativos = 0;
        int nulos = 0;

        for (int i =0; i<10; i++ ){
            if(array[i]>=0){
                positivos++;
            }else if(array[i]<0){
                negativos++;
            }else{
                nulos++;
            }
        }
        System.out.println("La cantidad de números positivos es: " + positivos);
        System.out.println("La cantidad de números negativos es: " + negativos);
        System.out.println("La cantidad de números nulos es: " + nulos);
    }
}
