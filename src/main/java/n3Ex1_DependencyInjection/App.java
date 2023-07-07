package n3Ex1_DependencyInjection;


import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        //creamos la instancia de la clase ConvertidorMoneda
        ConvertirdorMoneda convertidor= new ConvertirdorMoneda();

        //creamos la instancia de la clase PrecioArticulos con la inyeccion de dependencia
        PrecioArticulos precioArticulos = new PrecioArticulos(convertidor);

        //crear mapa de precios de los articulos
        Map<String,Double> precios = new HashMap<>();
        precios.put("EUR",9.5);
        precios.put("USD",10.1);
        precios.put("JPY",4.0);
        precios.put("GBP",7.1);

        //mostrar los precios de los articulos en diferentes monedas
        precioArticulos.mostrarPrecios(precios);

    }
}

