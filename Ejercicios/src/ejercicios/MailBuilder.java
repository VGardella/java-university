package ejercicios;

public class MailBuilder {
     public static void main(String args[]) {
        System.out.println("*** Formateo de Cadenas ***");
        var nombre = "Matias";
        var edad = 35;
        var salario = 21000.50;
        
        // String.format
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: %.2f", nombre, edad, salario);
        
        //System.out.printf()
        var mensaje2 = System.out.printf("Nombre: %s, Edad: %d, Salario: %.2f", nombre, edad, salario);
        
        // Formateo con text block:
//        var mensaje3 = """
//                    %nDetalle Persona: \s
//                    ---------------------
//                    \tNombre: %s
//                    """.formatted(nombre);
//						        
//         System.out.println("mensaje3 = " + mensaje3);
    }
}
