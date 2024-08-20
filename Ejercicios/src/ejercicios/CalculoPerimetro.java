package ejercicios;

import java.util.Scanner;

public class CalculoPerimetro {
    public static void main(String args[]) {
        var console = new Scanner(System.in);
        
        System.out.println("Proporciona el alto:");
        var alto = Float.parseFloat(console.nextLine());
        System.out.println("Proporciona el ancho:");
        var ancho = Float.parseFloat(console.nextLine());
        
        var area = alto * ancho;
        var perimetro = 2 * alto + 2 * ancho;
        
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
        
    }
}
