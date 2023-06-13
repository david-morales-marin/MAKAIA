package org.example.ejerciciosPooInterfaces.ejercicio1;

import org.example.ejerciciosPooInterfaces.ejercicio1.Bafle;
import org.example.ejerciciosPooInterfaces.ejercicio1.Computador;

public class MainReproductor {
    public static void main(String[] args) {

        Bafle bafle = new Bafle("Bafle");
        bafle.toString();
        bafle.detenerMusica();
        bafle.pausarMusica();
        bafle.reproductorMusica();

        Computador computador = new Computador("Computador");
        computador.toString();
        computador.detenerMusica();
        computador.pausarMusica();
        computador.reproductorMusica();

    }
}
