package n2Ex1_Callback;

public class App {
    public static void main(String[] args) {


        // En la clase Main, se crea una instancia de PasarelaPago
        PasarelaPago pasarelaPago = new PasarelaPago();


        //se crean instancias  de las clases concretas que implementan FormaPago
        FormaPago tarjetaCredito = new TCredito();
        FormaPago paypal = new Paypal();
        FormaPago cuentaBancaria = new CtaBancaria();

        //Registra las formas de pago en la pasarela y realiza un pago
        pasarelaPago.addObserver(tarjetaCredito);
        pasarelaPago.addObserver(paypal);
        pasarelaPago.addObserver(cuentaBancaria);


        //Elimina la forma de pago hecha con Paypal
        pasarelaPago.removeObserver(paypal);

        //Se llama al método realizarPago(), se invoca el método pagar() en cada una de las formas de pago registradas
        pasarelaPago.realizarPago("Zapatos");

    }

}
