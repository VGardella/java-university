package ejercicios;

import java.util.Scanner;

public class PrecioDeProducto {
    public static void main(String args[]) {
        var console = new Scanner(System.in);
        
        System.out.println("Proporciona el nombre: ");
        String nombre = console.nextLine();
        
        System.out.println("Proporciona el id: ");
        int id = Integer.parseInt(console.nextLine());
        
        System.out.println("Proporciona el precio: ");
        double precio = Double.parseDouble(console.nextLine());
        
        System.out.println("Proporciona el envio gratuito: ");
        boolean envioGratuito = Boolean.parseBoolean(console.nextLine());
        
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: \u0024" + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
    }
}
