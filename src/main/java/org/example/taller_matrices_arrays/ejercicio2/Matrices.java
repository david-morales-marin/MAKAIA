package org.example.taller_matrices_arrays.ejercicio2;

import java.util.Scanner;

/*2. Matrices
Escribe un programa en Java que simule el juego del "Hundir la Flota". El juego
se juega en una matriz cuadrada de tamaño NxN, donde cada celda representa
una posición en el tablero. Las posiciones pueden contener un barco o agua.
El programa debe seguir los siguientes pasos:*/
public class Matrices {
    public static void main(String[] args) {
        /*• Define una matriz cuadrada, tablero, de tamaño NxN e inicialízala con
            agua en todas las celdas.*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de filas x columnas de la matriz: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[][] matriz = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = "agua";
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }
/*• Solicita al usuario que coloque los barcos en el tablero. El usuario debe
ingresar las coordenadas de inicio y fin del barco, así como la dirección
(horizontal o vertical). */
        String ingreso;

        do {

            System.out.println("¿Desea agregar un barco al tablero? si/no ");
            ingreso = scanner.nextLine();
            if (ingreso.equals("si")) {

                System.out.println("Ingrese las coordenadas para el barco que desea agregar: ");
                System.out.println("coordenada inicio: ");
                int a = scanner.nextInt();
                System.out.println("coordenada fin: ");
                int b = scanner.nextInt();
                scanner.nextLine();

                if (a >= 0 && a < n && b >= 0 && b < n) {
                    System.out.println("ingreso correcto ");
                    matriz[a][b] = "barco";
                } else {
/*• Verifica que los barcos se coloquen dentro de los límites del tablero y no
se superpongan. Si hay algún error, muestra un mensaje y solicita al
usuario que vuelva a ingresar las coordenadas.*/
                    System.out.println("la coordenada ingresada supera el tamaño del tablero");
                }

            } else {
                System.out.println("Ingreso de palabra incorrecto");
            }
        }
        while (!ingreso.equals("no"));
        System.out.println("Ingresos finalizados ");

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }
/*Inicia el juego y solicita al usuario que adivine la posición de los barcos.
 El usuario debe ingresar las coordenadas de la celda que desea atacar.*/

        System.out.println("BIENVENIDO AL INICIO DEL JUEGO!!!");
        System.out.println("Ingresa el numero de intentos permitidos ");
        int numIntentos = scanner.nextInt();
        int sumaIntentos = 0;

        do{
            System.out.println("Ingresa las coordenadas a atacar");
            System.out.println("Coordenada de inicio ");
            int ataqueInicio = scanner.nextInt();
            System.out.println("Coordenada de fin ");
            int ataqueFin = scanner.nextInt();

/* Verifica si el usuario ha acertado en la posición de un barco. Si acierta,
marca la celda como "barco tocado". Si falla, marca la celda como "agua tocada".*/

            if(ataqueInicio >= 0 && ataqueInicio < n && ataqueFin >= 0 && ataqueFin < n) {
                if (matriz[ataqueInicio][ataqueFin] == "barco") {
                    matriz[ataqueInicio][ataqueFin] = "barco tocado";
                } else {
                    matriz[ataqueInicio][ataqueFin] = "agua tocada";
                }
            }else{
                System.out.println("la coordenada ingresada supera el tamaño del tablero");
            }
            sumaIntentos++;
/*Continúa el juego hasta que el usuario haya acertado en todas las
posiciones de los barcos o haya agotado el número máximo de intentos.*/
        }while(numIntentos > sumaIntentos);

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }

        //Muestra un mensaje indicando si el usuario ganó o perdió el juego.
   boolean barco;

        for( int i = 0; i<n; i++){
            for(int  j = 0; j<n; j++){

                if(matriz[i][j].equals("barco")){
                    barco = true;
                }else{
                    barco = false;
                }
            }
        }

        System.out.println();

        if(barco = true){
            System.out.println("Perdiste");
        }else{
            System.out.println("ganaste");
        }


    }
}





