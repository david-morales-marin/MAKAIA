package org.example.refactor.bd;

public class MainBD {
    public static void main(String[] args) {
        TipoBD bd = BD.guardarDatos("a");
       // bd.tipoBD("david", "morales");
        System.out.println(bd.tipoBD("david ", " morales"));

        TipoBD bd1 = BD.guardarDatos("oracle");
        //bd1.tipoBD("ambrosio", "case miro");
        System.out.println(bd1.tipoBD("ambrosio ", " case miro"));
    }
}
