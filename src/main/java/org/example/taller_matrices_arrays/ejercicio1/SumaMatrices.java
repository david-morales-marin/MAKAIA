package org.example.taller_matrices_arrays.ejercicio1;
/* 1. Escribe un programa en Java que realice la suma de dos matrices cuadradas
del mismo tamaño. El programa debe seguir los siguientes pasos:
• Define dos matrices cuadradas, matriz1 y matriz2, del mismo tamaño.
• Verifica si las matrices tienen el mismo tamaño. Si no tienen el mismo
tamaño, muestra un mensaje de error y finaliza el programa.
• Crea una nueva matriz, matrizSuma, del mismo tamaño que las matrices
originales para almacenar la suma de los elementos correspondientes.
• Utiliza bucles anidados para recorrer los elementos de las matrices
originales.
• En cada iteración, suma los elementos correspondientes de matriz1 y
matriz2, y almacena el resultado en la matrizSuma.
• Imprime la matrizSuma en formato de matriz, mostrando los valores
resultantes de la suma*/
public class SumaMatrices {
    public static void main(String[] args) {
        int [][] matriz1 = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] matriz2 = {{9,4,2},{5,9,6},{2,7,8}};
        int [][] sumaMatrices = new int[3][3];

        if(matriz1.length == matriz2.length){

            for(int i = 0; i < matriz1.length; i++){
                for(int j = 0; j < matriz2.length; j++){
                    sumaMatrices[i][j] = matriz1[i][j] + matriz2[i][j];
                }

            }
        }else{
            System.out.println("Las matrices no tienen el mismo tamaño, no se puede realizar la suma.");
        }

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                System.out.print(sumaMatrices[i][j] + " ");
            }
            System.out.println();
        }
    }
}




















