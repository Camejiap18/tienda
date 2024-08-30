package co.edu.uniquindio.poo.model;

public enum Tipo {
    REFRIGERADOS (0.10),
    PERECEDEROS (0.15),
    NO_PERECEDEROS (0.05);

    public double incremento;

    //Constructor de la clase
    private Tipo(double incremento){
        this.incremento = incremento;

    }

    //Método get 
    public double getIncremento() {
        return incremento;
    }

}
