package Ejercicio9;
import java.util.Scanner;
public class Text {
    public static void main(String[] args) {
        String texto = "La sonrisa sera la mejor arma contra la tristeza ";
        String aLessText = texto.replace("a","e");
        System.out.println("Escribe una frase para concatenar");
        Scanner captura = new Scanner(System.in);
        String txt = captura.nextLine();
        String textoFinal = aLessText.concat(txt);
        System.out.println(textoFinal);
        }
    }
