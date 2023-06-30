package org.example.taller_Patrones.Ejercicio1;

public class MainConexion {
    public static void main(String[] args) {
      //  ConexionBD conexionBD = ConexionBD.getInstance();

        MySql mySql = new MySql("prueba123");
        Oracle oracle = new Oracle("prueba");

        mySql.conexion();
        oracle.conexion();
    }
}
