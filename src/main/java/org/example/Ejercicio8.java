package org.example;

import java.util.Scanner;

//Escribir un programa que pida el ingreso de una calificación (de la A a
//la F) e imprima la evaluación de dicha calificación.
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la calificacion: ");
        int nota = scanner.nextInt();

        switch (nota) {
            case 1:
                System.out.println("Seleccionaste la calificación A.");
                break;
            case 2:
                System.out.println("Seleccionaste la calificación B.");
                break;
            case 3:
                System.out.println("Seleccionaste la calificación C.");
                break;
            case 4:
                System.out.println("Seleccionaste la calificación D.");
                break;
            case 5:
                System.out.println("Seleccionaste la calificación E.");
                break;
            case 6:
                System.out.println("Seleccionaste la calificación F.");
                break;
            default:
                System.out.println("Opción no válida.");
        }

    }
}
