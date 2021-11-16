package Ejercicio6;
import java.util.*;
public class ParImparFor{
    public static void main(String[] args) {
        for(int i = 1;i<101;i++){
            String resultado = (i%2==0) ? i+ ": Par":i+ ": Impar";
            System.out.println(resultado);
        }
    }
}