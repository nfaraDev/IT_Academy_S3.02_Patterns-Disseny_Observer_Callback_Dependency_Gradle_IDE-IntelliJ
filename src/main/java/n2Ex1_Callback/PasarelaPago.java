package n2Ex1_Callback;

import java.util.ArrayList;
import java.util.List;

public class PasarelaPago {
    // Esta clase PasarelaPago que actúe como el objeto Observable
    private List<FormaPago>formasPago= new ArrayList<>();
    public void addObserver(FormaPago formaPago) {
        formasPago.add(formaPago);
    }
    public void removeObserver(FormaPago formaPago) {
        formasPago.remove(formaPago);

    }
    public void realizarPago(Object objetoPago) {
        for (FormaPago formaPago : formasPago) {
            formaPago.pagar(objetoPago);
        }

    }

}
