package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    public String nombre;
    private List<Producto> productos;

    //Método constructor
    public Tienda(String nombre){
        this.nombre = nombre;
        assert nombre!= null && !nombre.isBlank();
        this.productos = new ArrayList<>();

    }

    //Método para agregar productos
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    //Método para mostrar los productos, tipos y precios
    public void listaProductos(){
        for (Producto producto : productos){
            System.out.println("Producto: " + producto.getNombre() + ", Tipo: " + producto.getTipo() + ", Precio de compra: $" + producto.getPrecioCompra() + ", Precio de venta: $" + producto.calcularIncremento());
        }
    }


    //Método get
    public String getNombre() {
        return nombre;
    } 

    //Método set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
