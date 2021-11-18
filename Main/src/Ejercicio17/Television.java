package Ejercicio17;

public class Television extends Electrodomestico{
    private double resolucion = 20.0;
    private boolean sintonizador_TDT = false;

    public Television(double v, String blanco, char f, double v1){
        super();
    }
    public Television(double precio, double peso){
        super();
        this.precioBase = precio;
        this.peso = peso;
    }
    public Television(double resolucion,boolean sintonizador_TDT){
        super();
        this.resolucion = resolucion;
        this.sintonizador_TDT = sintonizador_TDT;
    }
    public double getResolucion() {
        return resolucion;
    }
    public boolean isSintonizador_TDT() {
        return sintonizador_TDT;
    }

    public double precioFinal(){
        super.precioFinal();
        if(this.resolucion > 40.0){
            this.precioBase += this.precioBase*0.30;
        }if(this.sintonizador_TDT){
            this.precioBase += 50.0;
        }
        return precioBase;
    }
}
