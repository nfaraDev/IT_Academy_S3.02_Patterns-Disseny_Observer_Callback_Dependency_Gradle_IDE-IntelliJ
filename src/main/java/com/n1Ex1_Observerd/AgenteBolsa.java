package com.n1Ex1_Observerd;

import java.util.ArrayList;
import java.util.List;

public class AgenteBolsa {
    // Esta clase AgenteBolsa actúa como el obj Observable

    private List<AgenciasBolsa> agencias = new ArrayList<>(); //mantiene una lista de agencias de bolsa registradas como observadores
    private double valorBolsa;

    public void addObserver(AgenciasBolsa agencia) {
        agencias.add(agencia);

    }
    public void removeObserved(AgenciasBolsa agencia) {
        agencias.remove(agencia);

    }
    /*Cuando se actualiza el valor de la bolsa mediante el método setValorBolsa(), se notifica a cada agencia de bolsa
     registrada llamando al método update() en cada una de ellas*/
    public void setValorBolsa(double valorBolsa) {

        if(valorBolsa > this.valorBolsa) {
            notifyObservers("La Bolsa ha subido");
        } else if (valorBolsa < this.valorBolsa) {
            notifyObservers("La bolsa ha bajado");
        }
        this.valorBolsa = valorBolsa;
    }
    private void notifyObservers (String mensaje){

        for (AgenciasBolsa agencia : agencias){
            agencia.update(mensaje);
        }

    }
}
