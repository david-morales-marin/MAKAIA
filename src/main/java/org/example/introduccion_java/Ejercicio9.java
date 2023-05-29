package org.example.introduccion_java;

import java.util.Scanner;

//Una fábrica tiene una promoción de descuento para vender un número
//de sillas, si son más de 5 sillas el descuento es de 10%, si son más de
//12 sillas el descuento es de 20%, si son más de 40 sillas el descuento
//es de 30%, imprimir el valor a pagar aplicando el descuento
//correspondiente dado el número de unidades que compre un usuario,
//el precio unitario sin descuento es de $40.000.
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de sillas a comprar: ");
        Integer sillas = scanner.nextInt();
        Double total, descu;
        Integer unidad = 40000;

        if(sillas > 5 && sillas <= 12 ){
            //10 %
            descu = (sillas * unidad)*0.1;
            total = (sillas * unidad)-descu;
            System.out.println("El total a pagar es de: " + total);
            System.out.println("Su descuento fue del 10%: " + descu);
        }else if(sillas > 12 && sillas <= 40 ){
            //20%
            descu = (sillas * unidad)*0.2;
            total = (sillas * unidad)-descu;
            System.out.println("El total a pagar es de: " + total);
            System.out.println("Su descuento fue del 20%: " + descu);
        }else if(sillas > 40){
            //30 %
            descu = (sillas * unidad)*60.4;
            total = (sillas * unidad)-descu;
            System.out.println("El total a pagar es de: " + total);
            System.out.println("Su descuento fue del 30%: " + descu);
        }else{
            total = (sillas * unidad)/1.0;
            System.out.println("Su compra no tiene descuento");
            System.out.println("El total a pagar es de: " + total);
        }
    }
}
