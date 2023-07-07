package com.n1Ex1_Observerd;

public class AgenciasBolsa {
    //clase AgenciaBolsa que actúe como el observador
    private String nombre;

    public AgenciasBolsa(String nombre) {


        this.nombre = nombre;
    }
    public void update(String mensaje) {


        System.out.println(nombre + ": " + mensaje);
    }
}
