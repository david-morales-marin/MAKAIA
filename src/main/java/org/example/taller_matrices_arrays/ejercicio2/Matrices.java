package org.example.taller_matrices_arrays.ejercicio2;

import java.util.Scanner;

/*2. Matrices
Escribe un programa en Java que simule el juego del "Hundir la Flota". El juego
se juega en una matriz cuadrada de tamaño NxN, donde cada celda representa
una posición en el tablero. Las posiciones pueden contener un barco o agua.
El programa debe seguir los siguientes pasos:

• Inicia el juego y solicita al usuario que adivine la posición de los barcos.
El usuario debe ingresar las coordenadas de la celda que desea atacar.
• Verifica si el usuario ha acertado en la posición de un barco. Si acierta,
marca la celda como "barco tocado". Si falla, marca la celda como "agua
tocada".
• Continúa el juego hasta que el usuario haya acertado en todas las
posiciones de los barcos o haya agotado el número máximo de intentos.
• Muestra un mensaje indicando si el usuario ganó o perdió el juego.
*/
public class Matrices {
    public static void main(String[] args) {
        /*• Define una matriz cuadrada, tablero, de tamaño NxN e inicialízala con
            agua en todas las celdas.*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de filas x columnas de la matriz: ");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
/*• Solicita al usuario que coloque los barcos en el tablero. El usuario debe
ingresar las coordenadas de inicio y fin del barco, así como la dirección
(horizontal o vertical). */
        /*System.out.print("Ingrese la fila de la coordenada: ");
        int fila = scanner.nextInt();
        System.out.print("Ingrese la columna de la coordenada: ");
        int columna = scanner.nextInt();*/
        System.out.println("Ingrese las coordenadas para el barco que desea agregar: ");
        System.out.println("coordenada inicio: ");
        int a = scanner.nextInt();
        System.out.println("coordenada fin: ");
        int b = scanner.nextInt();

        if()//agregar validacion para preguntarle al usuario si quiere ingresar otro barco o no
        if(a>=0 && a<n && b>=0 && b<n){
            System.out.println("ingreso correcto ");
            matriz[a][b] = 1;
        }else{
            System.out.print("la coordenada ingresada supera el tamaño del tablero");
        }



        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

            }
        }

/*• Verifica que los barcos se coloquen dentro de los límites del tablero y no
se superpongan. Si hay algún error, muestra un mensaje y solicita al
usuario que vuelva a ingresar las coordenadas.*/
     /*   if(matriz[n][n] < matriz[a][b]){
            System.out.println("ingreso correcto ");
        }else{
            System.out.print("la coordenada ingresada supera el tamaño del tablero");
        } */
    }
}
