package Ejercicio14;

import java.util.Scanner;

public class TwoByTwo {
    public static void main(String[] args) {
        System.out.println("Escribe un numero");
        Scanner captura = new Scanner(System.in);
        String var1 = captura.nextLine();
        int n1 = Integer.parseInt(var1);
        while(n1<=1000){
            System.out.println(n1);
            n1+=2;
        }
        System.out.println("El número límite es 1000");
    }
}
