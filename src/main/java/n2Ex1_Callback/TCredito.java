package n2Ex1_Callback;

public class TCredito implements FormaPago{
    //Clase que implementa la interfaz FormaPago

    @Override
    public void pagar(Object objetoPago) {
        System.out.println("Pago realizado con Tarjeta de credito por la compra de " + objetoPago);
    }

}
