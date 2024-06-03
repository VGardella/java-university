
import java.util.Scanner;

public class EjemploScanner {
    public static void main(String args[]) {
        System.out.println("Escriba su nombre: ");
        Scanner consola = new Scanner(System.in);
        var nombre = consola.nextLine();
        System.out.println("Nuevo usuario: " + nombre);
        
        System.out.println("Escriba un titulo: ");
        var titulo = consola.nextLine();
        System.out.println("Completo: " + titulo + " " + nombre);
    }
}
