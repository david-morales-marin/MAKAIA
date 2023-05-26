package org.example;

import java.util.Scanner;

// Solicitar al usuario un número de cliente. Si el número es el 1000, imprimir
//“Ganaste un premio” de lo contrario imprimir “Sigue participando”.

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un Número de cliente: ");
        Integer num = scanner.nextInt();

        if (num == 10007) {
            System.out.print("Ganaste un premio");
        }else{
            System.out.print("Sigue participando");
        }

    }
}
