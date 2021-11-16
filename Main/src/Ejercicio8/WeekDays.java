package Ejercicio8;
import java.util.Scanner;
public class WeekDays {
    public static void main(String[] args) {
        System.out.println("Ingresa un día de la semana:");
        System.out.println("1. Lunes\n2. Martes\n3. Miercoles\n4. Jueves\n5. Viernes\n6. Sábado\n7. Domingo");
        Scanner captura = new Scanner(System.in);
        String num = captura.nextLine();
        switch (num){
            case "1":
                System.out.println("Es un día laboral");
                break;
            case "2":
                System.out.println("Es un día laboral");
            case "3":
                System.out.println("Es un día laboral");
                break;
            case "4":
                System.out.println("Es un día laboral");
            case "5":
                System.out.println("Es un día laboral");
                break;
            case "6":
                System.out.println("Es un día laboral");
                break;
            case "7":
                System.out.println("No es un día laboral");
                break;
            }
    }
}
