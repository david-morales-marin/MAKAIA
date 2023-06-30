package org.example.taller_Patrones.Ejercicio1;
//Crear un grupo de conexiones a diferentes
// bases de datos implementando el patrón
//singleton.
public class ConexionBD {
    private static ConexionBD conexionBD;
    private String contrasenaBD = "prueba123";

    public String getContrasenaBD() {
        return contrasenaBD;
    }
    private ConexionBD(){

    }
    public static ConexionBD getInstance(){
        if(conexionBD == null){
            conexionBD = new ConexionBD();
        }
        return conexionBD;
    }
}
