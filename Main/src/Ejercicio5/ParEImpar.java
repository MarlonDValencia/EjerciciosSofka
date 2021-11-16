package Ejercicio5;
import java.util.*;
public class ParEImpar{
    public static void main(String[] args) {
        int num = 1;
        while(num < 101){
            String resultado = (num %2==0) ? num+ ": Par":num+ ": Impar";
                num++;
            System.out.println(resultado);
            }
        }
    }