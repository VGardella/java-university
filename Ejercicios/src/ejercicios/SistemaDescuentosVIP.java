package ejercicios;
import java.util.Scanner;

public class SistemaDescuentosVIP {
    public static void main(String[] args) {
        System.out.println("**** SISTEMA DE DESCUENTOS VIP ****");
        var console = new Scanner(System.in);
        final var NO_PRODUCTOS_COMPRADOS = 10;
        
        System.out.println("¿Cuantos artículos compró?:");
        var noArticulosComprados = console.nextInt();
        
        System.out.println("¿Tiene membresia VIP? (true/false):");
        var tieneMembresiaVIP = console.nextBoolean();
        
        var esElegibleDescuento = noArticulosComprados >= NO_PRODUCTOS_COMPRADOS && tieneMembresiaVIP == true;
        System.out.println("Tiene acceso al descuento?: " + esElegibleDescuento);

//        if (esElegibleDescuento) {
//            System.out.println("Usted cuenta con el descuento");
//        } else {
//            System.out.println("Usted no cuenta con el descuento");
//        }
        
    }
}
