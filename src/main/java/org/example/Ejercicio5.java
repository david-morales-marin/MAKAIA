package org.example;

//Cree un bucle que sume los números del 100 al 200.

public class Ejercicio5 {
    public static void main(String[] args) {

        for(int num = 100; num <= 200; num++) {

            int suma = num + (num-1);
            System.out.println(suma +" y el numero es: " + num);
        }
    }
}
