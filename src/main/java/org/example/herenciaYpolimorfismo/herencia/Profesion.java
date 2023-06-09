package org.example.herenciaYpolimorfismo.herencia;
//Crear clase Profesión con los siguientes atributos:
public class Profesion {

    //● Sueldo, de tipo Long.
   //● Bono, de tipo Long.
   //● El sueldo base será de $2’000.000.
    private long sueldo = 2000000;
    private long bono;

    //Crea los getter y setter para el atributo bono.
    public void setBono(long bono){
        this.bono = bono;
    }

    public long getBono(){
        return bono;
    }

    //Crear constructor vacío y otro con todos los argumentos.

    public Profesion() {
    }

    public Profesion(long sueldo, long bono) {
        this.sueldo = sueldo;
        this.bono = bono;
    }

    //Crear el método calcularSueldo() -> se calculará total: sueldo + bono. Debe retornar un Long.

    public long calcularSueldo(){
        return this.bono + this.sueldo;
    }
}
