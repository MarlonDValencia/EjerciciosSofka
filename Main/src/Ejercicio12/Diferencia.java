package Ejercicio12;

import java.util.*;

public class Diferencia {
    public static void main(String[] args) {
        System.out.println("Ingresa la primera palabra");
        Scanner captura = new Scanner(System.in);
        String txt1 = captura.nextLine();
        String[] array1 = (txt1.toLowerCase()).split("");
        System.out.println("Ingresa la segunda palabra");
        String txt2 = captura.nextLine();
        String[] array2 = (txt2.toLowerCase()).split("");

        List<String> array3;
        array3 = new ArrayList<>();

        if(array1.length > array2.length){
            for(int i = 0;i<array1.length;i++){
                if(Arrays.asList(array2).contains(array1[i])){
                }else{
                    array3.add(array1[i]);
                }
            }
        }else{
            for(int i = 0;i<array2.length;i++){
                if(Arrays.asList(array1).contains(array2[i])){
                }else{
                    array3.add(array2[i]);
                }
            }
        }
        System.out.println(array3);
    }
}
