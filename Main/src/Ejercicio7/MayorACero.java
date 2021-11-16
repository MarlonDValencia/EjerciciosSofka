package Ejercicio7;
import java.util.*;
public class MayorACero {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        float numero;
        do{
            System.out.println("Ingresa un número mayor o igual a cero");
            String num = captura.nextLine();
            numero = Float.parseFloat(num);
        }while(numero < 0);
    }
}
