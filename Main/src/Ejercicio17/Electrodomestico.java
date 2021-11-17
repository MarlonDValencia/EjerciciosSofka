package Ejercicio17;
import java.util.*;
public class Electrodomestico {
    private double precioBase = 100.0;
    private String color = "blanco";
    private char consumoEnergetico = 'F';
    private double peso = 5.0;

    public Electrodomestico() {
    }
    public Electrodomestico(double precioBase, double peso){

    }
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    private boolean comprobarConsumoEnergetico(char Letra){
        switch (Character.toUpperCase(Letra)){
            case 'A', 'B', 'C', 'D', 'E', 'F' -> {
                return true;
            }
            default -> {
                this.consumoEnergetico = 'F';
                return false;
            }
        }
    }
    private boolean comprobarColor(String color){
        switch (color.toLowerCase()){
            case "blanco","negro","rojo","azul","gris" -> {
                return true;
            }
            default -> {
                this.color = "blanco";
                return false;
            }
        }
    }
    public void precioFinal(){
        HashMap <Character, Double> precioConsumo = new HashMap <Character, Double> ();
        precioConsumo.put('A', 100.0);
        precioConsumo.put('B', 80.0);
        precioConsumo.put('C', 60.0);
        precioConsumo.put('D', 50.0);
        precioConsumo.put('E', 30.0);
        precioConsumo.put('F', 10.0);
        this.precioBase += precioConsumo.get(this.consumoEnergetico);
        if((this.peso >= 0.0) && (this.peso <= 19.0)){
            this.precioBase += 10.0;
        }else if((this.peso >= 20.0) && (this.peso <= 49.0)){
            this.precioBase += 50.0;
        }else if((this.peso >= 50.0) && (this.peso <= 79.0)){
            this.precioBase += 80.0;
        }else if((this.peso >= 80.0)){
            this.precioBase += 100.0;
        }
    }
}
