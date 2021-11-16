package Ejercicio10;
import java.util.Scanner;
public class noSpaces {
    public static void main(String[] args) {
        System.out.println("Escribe una frase");
        Scanner captura = new Scanner(System.in);
        String txt = captura.nextLine();
        System.out.println(txt.replace(" ",""));
    }
}
