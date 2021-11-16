package Ejercicio4;
import java.util.*;

public class IVA{
    public static String IncluirIva(double n1) {
        return "El precio del producto luego de aplicar el impuesto de valor agregado (IVA) es $"+n1*1.21;
    }
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        String price = captura.nextLine();
        double n1 = Double.parseDouble(price);
        String total = IncluirIva(n1);
        System.out.println(total);
    }
}
