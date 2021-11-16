package Ejercicio1;

public class MayorValor {
    public static String comparar(double n1, double n2) {
        if (n1>n2){
            return "El número mayor es " + String.valueOf(n1);
        }
        else if (n1<n2){
            return "El número mayor es " + String.valueOf(n2);
        }
        return "Los numeros son iguales";
    }
    public static void main(String[] args) {
        double var1;
        double var2;

        String x = comparar(1,1);
        System.out.println(x);
        }
    }
