package org.example.herenciaYpolimorfismo.herencia;

public class MainProfesion {
    public static void main(String[] args) {
        Arquitecto david = new Arquitecto();
        david.setBono(2000000);

        Medico ambrosio = new Medico();
        ambrosio.setBono(3000000);

        Ingeniero federico = new Ingeniero(2000000,5000000);

        System.out.println("El sueldo del arquitecto es de: " + david.calcularSueldo());
        System.out.println("El sueldo del Medico es de: " + ambrosio.calcularSueldo());
        System.out.println("El sueldo del Ingeniero es de: " + federico.calcularSueldo());


    }
}
