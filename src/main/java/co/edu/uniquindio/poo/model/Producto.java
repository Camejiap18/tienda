package co.edu.uniquindio.poo.model;

public class Producto {
    public String nombre;
    public double precioCompra;
    public Tipo tipo;

    //Método constructor
    public Producto(String nombre, double precioCompra, Tipo tipo){
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.tipo = tipo;

    }

    //Método para calcular el incremento
    public double calcularIncremento(){
        return precioCompra + (precioCompra*tipo.getIncremento());
    }

    //Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    
}
