package Ejercicio15;

import java.util.Scanner;

public class Menu {
    public static void MostrarMenu(){
        System.out.println("Selecciona una opción: ");
        System.out.println("****** GESTION CINEMATOGRÁFICA ********");
        System.out.println("1-NUEVO ACTOR");
        System.out.println("2-BUSCAR ACTOR");
        System.out.println("3-ELIMINAR ACTOR");
        System.out.println("4-MODIFICAR ACTOR");
        System.out.println("5-VER TODOS LOS ACTORES");
        System.out.println("6- VER PELICULAS DE LOS ACTORES");
        System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
        System.out.println("8-SALIR");
    }
    public static void main(String[] args) {
        MostrarMenu();
        while(true){
            Scanner captura = new Scanner(System.in);
            String var1 = captura.nextLine();
            int n1 = Integer.parseInt(var1);
        switch (n1) {
            case 1,2,3,4,5,6,7 -> MostrarMenu();
            case 8 -> System.exit(0);
            default -> {
                System.out.println("Opción incorrecta");
                MostrarMenu();}
        }
        }
    }
}
