package org.example.herenciaYpolimorfismo.herencia2;

//Crear la clase TarjetaCredito con los siguientes atributos:

public class TarjetaCredito {

    //● Emisor, de tipo String -> Visa, MasterCard, American Express.
    //● Cupo, de tipo Long.
    //● numeroTarjeta, de tipo String.
   //● cvv, de tipo Integer.
    //● fechaVencimiento, de tipo LocalDate.
    private String emisor;
    private long cupo;
    private String numeroTarjeta;
    private int cvv;
    private String fechaVencimiento;

    //Crear constructor vacío y otro con todos los argumentos.


    public TarjetaCredito() {
    }

    public TarjetaCredito(String emisor, long cupo, String numeroTarjeta, int cvv, String fechaVencimiento) {
        this.emisor = emisor;
        this.cupo = cupo;
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
        this.fechaVencimiento = fechaVencimiento;
    }

    //Crear los métodos getter y setter para todos los atributos.


    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public long getCupo() {
        return cupo;
    }

    public void setCupo(long cupo) {
        this.cupo = cupo;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    //Crear método imprimir() -> debe mostrar en consola el emisor,
    // cupo, número de tarjeta, cvv y fecha de vencimiento.

    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "emisor='" + emisor + '\'' +
                ", cupo=" + cupo +
                ", numeroTarjeta='" + numeroTarjeta + '\'' +
                ", cvv=" + cvv +
                ", fechaVencimiento=" + fechaVencimiento +
                '}';
    }

    public void imprimir(){
        System.out.println(toString());
    }
}
