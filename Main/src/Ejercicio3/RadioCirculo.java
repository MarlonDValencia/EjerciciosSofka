package Ejercicio3;
import java.util.*;

public class RadioCirculo{


    public static String radio(double n1) {
        return "El area del circulo es "+((Math.PI)*(Math.pow(n1,2)))+" centimetros cuadrados";
    }
    public static void main(String[] args) {

        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        String radius = captura.nextLine();
        double n1 = Double.parseDouble(radius);
        String area = radio(n1);
        System.out.println(area);

    }
}
