package Ejercicio2;
import java.util.*;
public class ConsolaMayorValor {


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

        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese un número");
        String var1 = captura.nextLine();
        double n1 = Double.parseDouble(var1);
        System.out.println("Ingrese su segundo número");
        String var2 = captura.nextLine();
        double n2 = Double.parseDouble(var2);

        String x = comparar(n1,n2);
        System.out.println(x);
    }
}
