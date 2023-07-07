package n2Ex1_Callback;

public class Paypal implements FormaPago {
    //Clase que implementa la interfaz FormaPago

    public void pagar (Object objetoPago) {
         System.out.println("Pago realizado con Paypal por la compra de " + objetoPago);

    }
}
