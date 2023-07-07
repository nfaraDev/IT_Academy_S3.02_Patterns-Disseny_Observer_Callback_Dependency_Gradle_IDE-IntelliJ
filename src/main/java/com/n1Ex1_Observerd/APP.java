package com.n1Ex1_Observerd;

public class APP {
    public static void main(String[] args) {
        // Esta clase Main, crea una instancia de AgenteBolsa y varias instancias de AgenciaBolsa
        AgenteBolsa agenteBolsa = new AgenteBolsa();

        AgenciasBolsa agencia1= new AgenciasBolsa("eToro ");
        AgenciasBolsa agencia2 = new AgenciasBolsa("Plus500");
        AgenciasBolsa agencia3 = new AgenciasBolsa("XTB");

        //Registra las agencias en el agenteBolsa que correspona
        agenteBolsa.addObserver(agencia1);
        agenteBolsa.addObserver(agencia2);

        //Elimina la agencia3 en el agenteBolsa correspondiente
        agenteBolsa.removeObserved(agencia3);


       // Actualiza el valor de la bolsa para notificar a las agencias
        agenteBolsa.setValorBolsa(500);
        agenteBolsa.setValorBolsa(2300);
        agenteBolsa.setValorBolsa(1200);

    }
}
