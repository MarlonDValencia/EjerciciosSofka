package Ejercicio16;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = captura.nextLine();
        System.out.println("Ingrese su edad");
        int edad = Integer.parseInt(captura.nextLine());
        System.out.println("Ingrese su sexo [M o H]");
        String sexo = captura.nextLine();
        System.out.println("Ingrese su peso en kg (Ej. 80)");
        double peso = Double.parseDouble(captura.nextLine());
        System.out.println("Ingrese su altura en metros (Ej. 1.7)");
        double altura = Double.parseDouble(captura.nextLine());

        Persona persona1 = new Persona(nombre,edad,sexo,altura,peso);
        Persona persona2 = new Persona(nombre,edad,sexo);
        Persona persona3 = new Persona();

        System.out.println(persona1.calcularIMC());
        System.out.println(persona2.calcularIMC());
        System.out.println(persona3.calcularIMC());

        System.out.println(persona1.esMayorDeEdad());
        System.out.println(persona2.esMayorDeEdad());
        System.out.println(persona3.esMayorDeEdad());

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
    }
}
