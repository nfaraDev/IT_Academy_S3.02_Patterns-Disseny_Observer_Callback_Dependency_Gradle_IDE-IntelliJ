package n3Ex1_DependencyInjection;

import java.util.Map;

//Clase principal muestra el precio de los articulos en diferentes monedas
public class PrecioArticulos {
    //atributos
    private ConvertirdorMoneda convertidor ;

    // Constructor que recibe una instancia de la clase ConvertidorMoneda
    public PrecioArticulos(ConvertirdorMoneda convertidor) {
         this.convertidor = convertidor;
    }
    //metodo para mostrar el precio de los articulos en diferentes monedas
    public void mostrarPrecios(Map<String,Double> precios) {
        //logica for each
        for (Map.Entry<String, Double> entry : precios.entrySet()) {
            String moneda = entry.getKey();
            Double precio = entry.getValue();
            Double precioConvertido = convertidor.convertir(precio, moneda);
            System.out.println("Precio en " + moneda + ": " + precioConvertido);

        }

    }
}

