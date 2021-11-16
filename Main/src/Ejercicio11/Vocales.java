package Ejercicio11;

import java.util.*;
public class Vocales {

    public static void count(String cadena){
        for(char c: cadena.toCharArray()){
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        String txt = captura.nextLine();
        int longitud = txt.length();
        count("AAAAAAAAAAAAAAAAAAAAA");
        System.out.println();
    }
}
