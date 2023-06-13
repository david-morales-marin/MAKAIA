package org.example.herenciaYpolimorfismo.herencia3;

public class FiguraGeometrica {

    private Integer alto;
    private Integer ancho;

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

      public float calcularAreaTriangulo(Integer ancho, Integer alto){
         return  (ancho * alto)/2;
      };

    public float calcularAreaCuadrado(Integer ancho){
        return ancho * ancho;
    }
}
