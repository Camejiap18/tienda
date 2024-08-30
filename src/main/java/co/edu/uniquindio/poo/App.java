package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.model.Producto;
import co.edu.uniquindio.poo.model.Tienda;
import co.edu.uniquindio.poo.model.Tipo;


/**
 * Hello world!
 *
 */
public class App {
    
    public static void main(String[] args) {
        Tienda tienda = new Tienda("Donde Cami");
        Producto producto1 = new Producto("Leche", 4500.0, Tipo.REFRIGERADOS);
        Producto producto2 = new Producto("Jamón", 17500.0, Tipo.PERECEDEROS);
        Producto producto3 = new Producto("Bombones", 1000.0, Tipo.NO_PERECEDEROS);
        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);
        tienda.agregarProducto(producto3);
        tienda.listaProductos();
    }

}
