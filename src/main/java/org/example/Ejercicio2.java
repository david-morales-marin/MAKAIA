package org.example;

import java.util.Scanner;

//Solicitar al usuario que ingrese dos números e imprima cuál de los dos
//es menor. Considerar el caso en que ambos números son iguales.
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer Número: ");
        Integer num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo Número: ");
        Integer num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("El numero menor de los datos ingresados es el segundo: " + num2 );
        } else if(num1 < num2 ){
            System.out.println("El numero menor de los datos ingresados es el primero: " + num1 );
        }else{
            System.out.println("Los dos numeros son iguales");
        }

    }
}
