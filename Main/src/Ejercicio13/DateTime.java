package Ejercicio13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime fecha = LocalDateTime.now();
        String x = fecha.format(DateTimeFormatter.ofPattern("YYYY/MM/dd HH:mm:ss"));
        System.out.println("La hora y fecha actual es "+x);
    }
}