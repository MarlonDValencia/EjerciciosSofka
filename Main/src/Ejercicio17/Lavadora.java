package Ejercicio17;

public class Lavadora extends Electrodomestico{
    private double carga = 5.0;

    public Lavadora(){
        super();
    }
    public Lavadora(double precio,double peso){
        super();
        this.precioBase = precio;
        this.peso = peso;
    }

    public Lavadora(double carga){
        super();
        this.carga = carga;
    }
    public double getCarga() {
        return carga;
    }
    public double precioFinal(){
        super.precioFinal();
        if(this.carga > 30.0){
            this.precioBase += 50.0;
        }
        return precioBase;
    }
}
