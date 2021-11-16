package Ejercicio11;
import java.util.*;
public class Vocales {
    public static int[] count(String cadena){
        int counter[] = {0,0,0,0,0};
            for(int i = 0;i<cadena.length();i++){
                switch (String.valueOf((cadena.toLowerCase()).charAt(i))) {
                    case "a" -> counter[0]++;
                    case "e" -> counter[1]++;
                    case "i" -> counter[2]++;
                    case "o" -> counter[3]++;
                    case "u" -> counter[4]++;
                }
            }
            return counter;
        }
    public static void main(String[] args) {
        System.out.println("Ingresa una frase");
        Scanner captura = new Scanner(System.in);
        String txt = captura.nextLine();
        int[] x = count(txt);
        System.out.println("La frase tiene una longitud de " +txt.length()+" caracteres.");
        System.out.println("Contador de vocales:\nA: "+x[0]+"\nE: "+x[1]+"\nI: "+x[2]+"\nO: "+x[3]+"\nU: "+x[4]);
    }
}
