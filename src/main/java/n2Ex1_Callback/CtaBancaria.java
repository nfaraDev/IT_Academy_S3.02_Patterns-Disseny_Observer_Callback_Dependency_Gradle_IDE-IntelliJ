package n2Ex1_Callback;

public class CtaBancaria implements FormaPago {
    //Clase que implementa la interfaz FormaPago

    @Override
    public void pagar (Object objetoPago) {
        System.out.println("Pago realizado con Cuenta Bancaria por la compra de "+ objetoPago);
    }

}
