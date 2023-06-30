package org.example.taller_Patrones.Ejercicio1;

public class MySql {

    private String contrasenaMySql;

    public MySql(String contrasenaMySql) {
        this.contrasenaMySql = contrasenaMySql;
    }

    public void conexion() {
        if (contrasenaMySql.toLowerCase() == ConexionBD.getInstance().getContrasenaBD()) {
            System.out.println("conexion creada desde MySql ");
        } else {
            System.out.println("Contraseña invalida desde MySql");
        }
    }

}