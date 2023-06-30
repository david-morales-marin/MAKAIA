package org.example.taller_Patrones.Ejercicio1;

public class Oracle {

    private String contasenaOracle;

    public Oracle(String contasenaOracle) {
        this.contasenaOracle = contasenaOracle;
    }

    public String getContasenaOracle() {
        return contasenaOracle;
    }

    public void conexion(){
        if(getContasenaOracle() == ConexionBD.getInstance().getContrasenaBD()){
            System.out.println("Conexion exitosa desde Oracle");
        }else{
            System.out.println("contraseña invalida desde oracle");
        }

    }
}
