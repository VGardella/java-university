package ejercicios;

import java.util.Scanner;

public class PromedioDeCalificaciones {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("¿Cuantas calificaciones tiene que promediar?: ");
        int longArray = Integer.parseInt(console.nextLine());
        int[] calificaciones = new int[longArray];
        
        for (int i = 0; i < longArray; i++) {
            System.out.print("Proprcione la nota nro. " + i + ": ");
            calificaciones[i] = Integer.parseInt(console.nextLine());
        }
        
        float sum = 0;
        
        for (int j = 0; j < longArray; j++) sum += calificaciones[j]; 
    }
}
